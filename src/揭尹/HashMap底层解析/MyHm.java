package 揭尹.HashMap底层解析;

import java.util.HashMap;
import java.util.Objects;

/**
 * Created by Jline on 2019/3/28.
 */
public class MyHm {
    private String name;
    private int age;

    @Override
    public boolean equals( Object o ) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyHm myHm = (MyHm) o;
        return age == myHm.age &&
                Objects.equals(name, myHm.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }

    public MyHm( String name, int age ) {

        this.name = name;
        this.age = age;
    }

    public static void main( String[] args ) {
        MyHm myHm = new MyHm("乔峰",18);
        MyHm myHm1 = new MyHm("乔峰",18);
        System.out.println(myHm);
        System.out.println(myHm1);
        HashMap<MyHm,String> map = new HashMap<MyHm, String>();
        map.put(myHm,"天龙八部");

        System.out.println("结果:"+map.get(myHm1));
    }
}
