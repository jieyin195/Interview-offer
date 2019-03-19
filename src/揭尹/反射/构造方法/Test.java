package 揭尹.反射.构造方法;

import java.lang.reflect.Constructor;

/**
 * Created by Jline on 2019/3/17.
 */
public class Test {
    public static void main( String[] args ) throws Exception{
        Class clazz = Class.forName("揭尹.反射.构造方法.Student");
        Constructor constructor = clazz.getConstructor(String.class,int.class);
        constructor.newInstance("你好",20);

    }
}
