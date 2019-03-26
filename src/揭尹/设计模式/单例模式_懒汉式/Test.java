package 揭尹.设计模式.单例模式_懒汉式;

/**
 * Created by Jline on 2019/3/19.
 */
public class Test {
    public static void main( String[] args ) {
        Student s1 = Student.getStudent();
        Student s2 = Student.getStudent();
        System.out.println(s1==s2);
    }
}
