package 揭尹.华为机试.进制转换;

import java.util.Scanner;

/**
 * Created by Jline on 2019/4/4.
 */
public class Main {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String str = sc.next();
            str=str.substring(2,str.length());
            int sum=0;
            for (int i = str.length()-1; i >=0; i--) {
                char c =str.charAt(i);
                switch (c){
                    case 'A':
                        sum+=10*(int)Math.pow(16,str.length()-1-i);
                        break;
                    case 'B':
                        sum+=11*(int)Math.pow(16,str.length()-1-i);
                        break;
                    case 'C':
                        sum+=12*(int)Math.pow(16,str.length()-1-i);
                        break;
                    case 'D':
                        sum+=13*(int)Math.pow(16,str.length()-1-i);
                        break;
                    case 'E':
                        sum+=14*(int)Math.pow(16,str.length()-1-i);
                        break;
                    case 'F':
                        sum+=15*(int)Math.pow(16,str.length()-1-i);
                        break;
                        default:
                            sum+=Integer.parseInt(c+"")*(int)Math.pow(16,str.length()-1-i);
                }
            }
            System.out.println(String.valueOf(sum));
        }
        
    }
}
