package bt2_package_accessmodifier.person;

public class Information {
    public static void main(String[] args) {
        Person ps = new Person("Hoa", 23, "Nữ", "HCM", 123567);
        System.out.println("Tên: " + ps.getName());
        System.out.println("Tuổi: " + ps.getAge());
        System.out.println("Giới tính: " + ps.getGender());
        System.out.println("Địa chỉ: " + ps.getAddress());
        System.out.println("Điện thoại: " + ps.getPhone());
    }
}
