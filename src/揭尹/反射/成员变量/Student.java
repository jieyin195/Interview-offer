package 揭尹.反射.成员变量;

/**
 * Created by Jline on 2019/3/17.
 */
public class Student {

    public Student(){

    }
    //**********字段*************//
    public String name;
    protected int age;
    char sex;
    private String phoneNum;

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", sex=" + sex
                + ", phoneNum=" + phoneNum + "]";
    }

}
