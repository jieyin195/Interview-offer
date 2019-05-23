package 揭尹.java基础.IO流.字节流;

import java.io.*;

/**
 * Created by Jline on 2019/3/30.
 */
public class hello {
    public static void main( String[] args ) throws IOException {
        String filename = "D:"+ File.separator+"my.txt";
        File file = new File(filename);
        InputStream in = new FileInputStream(file);
        知道长度去读文件(file, in);
        //不知道长度去读文件(in);
    }

    private static void 不知道长度去读文件( InputStream in ) throws IOException {
        byte[] bytes = new byte[1024];
        int temp=0;
        int count=0;
        while((temp =in.read())!=-1){
            bytes[count++] =(byte)temp;
        }
        in.close();
        System.out.println(new String(bytes));
    }

    private static void 知道长度去读文件( File file, InputStream in ) throws IOException {
        byte[] bytes = new byte[(int)file.length()];
        int len =in.read(bytes);
        in.close();
        System.out.println(file.length());
        //System.out.println(len);
        System.out.println(new String(bytes));
    }
}
