package 朱磊.DesignMode.观察者模式;

/**
 * @Author: zl
 * @Date: 2019/4/2 11:23
 * @Description: 抽象被观察者角色(Subject)：
 *              也就是一个抽象主题，它把所有对观察者对象的引用保存在一个集合中，每个主题都可以有任意数量的观察者。
 *              抽象主题提供一个接口，可以增加和删除观察者角色。一般用一个抽象类和接口来实现。
 */
public interface Observerable {
    // 添加观察者
    public void registerObserver(Observer o);
    // 删除观察者
    public void removeObserver(Observer o);
    // 通知观察者
    public void notifyObserver();
}
