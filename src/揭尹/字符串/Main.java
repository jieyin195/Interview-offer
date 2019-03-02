package 揭尹.字符串;

/**
 * Created by Jline on 2019/2/26.
 */
public class Main {
    public static void main( String[] args ) {
        /**
         *   在方法区的字符串常量池中存在了 0x001的hello，但是对象是在堆中创建，假设new
         *   String 创建的对象的内存地址是0x01，栈中的str1指向0x01，而堆中的0x01指向0x001，
         *   新的str2直接指向常量池中的0x001，所以str1==str2 是false.
         */


        String str1= new String("hello");
        String str2 = "hello";
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));

    }

}
