package 揭尹.JVM之初尝类加载.子类父类加载;

/**
 * Created by Jline on 2019/4/15.
 */

class supClass{
    static {
        System.out.println("supClass");
    }
    public static int value=10;
}

class subClass extends supClass{
    static {
        System.out.println("subClass");
    }
    //static int value=11;1去·   11
}
public class subAndsup {
    public static void main( String[] args ) {
        //System.out.println(subClass.value);
        System.out.println(subClass.value);
        //System.out.println(subClass.value);

    }
}
