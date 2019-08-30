package 揭尹.创建一个简单的springIOC;

import 揭尹.创建一个简单的springIOC.car.AudiCar;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/8/5
 * \* Time: 20:46
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class IoCContainer {
    private Map<String,Object> beans = new ConcurrentHashMap<>();

    public Object getBean(String beanId){
        return beans.get(beanId);
    }

    public void setBean(Class clazz,String beanId,String... paramBeanIds){
        //组装构造方法所需要的参数
        Object[] paramValues = new Object[paramBeanIds.length];
        for (int i = 0; i < paramValues.length; i++) {
            paramValues[i]=beans.get(paramBeanIds[i]);
        }
        //调用构造方法实例化Bean
        Object bean=null;
        for( Constructor constructor :clazz.getConstructors()){
            try {
                bean=constructor.newInstance(paramValues);
            } catch (InstantiationException e) {
            } catch (IllegalAccessException e) {
            } catch (InvocationTargetException e) {
            }
        }
        if(bean==null)
            throw new RuntimeException("无法实例化bean");
        //将实例化bean放入beans
        beans.put(beanId,bean);
    }
}
