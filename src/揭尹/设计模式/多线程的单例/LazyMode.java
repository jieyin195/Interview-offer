package 揭尹.设计模式.多线程的单例;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/8/5
 * \* Time: 10:37
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \代码还是有点性能问题的，因为同步锁的机制，多个线程获取类实例对象会排队等待获取锁，这样是没必要的，
 * 因为大多数情况下类实例对象都已经创建成功了，所以不用进入加锁的代码块
 */
public class LazyMode {

    private static volatile LazyMode sLazyMode;

    private LazyMode() {
        System.out.println("create " + getClass().getSimpleName());
    }

    public static LazyMode getInstance(){
        synchronized (LazyMode.class) {
            if (sLazyMode == null) {
                sLazyMode = new LazyMode();
            }
        }
        return sLazyMode;
    }

}