package 揭尹.华为机试.输出一个新数组;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Jline on 2019/4/3.
 */
public class Main {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        ArrayList<String> list = new ArrayList<>();
        while(sc.hasNext()){
            String str = sc.next();
            if(str.equals("a"))break;
            list.add(str);
        }
        //构建sb来存储字符串
        StringBuilder sb = new StringBuilder();
        int max=0;
        for (int m=0;m<list.size();m++){
            String[] str=list.get(m).split(",");
            max=Math.max(max,str.length);
        }
        int flag=0;
        while(flag<max) {
            for (int i = 0; i < list.size(); i++) {
                String[] str = list.get(i).split(",");
                for (int j = 0; j < len; j++) {
                    if (flag + j < str.length)
                        sb.append(str[flag + j] + ",");
                    else
                        break;
                }
                if (i == list.size() - 1) {
                    flag += len;
                }
            }
        }
        String s =sb.toString();
        s =s.substring(0,s.length()-1);
        System.out.println(s);
    }
}
