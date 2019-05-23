package 揭尹.反射.成员方法;

import java.lang.reflect.Method;

/**
 * Created by Jline on 2019/3/17.
 */
public class Test {
    public static void main( String[] args ) throws Exception{
        Class clazz = Class.forName("揭尹.反射.成员方法.Student");
        Method m = clazz.getDeclaredMethod("show4", int.class);
        Object obj = clazz.newInstance();
        m.setAccessible(true);
        m.invoke(obj,20);
    }
}
