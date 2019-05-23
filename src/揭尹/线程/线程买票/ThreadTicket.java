package 揭尹.线程.线程买票;

/**
 * Created by Jline on 2019/3/18.
 */
public class ThreadTicket implements Runnable{
    int ticket = 100;

    @Override
    public void run() {
        /**
         * 方法一：同步代码块
         */
        while(true){
            synchronized (this){
                if(ticket>0){
//                    try {
//                        Thread.sleep(100);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                    System.out.println(Thread.currentThread().getName()+":"+ticket--+"票");
                }
           }
        }
        /**
         * 方法二：同步方法
         */
//        while(true){
//            cellTicket();
//        }
    }

//    private synchronized void cellTicket() {
//        if(ticket>0){
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(Thread.currentThread().getName()+":"+ticket--+"票");
//        }
//    }
}
