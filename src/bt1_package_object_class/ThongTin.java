package bt1_package_object_class;

public class ThongTin {
    public static void main(String[] args) {
        System.out.println("Gọi hàm bằng cách tạo object");
        NhanVien nv = new NhanVien();
        System.out.println("Họ và tên: " + nv.getName("Khanh"));
        System.out.println("Tuổi: " + nv.getAge(23));

        System.out.println("Gọi hàm thông qua tên lớp - có dùng static");
        System.out.println("Địa chỉ: " + NhanVien.getCity("HCM"));

        System.out.println("Gọi hàm theo kiểu Anonymous");
        System.out.println("Vị trí: " + new NhanVien().getPosition("Tester"));
    }

}
