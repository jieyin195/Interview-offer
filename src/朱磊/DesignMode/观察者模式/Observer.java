package 朱磊.DesignMode.观察者模式;

/**
 * @Author: zl
 * @Date: 2019/4/2 11:24
 * @Description: 抽象观察者角色(Observer)：
 *              为所有的具体观察者定义一个接口，在得到主题通知时更新自己。
 */

public interface Observer {
    // 定义了一个update()方法，当被观察者调用notifyObservers()方法时，观察者的update()方法会被回调。
    public void update(String message);
}
