package 揭尹.我总结的问题;

/**
 * Created by Jline on 2019/2/25.
 */
public class X {
    V v= new V();
    X(){
        super();
        System.out.println("X");
    }
}

class V{
    V(){
        System.out.println("Y");
    }
}

class Z extends X{
    V v = new V();
    Z(){

        System.out.println("Z");
    }

    public static void main( String[] args ) {
        Z z = new Z();
    }
}
