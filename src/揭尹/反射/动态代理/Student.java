package 揭尹.反射.动态代理;

/**
 * Created by Jline on 2019/3/19.
 */
public class Student implements StudentDao{
    public void login(){
        System.out.println("登录系统");
    }

    public void exit(){
        System.out.println("退出系统");
    }

    @Override
    public void show( String name, int age ) {
        System.out.println(name+"----"+age);
    }
}
