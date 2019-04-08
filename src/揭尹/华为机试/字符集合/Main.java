package 揭尹.华为机试.字符集合;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 * Created by Jline on 2019/4/5.
 */
public class Main {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            ArrayList<Character> arrayList = new ArrayList<>();
            String str = sc.next();
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if(!arrayList.contains(c))
                    arrayList.add(c);
            }
            String a="";
            for(char c : arrayList){
                a+=c;
            }
            System.out.println(a);
        }
    }
}
