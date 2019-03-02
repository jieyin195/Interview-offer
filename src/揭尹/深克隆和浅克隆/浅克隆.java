package 揭尹.深克隆和浅克隆;

/**
 * Created by Jline on 2019/2/26.
 * 浅克隆：创建一个新对象，新对象的属性和原来对象完全相同，
 * 对于非基本类型属性，仍指向原有属性所指向的对象的内存地址。
 */

class Customer implements Cloneable{
    public int ID;
    public int age;
    public Address address;
    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public Customer(int iD, int age, Address address) {
        super();
        ID = iD;
        this.age = age;
        this.address = address;
    }
    @Override
    public String toString() {
        return "Customer [ID=" + ID + ", age=" + age + ", address=" + address
                + "]";
    }
    @Override
    public Customer clone() throws CloneNotSupportedException {
        return (Customer) super.clone();
    }
}
class Address{
    private String country;
    private String province;
    private String city;
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getProvince() {
        return province;
    }
    public void setProvince(String province) {
        this.province = province;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    @Override
    public String toString() {
        return "Address [country=" + country + ", province=" + province
                + ", city=" + city + "]";
    }
    public Address(String country, String province, String city) {
        super();
        this.country = country;
        this.province = province;
        this.city = city;
    }
}

public class 浅克隆{
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("CH" , "SD" , "QD");
        Customer customer1 = new Customer(1 , 23 , address);
        Customer customer2 = customer1.clone();
        customer2.getAddress().setCity("JN");
        customer2.setID(2);
        System.out.println("customer1:"+customer1.toString());
        System.out.println("customer2:"+customer2.toString());
    }

}
//输出的结果是：
//customer1:Customer [ID=1, age=23, address=Address [country=CH, province=SD, city=JN]]
//customer2:Customer [ID=2, age=23, address=Address [country=CH, province=SD, city=JN]]