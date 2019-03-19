package 揭尹.反射.成员变量;

import java.lang.reflect.Field;

/**
 * Created by Jline on 2019/3/17.
 */
public class Test {
    public static void main( String[] args ) throws Exception {
        Class clazz = Class.forName("揭尹.反射.成员变量.Student");
        Field f = clazz.getField("name");
        Object obj = clazz.getConstructor().newInstance();
        f.set(obj,"揭尹");
        Student s = (Student)obj;
        System.out.println(s.name);

        System.out.println("-----------------------");
        f = clazz.getDeclaredField("phoneNum");
        f.setAccessible(true);
        f.set(obj,"15581635720");
        System.out.println(s.toString());
    }
}
