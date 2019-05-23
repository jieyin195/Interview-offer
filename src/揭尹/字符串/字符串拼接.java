package 揭尹.字符串;

public class 字符串拼接 {

    final String str1 = "HelloWorld";
    final String str2 = "Hello" + "World";
    final String str3;
    final String str4;
    {
        str3 = "HelloWorld";
    }
    {
        System.out.println(str1+str1 == str2+str2);
        System.out.println(str1+str1 == str3+str3);
        System.out.println(str1 == str3);
    }
    public 字符串拼接() {
        str4 = "HelloWorld";
        System.out.println(str1 == str4);
    }

    public static void main(String[] args) {
        new 字符串拼接();

    }
}