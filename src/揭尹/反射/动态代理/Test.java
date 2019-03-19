package 揭尹.反射.动态代理;

import java.lang.reflect.Proxy;

/**
 * Created by Jline on 2019/3/19.
 */
public class Test {
    public static void main(String[] args){
        StudentDao s = new Student();
        myInvocationHandler handler = new myInvocationHandler(s);
        StudentDao proxy = (StudentDao) Proxy.newProxyInstance
                (s.getClass().getClassLoader(),s.getClass().getInterfaces(),handler);
        proxy.login();
        proxy.exit();
        proxy.show("jieyin",20);

    }
}
