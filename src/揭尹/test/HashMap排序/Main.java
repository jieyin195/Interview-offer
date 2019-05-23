package 揭尹.test.HashMap排序;

import java.util.*;

/**
 * Created by Jline on 2019/3/30.
 */
class User{
    private String name;
    private int age;

    public User( String name, int age ) {
        this.name = name;
        this.age = age;
    }

//    @Override
//    public boolean equals( Object o ) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        User user = (User) o;
//        return age == user.age &&
//                Objects.equals(name, user.name);
//    }
//
//    @Override
//    public int hashCode() {
//
//        return Objects.hash(name, age);
//    }

    @Override

    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge( int age ) {
        this.age = age;
    }
}
public class Main {
    public static void main( String[] args ) {
        HashMap<Integer,User> hashMap = new HashMap<>();
        hashMap.put(1,new User("朱磊",25));
        hashMap.put(2,new User("赵志强",24));
        hashMap.put(3,new User("龙绍松",26));

        System.out.println(hashMap);
        System.out.println(mapSort(hashMap));
    }

    private static HashMap<Integer,User> mapSort( HashMap<Integer, User> hashMap ) {
        Set<Map.Entry<Integer,User>> set = hashMap.entrySet();
        ArrayList<Map.Entry<Integer,User>> arrayList = new ArrayList<>(set);
        Collections.sort(arrayList, new Comparator<Map.Entry<Integer,User>>() {
            @Override
            public int compare( Map.Entry<Integer,User> o1, Map.Entry<Integer,User> o2 ) {
                return o2.getValue().getAge()-o1.getValue().getAge();
            }
        });
        LinkedHashMap<Integer,User> hashMap1 = new LinkedHashMap<>();
        for(Map.Entry<Integer,User> entry: arrayList){
            hashMap1.put(entry.getKey(),entry.getValue());
        }
        return hashMap1;
    }
}
