package 揭尹.我总结的问题;

/**
 * Created by Jline on 2019/2/25.
 */
public class Main2 {

    final int str1 = 1;
    final int str2 = 1;
    final int str3;
    final int str4;
    {
        str3 = 1;
    }
    {
        System.out.println(str1+str1 == str2+str2);//true
        int s1 = str1+str1;
        int s3 = str3+str3;
        System.out.println(s1 == s3);//false
//        System.out.println(str1 == str4);//compile error
    }
    public Main2() {
        str4 = 1;
        System.out.println(str1 == str4);//true
    }

    public static void main(String[] args) {
        new Main2();

    }
}
