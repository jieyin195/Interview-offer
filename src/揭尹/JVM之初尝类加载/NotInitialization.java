package 揭尹.JVM之初尝类加载;

/**
 * Created by Jline on 2019/3/3.
 */

class SuperClass{
    static {
        System.out.println("SuperClass init!");
    }

    public static int value = 123;
}

class SubClass extends SuperClass{
    static {
        System.out.println("SubClass init!");
    }
}
public class NotInitialization {
    public static void main( String[] args ) {
        /*
        类不会被初始化，但是会初试化一个Lorg.揭尹.JVM之初尝类加载.SuperClass的类，他是
        由JVM自动生成的、直接继承与java.lang.Object类，创建动作由字节码指令newarray触发
         */

        SuperClass[] sca = new SuperClass[10];

    }
}
