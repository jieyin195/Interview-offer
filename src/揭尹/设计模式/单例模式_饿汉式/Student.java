package 揭尹.设计模式.单例模式_饿汉式;

/**
 * Created by Jline on 2019/3/19.
 * 饿汉式：就是类加载完毕就给对象，不需要调用方法获取
 */
public class Student {
    private static Student s = new Student();
    private Student(){}
    public static Student getStudent(){
        return s;
    }
}
