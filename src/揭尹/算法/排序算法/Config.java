package 揭尹.算法.排序算法;

public class Config {
    public static void swap(int[] arr,int a,int b){
        arr[a] = arr[a] + arr[b];
        arr[b] = arr[a] - arr[b];
        arr[a] = arr[a] - arr[b];
    }

    public static void printArr(int[] arr){
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length-1){
                System.out.print(arr[i]);
                break;
            }
            System.out.print(arr[i]+" , ");
        }
        System.out.println(" ]");
    }
}
