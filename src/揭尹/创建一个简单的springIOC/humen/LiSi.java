package 揭尹.创建一个简单的springIOC.humen;

import 揭尹.创建一个简单的springIOC.car.Car;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/8/5
 * \* Time: 20:42
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class LiSi extends HumenWithCar{
    public LiSi( Car car ) {
        super(car);
    }

    @Override
    public void gohome() {
        car.start();
        car.stop();
    }
}
