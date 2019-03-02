package 揭尹.我总结的问题;

/**
 * Created by Jline on 2019/2/26.
 */
public class Outer2 {
    static class Inter{
        public void show(){
            System.out.println("inter");
        }
    }

    public static void main( String[] args ) {


        Outer2.Inter o2 = new Outer2.Inter();
        o2.show();
    }
}
