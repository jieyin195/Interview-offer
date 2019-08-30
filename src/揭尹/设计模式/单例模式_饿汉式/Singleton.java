package 揭尹.设计模式.单例模式_饿汉式;

/**
 * Created by Jline on 2019/3/19.
 * 饿汉式：饿汉式单例，就是一个私有的构造方法加一个私有的静态当前类实例对象和一个公有的静态获取实例方法组成,0p
 * 优点：这种写法比较简单，就是在类装载的时候就完成实例化。避免了线程同步问题。
 * 缺点：在类装载的时候就完成实例化，没有达到Lazy Loading的效果。如果从始至终从未使用过这个实例，则会造成内存的浪费。
 */
public class Singleton {

    private final static Singleton INSTANCE = new Singleton();
    private Singleton(){}
    public static Singleton getInstance(){
        return INSTANCE;
    }
}
