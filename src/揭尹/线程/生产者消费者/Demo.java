package 揭尹.线程.生产者消费者;

/**
 * Created by Jline on 2019/3/18.
 */
public class Demo {
    public static void main( String[] args ) {
        Student s = new Student();

        getStudentThread gst = new getStudentThread(s);
        setStudentThread sst = new setStudentThread(s);

        Thread t1 = new Thread(gst);
        Thread t2 = new Thread(sst);

        t1.start();
        t2.start();
    }
}
