package bt2_package_accessmodifier.person;

public class Person {
    public String name;
    public int age;
    public String gender;
    protected String address;
    protected int phone;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    protected String getAddress() {
        return address;
    }

    protected int getPhone() {
        return phone;
    }

    public Person(String name, int age, String gender, String address, int phone) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }
    public Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
