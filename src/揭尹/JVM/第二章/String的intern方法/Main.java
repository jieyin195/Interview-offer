package 揭尹.JVM.第二章.String的intern方法;

/**
 * Created by Jline on 2019/4/26.
 */
public class Main {
    public static void main( String[] args ) {
        //first();

        String s3 = new String("1") + new String("1");

        String s5 =s3.intern();

        String s4 = s5;




        System.out.println(s5 == s4);
    }

    private static void first() {
        String str1 = new StringBuilder("计算机").append("软件").toString();
        String a = str1.intern();
        System.out.println(a==str1);

        String str2 = new StringBuilder("ja").append("va").toString();
        String s =str2.intern();
        System.out.println(s==str2);
    }
}
