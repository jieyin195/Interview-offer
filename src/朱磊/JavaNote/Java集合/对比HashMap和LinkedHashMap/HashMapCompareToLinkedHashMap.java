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

    /**
     *  note：
     *  问：关于为什么HashMap的遍历是无序的
     *  答：HashMap是存储在Entry对象数组中，存放的顺序不一定是有序的
     *      HashMap是根据Entry数组的key的hash值来进行映射，存放到数组中。对于不同容量的HashMap，key对应的hash函数不同，但不同的hash函数也都会存在一定的hash冲突
     *      例如：键的存储顺序为1、2、3
     *              但是产生了hash冲突，键为1和3的hash值发生了冲突，所以通过链地址法来解决hash冲突，键为3的Entry对象最为链表的后续节点连接在键为1的Entry对象后面
     *              最后遍历的时候，首先遍历第一个hash桶，分别是键为1和3的Entry对象，然后再是键为2的
     *              因此最后迭代遍历的顺序为键为1、3、2的map
     *      与此相对的，TreeSet和TreeMap是有序的，因为是经过了二叉树的排序。LinkedHashMap为HashMap的子类，底层数据结构为链表，所以也是有序的
     *
     *
     *  问：为什么数组的查询效率高，链表的增删效率高
     *  答：因为上一个问题谈到了数组角标，所以在这里复习重新写一下答案。
     *      数组查询快，是因为在拿到数组角标的情况下，能够很快的查询到结果。相反，因为增删导致了角标的改变，要对角标进行维护，因而效率会变低
     *      链表查询慢，是因为链表需要从头到尾依次进行遍历，直到查询到相匹配的结果，因而效率不如数组。相反，链表是相互引用的关系，所以没有对角标进行维护的开销，所以效率就高于链表
     */
}
