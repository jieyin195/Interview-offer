package 揭尹.线程.生产者消费者;

/**
 * Created by Jline on 2019/3/18.
 */
public class getStudentThread implements Runnable {
    private Student s;

    public getStudentThread(Student s){
        this.s=s;
    }

    @Override
    public void run() {
        while(true)
        s.get();
    }
}
