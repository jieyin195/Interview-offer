package 揭尹.java基础.匿名内部类问题探讨;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/7/21
 * \* Time: 0:56
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Test {
    public static int show(int a ,int b , FatherService fatherService){
        return fatherService.add(a,b);
    }

    public static void main( String[] args ) {
        System.out.println(show(10,20,new Son()));
        System.out.println(show(10, 20, new FatherService() {
            @Override
            public int add( int a, int b ) {
                return a+b+b;
            }
        }));
        System.out.println(show(10,20,(a,b)->b-a));
    }
}
