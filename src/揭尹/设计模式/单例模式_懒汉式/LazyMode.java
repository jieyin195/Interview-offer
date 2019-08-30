package 揭尹.设计模式.单例模式_懒汉式;

/**
 * Created by Jline on 2019/3/19.
 * 单例模式：确保某个类只有一个实例，
 * 懒汉式的重点在于，别人要对象才创建对象，别人不要就为Null。
 * 懒汉式重点在于会有线程安全问题，因为getStudent()方法中有多条语句，所以要加synchronized
 */
public class LazyMode {

    private static LazyMode sLazyMode;

    private LazyMode() {
        System.out.println("create " + getClass().getSimpleName());
    }

    public static LazyMode getInstance(){
        if (sLazyMode == null) {
            sLazyMode = new LazyMode();
        }
        return sLazyMode;
    }

    public static void main(String[] args) {
        LazyMode.getInstance();
    }

}
