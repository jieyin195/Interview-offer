package 揭尹.创建一个简单的springIOC.humen;

import 揭尹.创建一个简单的springIOC.car.Car;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/8/5
 * \* Time: 20:32
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public abstract class HumenWithCar implements Human {
    protected Car car;

    public HumenWithCar(Car car){
        this.car=car;
    }

    public abstract void gohome() ;
}
