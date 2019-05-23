package 揭尹.java基础.IO流.字节流;

/**
 * Created by Jline on 2019/3/30.
 */
import java.io.*;
import java.util.Scanner;

public class DataInputStreamDemo{
    public static void main(String[] args) throws IOException{
        File file = new File("d:" + File.separator +"my.txt");
        Scanner sca = null;
        StringBuilder sb= new StringBuilder();
        try{
            sca = new Scanner(file);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        while(sca.hasNext()) {
            sb.append(sca.next());
        }
        System.out.println("从文件中读取的内容是：" + sb);
    }
}