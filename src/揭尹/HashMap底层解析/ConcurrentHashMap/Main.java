package 揭尹.HashMap底层解析.ConcurrentHashMap;

import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Jline on 2019/4/15.
 */
public class Main {
    public static void main( String[] args ) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put(123,null);
        Hashtable hashtable = new Hashtable();
        hashtable.put(null,123);

    }
}
