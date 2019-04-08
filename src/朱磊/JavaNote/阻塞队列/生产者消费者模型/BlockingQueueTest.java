package 朱磊.JavaNote.阻塞队列.生产者消费者模型;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @Author: zl
 * @Date: 2019/3/30 15:36
 * @Description: 因为BlockingQueue是一个阻塞队列，它的存取可以保证只有一个线程在进行，
 *              所以根据逻辑，生产者在内存满的时候进行等待，并且唤醒消费者队列，
 *              反过来消费者在饥饿状态下等待并唤醒生产者进行生产。
 */
public class BlockingQueueTest {

    public static void main(String[] args) throws InterruptedException {

        /*
            如果构造一个LinkedBlockingQueue对象，而没有指定其容量大小，
            LinkedBlockingQueue会默认一个类似无限大小的容量（Integer.MAX_VALUE），
            这样的话，如果生产者的速度一旦大于消费者的速度，也许还没有等到队列满阻塞产生，系统内存就有可能已被消耗殆尽了。
         */
        BlockingQueue<String> queue = new LinkedBlockingQueue<String>(10);

        Producer producer1 = new Producer(queue);
        Producer producer2 = new Producer(queue);
        Producer producer3 = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        ExecutorService service = Executors.newCachedThreadPool();  // 借助Executors
        // 启动线程
        service.execute(producer1);
        service.execute(producer2);
        service.execute(producer3);
        service.execute(consumer);

        Thread.sleep(10 * 1000);
        producer1.stop();
        producer2.stop();
        producer3.stop();

        Thread.sleep(2000);
        service.shutdown(); // 退出Executor
    }
}
