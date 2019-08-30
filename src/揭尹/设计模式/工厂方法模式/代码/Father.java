package 揭尹.设计模式.工厂方法模式.代码;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/6/6
 * \* Time: 16:37
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public abstract class Father {
    private String name;

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public abstract void printName();
}
