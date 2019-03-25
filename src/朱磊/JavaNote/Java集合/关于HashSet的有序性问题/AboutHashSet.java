package 朱磊.JavaNote.Java集合.关于HashSet的有序性问题;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @Author: zl
 * @Date: 2019/3/25 19:04
 * @Description: 该类实现了Set接口，通过hash table实现。
 *              HashSet的迭代器在输出时“不保证有序”，但也不是“保证无序”。
 *              也就是说，输出时有序也是允许的，但是你的程序不应该依赖这一点。
 *
 *              注：HashSet和HashMap一样，是允许key为null的。但是Hashtable不允许key为null
 */
public class AboutHashSet {

    public static void main(String[] args) {

        HashSet<Integer> setNum = new HashSet<>();
        setNum.add(9);
        setNum.add(5);
        setNum.add(7);
        setNum.add(1);

        Iterator<Integer> num = setNum.iterator();
        while (num.hasNext())
            System.out.println(num.next());

        System.out.println("--------------------------------------------------");

        HashSet<String> setStr = new HashSet<>();
        setStr.add("ccc");
        setStr.add("bbb");
        setStr.add("vvv");
        setStr.add("sss");

        Iterator<String> str = setStr.iterator();
        while (str.hasNext())
            System.out.println(str.next());

        System.out.println("-------------------------------------------------------");

        // 当数据足够大且随机得时候，是无序得
        HashSet<Integer> setMoreNum = new HashSet<>();
        setMoreNum.add(9);
        setMoreNum.add(50);
        setMoreNum.add(7);
        setMoreNum.add(16);
        setMoreNum.add(105);
        setMoreNum.add(222);

        Iterator<Integer> numMore = setMoreNum.iterator();
        while (numMore.hasNext())
            System.out.println(numMore.next());
    }
}
