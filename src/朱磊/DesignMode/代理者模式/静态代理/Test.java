package 朱磊.DesignMode.代理者模式.静态代理;

/**
 * @Author: zl
 * @Date: 2019/4/2 17:30
 * @Description: 静态代理的缺点很明显：一个代理类只能对一个业务接口的实现类进行包装，如果有多个业务接口的话就要定义很多实现类和代理类才行。
 *          而且，如果代理类对业务方法的预处理、调用后操作都是一样的（比如：调用前输出提示、调用后自动关闭连接），则多个代理类就会有很多重复代码
 */
public class Test {

    public static void main(String[] args) {
        CountImpl countImpl = new CountImpl();
        CountProxy countProxy = new CountProxy(countImpl);
        countProxy.updateCount();
        countProxy.queryCount();
    }
}
