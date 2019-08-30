package 揭尹.设计模式.多线程的单例.双重校验的单例模式;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/8/5
 * \* Time: 10:38
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
/**
 * 多线程的单例模式，使用双重校验机制
 * 这样的写法就能够做到效率和安全的双重保证。
 */
public class Singleton {

    private static volatile Singleton singleton;
    private Singleton() {}
    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}