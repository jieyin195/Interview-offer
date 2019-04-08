package 朱磊.JavaNote.阻塞队列.生产者消费者模型;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: zl
 * @Date: 2019/3/30 13:28
 * @Description:
 */

/*
    note：volatile关键字很重要的两个特性
        1、保证变量在线程间可见，对volatile变量所有的写操作都能立即反应到其他线程中，换句话说，volatile变量在各个线程中是一致的
        2、禁止指令的重排序优化；
 */
public class Producer implements Runnable {

    private volatile boolean isRunning = true;
    private BlockingQueue<String> queue;
    private static AtomicInteger count = new AtomicInteger();   // 自动更新的值
    private static final int DEFAULT_RANGE_FOR_SLEEP = 1000;    // 睡眠时间范围

    public Producer(BlockingQueue<String> queue){
        this.queue = queue;
    }

    @Override
    public void run() {
        String data = null;
        Random random = new Random();

        System.out.println("启动生产者线程！");
        try {
            while (isRunning){
                System.out.println("正在产生数据...");
                Thread.sleep(random.nextInt(DEFAULT_RANGE_FOR_SLEEP));  // [0, DEFAULT_RANGE_FOR_SLEEP)的一个随机数
                data = "data" + count.incrementAndGet(); // count+1，AtomicInteger.incrementAndGet()方法具有原子性
                // offer方法：
                // queue.offer: 将指定元素插入此队列中（如果立即可行且不会违反容量限制），成功时返回 true，如果当前没有可用的空间，则返回 false，不会抛异常
                if (!queue.offer(data, 2, TimeUnit.SECONDS)) // 设定的等待时间为2s，如果超过2s还没加进去则打印输出语句
                    System.out.println("放入数据失败：" + data);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        } finally {
            System.out.println("退出生产者线程！");
        }
    }

    public void stop(){
        isRunning = false;
    }
}
