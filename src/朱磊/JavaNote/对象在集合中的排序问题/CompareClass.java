package JavaNote.对象在集合中的排序问题;

/**
 * @Author: zl
 * @Date: 2019/3/7 12:40
 * @Description: 分别用TreeSet和ArrayList两种集合，对对象进行排序。
 * 					然后也补充了对set的遍历方式。
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class CompareClass {

	public static void main(String[] args) {

		Student s1 = new Student(20, "zhangsan");
		Student s2 = new Student(19, "lisi");
		// 使用TreeSet，默认对对象进行自然排序。然后实现Comparator接口，重写排序方式，而泛型Student可以不用实现Comparator接口
		TreeSet<Student> set = new TreeSet<>(new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.age - o2.age;
			}
		});
		set.add(s1);
		set.add(s2);
		// 遍历方式1
		for (Student student : set) {
			System.out.println(student);
		}
		System.out.println();

		// 遍历方式2
		// 这里set的遍历方式只能用迭代器遍历（增强for也是迭代器）。set中不包含重复元素，所以无法根据角标来获取对应位置的值
		Iterator<Student> iterator = set.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());


		System.out.println("-------------------------------------------------------------------------------------");


		Course c1 = new Course(2, "English");
		Course c2 = new Course(1, "Chinese");
		// Course中实现了Comparator接口，所以TreeSet也必须要默认实现,否则会报异常
		// 另外Course实现了Comparator接口，并且在重写方法的时候进行了排序比较。这边用匿名内部类实现接口，但是没有进行比较，输出结果没有排序
		TreeSet<Course> treeSet = new TreeSet<>(new Comparator<Course>() {
			@Override
			public int compare(Course o1, Course o2) {
				return 0;
			}
		});
		treeSet.add(c1);
		treeSet.add(c2);

		for (Course course : treeSet) {
			System.out.println(course);
		}


		System.out.println("------------------------------------------------------------------------------------");


		ArrayList<Course> list = new ArrayList<Course>();
		list.add(c1);
		list.add(c2);
		// 使用Collections工具类时，要先添加后排序（这里不同于底层数据结构为红黑树的set集合）
		Collections.sort(list, new Comparator<Course>() {
			@Override
			public int compare(Course o1, Course o2) {
				return o1.num - o2.num;
			}
		});
		for (Course course : list) {
			System.out.println(course);
		}
	}

}
