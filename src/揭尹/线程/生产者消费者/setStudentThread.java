package 揭尹.线程.生产者消费者;

/**
 * Created by Jline on 2019/3/18.
 */
public class setStudentThread implements Runnable{
    private Student s;
    private int x=0;
    public setStudentThread(Student s){
        this.s=s;
    }

    @Override
    public void run() {
        while(true){
            if(x%2==0){
                s.set("jieyin",18);
            }else
                s.set("lss",20);
            x++;
        }
    }
}
