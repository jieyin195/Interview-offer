package 朱磊.JavaNote.Java集合.对象在Map集合中的排序问题;

import java.util.*;

/**
 * @Author: zl
 * @Date: 2019/3/10 16:30
 * @Description: 已知一个 HashMap<Integer，User>集合， User 有 name（String）和 age（int）属性。请写一个方法实现对
 *                 HashMap 的排序功能，该方法接收 HashMap<Integer，User>为形参，返回类型为 HashMap<Integer，User>，
 *                 要求对 HashMap 中的 User 的 age 倒序进行排序。排序时 key=value 键值对不得拆散。
 */
public class HashMapCompare {

    public static void main(String[] args) {

        HashMap<Integer, User> map = new HashMap<>();
        map.put(1, new User(20, "longshaosong"));
        map.put(2, new User(22, "jieyin"));
        map.put(3, new User(20, "zhaozhiqiang"));

        HashMap<Integer,User> res = sortHashMap(map);

        // 利用迭代器对HashMap进行遍历
        Iterator iterator = res.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer,User> entry = (Map.Entry<Integer, User>) iterator.next();
            System.out.println(entry.getKey() + entry.getValue().toString());
        }

        System.out.println("-----------------------------------------------------------");

        // 利用增强for来遍历
        for (Integer key: res.keySet()) {
            System.out.println(key + res.get(key).toString());
        }

    }

    private static HashMap sortHashMap(HashMap<Integer, User> map) {
        // Entry数组对象存放在set集合里面（因为HashMap本来就不能存在相同的key值，所以在set集合中没有影响）
        Set<Map.Entry<Integer, User>> set = map.entrySet();
        // 然后将set集合存放在ArrayList集合中，便于后面Collections工具类的排序
        ArrayList<Map.Entry<Integer, User>> list = new ArrayList<>(set);
        Collections.sort(list, new Comparator<Map.Entry<Integer, User>>() {
            @Override
            public int compare(Map.Entry<Integer, User> o1, Map.Entry<Integer, User> o2) {
                if(o1.getValue().getAge() == o2.getValue().getAge())
                    return o1.getValue().getName().compareTo(o2.getValue().getName());
                return o1.getValue().getAge() - o2.getValue().getAge();
            }
        });

        // 这里用LinkedHashMap是因为LinkedHashMap底层数据结构为链表，所以相比HashMap有存取有序性的特点
        LinkedHashMap<Integer, User> linkedHashMap = new LinkedHashMap<>();
        // 用排好序的list作为迭代对象，然后从Entry数组中分别取出键和值来完成遍历
        for(Map.Entry<Integer, User> entry : list)
            linkedHashMap.put(entry.getKey(), entry.getValue());
        return linkedHashMap;
    }


}
