package 揭尹.线程.线程买票;

/**
 * Created by Jline on 2019/3/18.
 */
public class ThreadTicketDemo {
    public static void main( String[] args ) {
        ThreadTicket tt = new ThreadTicket();

        Thread t1 = new Thread(tt,"窗口1");
        Thread t2 = new Thread(tt,"窗口2");
        Thread t3 = new Thread(tt,"窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
