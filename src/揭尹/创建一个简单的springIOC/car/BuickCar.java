package 揭尹.创建一个简单的springIOC.car;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/8/5
 * \* Time: 20:30
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class BuickCar implements Car {
    @Override
    public void start() {
        System.out.println("Buick...start");
    }

    @Override
    public void turnLeft() {
        System.out.println("Buick...turnLeft");
    }

    @Override
    public void turnRight() {
        System.out.println("Buick...turnRight");
    }

    @Override
    public void stop() {
        System.out.println("Buick...stop");
    }
}
