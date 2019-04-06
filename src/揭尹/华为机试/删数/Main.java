package 揭尹.华为机试.删数;

import java.util.*;

/**
 * Created by Jline on 2019/4/4.
 */
public class Main {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int N = sc.nextInt();
            //listMethod(N);
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i]=i;
            }
            int count=N;
            int flag=0;
            while (count>1){
                for (int i = 0; i < N; i++) {
                    if(arr[i]!=-1) {
                        if (++flag == 3) {
                            arr[i] = -1;
                            flag = 0;
                            count--;
                        }
                    }
                }
            }
            for (int i = 0; i < N; i++) {
                if(arr[i]!=-1)
                    System.out.println(arr[i]);
            }
        }
    }

    private static void listMethod( int n ) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrayList.add(i);
        }
        int i=2;
        while(arrayList.size()>1){
          i=i%arrayList.size();
            arrayList.remove(i);
            i=i+2;
        }
        System.out.println(arrayList.get(0));
    }
}
