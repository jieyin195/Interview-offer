package 揭尹.设计模式.工厂方法模式.代码;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/6/6
 * \* Time: 16:51
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Main {
    public static void main( String[] args ) {
        IFatherFactory cnfactory = new ChinestFatherFactory();
        Father cnfather = cnfactory.createFather("中国");
        cnfather.printName();

        IFatherFactory usfactory = new AmericanFatherFactory();
        Father usfather = usfactory.createFather("美国");
        usfather.printName();
    }
}
