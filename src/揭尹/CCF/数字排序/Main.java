package 揭尹.CCF.数字排序;

import java.util.*;

/**
 * Created by Jline on 2019/4/8.
 */
public class Main {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        LinkedHashMap<Integer,Integer> linkedHashMap = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            int key = sc.nextInt();
            if(linkedHashMap.containsKey(key))
                linkedHashMap.put(key,linkedHashMap.get(key)+1);
            else
                linkedHashMap.put(key,1);
        }
        Set<Map.Entry<Integer,Integer>> set = linkedHashMap.entrySet();
        ArrayList<Map.Entry<Integer,Integer>> arrayList = new ArrayList<>(set);
        Collections.sort(arrayList, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare( Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2 ) {
                int num = o2.getValue()-o1.getValue();
                int num2 = num ==0 ?o1.getKey()-o2.getKey():num;
                return num2;
            }
        });

        for(Map.Entry<Integer,Integer> entry:arrayList){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
