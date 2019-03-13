package JavaNote.Java集合.对比HashMap和LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Author: zl
 * @Date: 2019/3/10 23:03
 * @Description: HashMap根据键的HashCode值存储数据, 根据键可以直接获取它的值，具有很快的访问速度，遍历时，取得数据的顺序是完全随机的。
 *              HashMap最多只允许一条记录的键为Null，允许多条记录的值为 Null，
 *              HashMap不支持线程的同步，即任一时刻可以有多个线程同时写HashMap，因为多线程操作Hash Map时，rehash时可能会导致数据的不一致，链表出现死循环的情况。
 *              如果需要同步，可以用 Collections的synchronizedMap方法使HashMap具有同步的能力，或者使用ConcurrentHashMap。
 *
 *                 LinkedHashMap 是HashMap的一个子类，保存了记录的插入顺序。
 *              在用Iterator遍历LinkedHashMap时，先得到的记录肯定是先插入的.也可以在构造时用带参数，按照应用次数排序。
 *              在遍历的时候会比HashMap慢，不过有种情况例外，当HashMap容量很大，实际数据较少时，遍历起来可能会比 LinkedHashMap慢，
 *              因为LinkedHashMap的遍历速度只和实际数据有关，和容量无关，而HashMap的遍历速度和他的容量有关
 */
public class HashMapCompareToLinkedHashMap {

    public static void main(String[] args) {

        // LinkedHashMap为HashMap的子类，底层数据结构为链表，所以存放数据后，从遍历结果可以看出是顺序存放的
        Map<Integer,String> linkedHashMap = new LinkedHashMap<Integer,String>();
        linkedHashMap.put(5, "jieyin");
        linkedHashMap.put(0, "zhaozhiqiang");
        linkedHashMap.put(1,"longshaosong");

        for(Integer key : linkedHashMap.keySet())
            System.out.println(key + linkedHashMap.get(key));

        System.out.println("----------------------------------------------------");

        // HashMap的底层数据结构为数组+链表。存放数据后，遍历得到的结果是随机的
        // 数组是HashMap的主体，链表则是主要为了解决哈希冲突而存在的
        Map<Integer,String> hashMap = new HashMap<Integer,String>();
        hashMap.put(5, "jieyin");
        hashMap.put(0, "zhaozhiqiang");
        hashMap.put(1,"longshaosong");

        for(Map.Entry<Integer, String> entry : hashMap.entrySet())
            System.out.println(entry.getKey() + entry.getValue());

    }
}
