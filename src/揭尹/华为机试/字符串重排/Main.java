package 揭尹.华为机试.字符串重排;

import java.util.*;

/**
 * Created by Jline on 2019/4/8.
         * 1.字符串重排

         题目描述  

         给你一个原始字符串，根据该字符串内每个字符出现的次数，按照ASCII码递增顺序重新调整输出。
         【温馨提示】 
         (1).原始字符串中仅可能出现“数字”和“字母”； 
         (2).请注意区分字母大小写。 
         输入描述: 
         eeefgghhh 
         输出描述: 
         efghegheh 
         示例1 
         输入 
         eeefgghhh 
         输出 
         efghegheh
 */
public class Main {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.next();
            TreeMap<String,Integer> treeMap = new TreeMap<>();
            for (int i = 0; i < str.length(); i++) {
                String key = str.charAt(i)+"";
                if(treeMap.containsKey(key))
                    treeMap.put(key,treeMap.get(key)+1);
                else
                    treeMap.put(key,1);
            }
            int max=0;
            for(String key:treeMap.keySet()){
                if(treeMap.get(key)>max)
                    max=treeMap.get(key);
            }
            while(max-->0){
                for (String key:treeMap.keySet()){
                    if(treeMap.get(key)>=1) {
                        System.out.print(key);
                        treeMap.put(key,treeMap.get(key)-1);
                    }
                }
            }
        }
    }
}
