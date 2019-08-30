package 揭尹.设计模式.工厂方法模式.代码;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/6/6
 * \* Time: 16:46
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class AmericanFather extends Father{
    public AmericanFather(String name){
        this.setName(name);
    }

    @Override
    public void printName(){
        System.out.println(this.getClass().getName()+"-----"+this.getName());
    }
}
