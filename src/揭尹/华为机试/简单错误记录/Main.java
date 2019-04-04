package 揭尹.华为机试.简单错误记录;

import java.util.*;

/**
 * Created by Jline on 2019/4/3.
 */
public class Main {
    public static void main( String[] args ) {
        Scanner sc= new Scanner(System.in);
        LinkedHashMap<String,Integer> hashMap =new LinkedHashMap<>();

        while(sc.hasNext()) {
            String filePath = sc.next();

            int rowNum = sc.nextInt();

            String[] arrfilePath = filePath.split("\\\\");
            String fileName = arrfilePath[arrfilePath.length-1];
            String fileName_rowNum = fileName+" "+rowNum;

            if(hashMap.containsKey(fileName_rowNum)){
                hashMap.put(fileName_rowNum,hashMap.get(fileName_rowNum)+1);
            }else{
                hashMap.put(fileName_rowNum,1);
            }

        }
        ArrayList<Map.Entry<String,Integer>> arrayList = new ArrayList<>(hashMap.entrySet());
        Collections.sort(arrayList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 ) {
                return o2.getValue()-o1.getValue();
            }
        });
        int flag=0;
        for( Map.Entry<String, Integer> set:arrayList){
            String key=set.getKey();
            String[] newKey = key.split(" ");
            if(newKey[0].length()>16){
                newKey[0] = newKey[0].substring(newKey[0].length()-16);

            }
            if(flag++<8)
                System.out.print(newKey[0]+" "+newKey[1]+" "+set.getValue());

        }

    }
}
