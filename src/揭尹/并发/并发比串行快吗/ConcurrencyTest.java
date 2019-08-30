package 揭尹.并发.并发比串行快吗;

import java.util.concurrent.locks.ReentrantLock;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/6/7
 * \* Time: 11:04
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class ConcurrencyTest {
    private static final long count = 100001;

    public static void main( String[] args ) throws InterruptedException {
        concurrency();
        serial();
    }

    private static void serial() {
        long start = System.currentTimeMillis();
        int a =0;
        for (int i = 0; i < count; i++) {
            a+=5;
        }
        int b =0;
        for (int i = 0; i < count; i++) {
            b--;
        }
        long time = System.currentTimeMillis()-start;
        System.out.println("serial:"+time+"ms,b="+b+",a="+a);
    }

    private static void concurrency() throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int a =0;
                for (int i = 0; i < count; i++) {
                    a+=5;
                    System.out.println(a);

                }
            }
        });
        thread.start();
        int b= 0;

        for (int i = 0; i < count; i++) {
            b--;
            System.out.println(b);
        }
        thread.join();
        long time = System.currentTimeMillis()-start;
        System.out.println("concurrency:"+time+"ms,b="+b);
    }
}
