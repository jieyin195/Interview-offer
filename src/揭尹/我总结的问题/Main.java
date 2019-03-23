package 揭尹.我总结的问题;

public class Main {

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
    public Main() {
        str4 = "HelloWorld";
        System.out.println(str1 == str4);
    }

    public static void main(String[] args) {
        new Main();

    }
}