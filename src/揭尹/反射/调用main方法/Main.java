package 揭尹.反射.调用main方法;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Jline on 2019/3/17.
 */
public class Main {
    public static void main( String[] args ) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class clazz = Class.forName("揭尹.反射.调用main方法.Student");
        Method m = clazz.getMethod("main",String[].class);
        m.invoke(null , (Object)new String[]{"a","b","c"});
    }
}
