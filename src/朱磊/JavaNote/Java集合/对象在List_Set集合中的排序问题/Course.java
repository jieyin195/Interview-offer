package JavaNote.Java集合.对象在List_Set集合中的排序问题;

import java.util.Comparator;

public class Course implements Comparator<Course>{

	int num;
	String name;
	
	
	public Course(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Course [num=" + num + ", name=" + name + "]";
	}


	@Override
	public int compare(Course o1, Course o2) {
		if(o1.num == o2.num)
			return o1.name.compareTo(o2.name);
		return o1.num - o2.num;
	}
	
	
}
