package 揭尹.华为机试.输出一个新数组_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by Jline on 2019/4/4.
 */
public class Main {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
       // StringBuilder sb = LinkedListMethod(sc, N);
        StringBuilder sb= new StringBuilder();
        arrayListMethod(sc, N, sb);
        String s =sb.toString();
        s=s.substring(0,s.length()-1);
        System.out.println(s);
    }

    private static void arrayListMethod( Scanner sc, int n, StringBuilder sb ) {
        ArrayList<ArrayList<String>> quque = new ArrayList<>();
        while(sc.hasNext()){
            ArrayList<String> arrayList =new ArrayList<>();
            String str = sc.next();
            if(str.equals("a"))break;
            String[] strArr = str.split(",");
            for (String s:strArr)
                arrayList.add(s);
            quque.add(arrayList);
        }
        while(!quque.isEmpty()){
            ArrayList<String> arrayList =quque.remove(0);
            if(n <=arrayList.size()){
                for (int i = 0; i < n; i++) {
                    sb.append(arrayList.remove(0)+",");
                }
                if(!arrayList.isEmpty()){
                    quque.add(arrayList);
                }
            }
            else{
                for (int i = 0; i < arrayList.size(); ) {
                    sb.append(arrayList.remove(0)+",");
                }
            }
        }
    }

    private static StringBuilder LinkedListMethod( Scanner sc, int n ) {
        LinkedList<LinkedList> quque = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        while(sc.hasNext()){
            LinkedList<String> linkedList =new LinkedList<>();
            String str = sc.next();
            if(str.equals("a"))break;
            String[] strArr = str.split(",");
            for (String s:strArr)
                linkedList.add(s);
            quque.add(linkedList);
        }
        while(!quque.isEmpty()){
            LinkedList<String> linkedList =quque.remove();
            if(n <=linkedList.size()){
                for (int i = 0; i < n; i++) {
                    sb.append(linkedList.remove()+",");
                }
                if(!linkedList.isEmpty()){
                    quque.add(linkedList);
                }
            }
            else{
                for (int i = 0; i < linkedList.size(); ) {
                    sb.append(linkedList.remove()+",");
                }
            }
        }
        return sb;
    }
}
