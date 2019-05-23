package 揭尹.JVM之初尝类加载.非法向前引用变量;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/5/11
 * \* Time: 18:24
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
 class Test {

    static {
        i = 0;
        //System.out.println(i);
    }
    static int i=1;
}
public class Demo{
    public static void main( String[] args ) {
        new Test();
    }
}
