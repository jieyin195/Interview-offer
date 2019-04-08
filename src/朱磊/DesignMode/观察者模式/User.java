package 朱磊.DesignMode.观察者模式;

/**
 * @Author: zl
 * @Date: 2019/4/2 11:29
 * @Description: 具体观察者角色(ConcreteObserver)：
 *              实现抽象观察者角色所需要的更新接口，一边使本身的状态与制图的状态相协调。
 */
public class User implements Observer{

    private String name;
    private String message;

    public User(String name) {
        this.name = name;
    }

    public void read() {
        System.out.println(name + " 收到推送消息： " + message);
    }

    @Override
    public void update(String message) {
        this.message = message;
        read();
    }
}
