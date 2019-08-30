package 揭尹.设计模式.工厂方法模式.代码;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/6/6
 * \* Time: 16:49
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class ChinestFatherFactory implements IFatherFactory{

    @Override
    public Father createFather( String name ) {
        return new ChineseFather(name);
    }
}
