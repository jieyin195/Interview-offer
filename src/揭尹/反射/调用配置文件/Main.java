package 揭尹.反射.调用配置文件;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * Created by Jline on 2019/3/17.
 */
public class Main {
    public static void main( String[] args ) throws Exception{
        Class clazz = Class.forName(getValues("className"));
        Method m = clazz.getMethod(getValues("methodName"));
        m.invoke(clazz.getConstructor().newInstance());
    }

    private static String getValues( String methodNmae ) throws IOException {
        Properties pro = new Properties();
        FileReader in = new FileReader("F:\\workspaceIdea\\Interview-offer\\src\\揭尹\\反射\\调用配置文件\\pro.txt");
        pro.load(in);
        in.close();
        return pro.getProperty(methodNmae);
    }
}
