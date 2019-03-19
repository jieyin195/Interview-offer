package 揭尹.线程.生产者消费者;

/**
 * Created by Jline on 2019/3/18.
 */
public class Student {
    private String name;
    private int age;
    private boolean flag;

    public synchronized void set(String name,int age ){
        if(this.flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.name=name;
        this.age=age;

        flag=true;
        this.notify();
    }

    public synchronized void get(){
        if(!this.flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(this.name+"----"+this.age);

        flag=false;
        this.notify();
    }
}
