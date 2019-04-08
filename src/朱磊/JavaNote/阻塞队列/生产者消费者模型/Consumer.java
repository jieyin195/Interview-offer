package 朱磊.JavaNote.阻塞队列.生产者消费者模型;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * @Author: zl
 * @Date: 2019/3/30 15:28
 * @Description: 消费者模块
 */
public class Consumer implements Runnable{

    private BlockingQueue<String> queue;
    private static final int DEFAULT_RANGE_FOR_SLEEP = 1000;

    public Consumer(BlockingQueue<String> queue){
        this.queue = queue;
    }

    @Override
    public void run() {
        boolean isRunning = true;
        Random r = new Random();
        System.out.println("启动消费者线程！");
        try {
            while (isRunning){
                System.out.println("正从队列获取数据...");
                // 取走BlockingQueue里排在首位的对象,若不能立即取出,则可以等time参数规定的时间,取不到时返回null
                String data = queue.poll(2, TimeUnit.SECONDS);//有数据时直接从队列的队首取走，无数据时阻塞，在2s内有数据，取走，超过2s还没数据，返回失败
                if (data != null){
//                    System.out.println("拿到数据：" + data);
                    System.out.println("正在消费数据：" + data);
                    Thread.sleep(r.nextInt(DEFAULT_RANGE_FOR_SLEEP));
                } else
                    isRunning = false;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        } finally {
            System.out.println("退出消费者线程！");
        }
    }
}
