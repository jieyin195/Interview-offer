package 揭尹.反射.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Jline on 2019/3/19.
 */
public class myInvocationHandler implements InvocationHandler {
    private Object target;
    myInvocationHandler(Object target){
         this.target = target;
    }
    @Override
    public Object invoke( Object proxy, Method method, Object[] args ) throws Throwable {
        System.out.println("身份校验");
        Object result = method.invoke(target,args);
        System.out.println("日志记录");
        return result;
    }
}
