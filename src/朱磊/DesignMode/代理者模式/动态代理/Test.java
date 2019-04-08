package 朱磊.DesignMode.代理者模式.动态代理;

/**
 * @Author: zl
 * @Date: 2019/4/2 17:33
 * @Description: JDK动态代理所用到的代理类在程序调用到代理类对象时才由JVM真正创建，
 *          JVM根据传进来的 业务实现类对象 以及 方法名 ，动态地创建了一个代理类的class文件并被字节码引擎执行，
 *          然后通过该代理类对象进行方法调用。我们需要做的，只需指定代理类的预处
 */

/*
    JDK动态代理的代理对象在创建时，需要使用业务实现类所实现的接口作为参数（因为在后面代理方法时需要根据接口内的方法名进行调用）。
    如果业务实现类是没有实现接口而是直接定义业务方法的话，就无法使用JDK动态代理了。
    并且，如果业务实现类中新增了接口中没有的方法，这些方法是无法被代理的（因为无法被调用）。
 */
public class Test {

    public static void main(String[] args) {
        BookFacadeImpl bookFacadeImpl=new BookFacadeImpl();
        BookFacadeProxy proxy = new BookFacadeProxy();
        BookFacade bookfacade = (BookFacade) proxy.bind(bookFacadeImpl);
        bookfacade.addBook();
    }

}
