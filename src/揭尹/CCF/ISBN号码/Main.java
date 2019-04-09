package 揭尹.CCF.ISBN号码;

import java.util.Scanner;

/**
 * Created by Jline on 2019/4/7.
 */
public class Main {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] arrStr = str.split("-");
        str="";
        for (int i = 0; i < arrStr.length; i++) {
            str+=arrStr[i];
        }
        int sum=0;
        StringBuilder sb= new StringBuilder();
        for (int i = 0; i < str.length()-1; i++) {
            sum+=Integer.parseInt(str.charAt(i)+"")*(i+1);
        }
        if(sum%11<10 && (sum%11+"").equals(str.charAt(str.length()-1)+"")){
                System.out.println("Right");
                return;
        }else if(sum%11==10 && "X".equals(str.charAt(str.length()-1)+"")){
            System.out.println("Right");
            return;
        }else {
            for (int i = 0; i < str.length(); i++) {
                if(i==1||i==4) {
                    sb.append("-");
                }
                if(i==9){
                    sb.append("-");
                    break;
                }
                sb.append(str.charAt(i));
            }
            if(sum%11<10)
                sb.append(sum%11);
            else
                sb.append("X");
        }
        System.out.println(sb.toString());
    }
}
