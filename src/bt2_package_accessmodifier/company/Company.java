package bt2_package_accessmodifier.company;

import bt2_package_accessmodifier.person.Person;

public class Company {
    public static void main(String[] args) {
        Person ps2 = new Person("Hung", 23, "Nam");
        System.out.println("Tên: " + ps2.getName());
        System.out.println("Tuổi: " + ps2.getAge());
        System.out.println("Giới tính: " + ps2.getGender());
    }
}
