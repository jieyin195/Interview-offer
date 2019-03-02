package 揭尹.我总结的问题;

/**
 * Created by Jline on 2019/2/26.
 */

interface Inter{
    void show();
}

public class Outer {
    public static Inter method(){
        return new Inter(){
          public void show(){
              System.out.println("hello");
          }
        };
    }

    public static void main( String[] args ) {
        Outer .method().show();
    }
}
