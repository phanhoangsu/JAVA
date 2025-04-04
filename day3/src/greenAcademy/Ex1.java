package greenAcademy;

import java.text.Normalizer;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex1 {

    // Hàm chuẩn hóa chuỗi (xóa dấu, chuyển sang chữ thường, thay dấu cách bằng dấu gạch ngang, và thay "đ" thành "d")
    public static String covertToString(String value) {
        try {
            // Chuyển chuỗi thành dạng chuẩn hóa không dấu
            String temp = Normalizer.normalize(value, Normalizer.Form.NFD);
            Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
            // Loại bỏ dấu, chuyển thành chữ thường và thay khoảng trắng bằng dấu gạch ngang
            return pattern.matcher(temp).replaceAll("").toLowerCase().replaceAll(" ", "-").replaceAll("đ", "d");
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        /**
         * Sử dụng class Student vừa tạo, viết chương trình cho phép nhập
         * vào danh sách N (N nhập từ bàn phím) sinh viên.
         * Nhập thông tin cho từng sinh viên và Hiển thị danh sách sinh
         * viên vừa nhập.
         * Tìm kiếm sinh viên theo tên.
         * Sắp xếp danh sách sinh viên theo tên A-Z.
         * Sắp xếp sinh viên theo tuổi giảm dần.
         */
        Scanner st = new Scanner(System.in);
        Student[] students = null;

        int menu;
        while (true) {

            System.out.print("=================Menu===================");
            System.out.print("\n1. Nhập danh sách các sinh viên ");
            System.out.print("\n2. Hiển thị danh sách sinh viên  ");
            System.out.print("\n3. Tìm kiếm sinh viên theo tên ");
            System.out.print("\n4. Sắp xếp danh sách sinh viên từ A-Z ");
            System.out.print("\n5. Sắp xếp sinh viên theo tuổi giảm dần ");
            System.out.print("\n0. Thoát");
            System.out.print("\n=========================");
            System.out.print("\nChọn chức năng : ");
            menu = Integer.parseInt(st.nextLine());

            switch (menu) {
                case 1: // nhập danh sách sinh viên
                    System.out.print("\nNhập số lượng sinh viên : ");
                    // đọc số lượng sinh viên từ người dùng nập vào
                    int soSV = Integer.parseInt(st.nextLine());
                    // khởi tạo students chứa thông tin của các sinh viên
                    students = new Student[soSV];

                    System.out.println("Nhập thông tin : ");
                    // lặp qua từng phần tử trong mảng
                    for (int i = 0; i < students.length; i++) {

                        students[i] = new Student();

                        students[i].nhap();
                    }
                    break;
                case 2: // hiển thị danh sách sinh viên
                    System.out.println("------------------------");
                    System.out.println("\nDANH SÁCH TẤT CẢ SINH VIÊN ");
                    //lặp qua từng sinh viên trong mảng students
                    for (Student danhsach : students) {
                        danhsach.nhap2();
                    }
                    break;
                case 3: // tìm kiếm sinh viên theo tên
                    System.out.println("------------------------");
                    System.out.print("\nNhập tên sinh viên cần tìm : ");
                    //chuẩn hóa tên
                    String searchName = covertToString(st.nextLine());
                    // để kiểm tra xem có tìm thấy sinh viên hay không
                    boolean found = false;
                    System.out.println("Kết quả tìm kiếm : ");
                    for (Student danhsach : students) {
                        // So sánh tên sinh viên sau khi chuẩn hóa
                        if (covertToString(danhsach.getName()).contains(searchName)) {
                            found = true;
                            danhsach.nhap2();
                        }
                    }
                    if (!found) {
                        System.out.println("Không tìm thấy sinh viên với tên " + searchName);
                    }
                    break;
                case 4:
                    System.out.println("------------------------");
                    System.out.println("\nSắp xếp danh sách sinh viên theo tên A-Z: ");
                    // sử dụng Comparator để so sánh theo tên sinh viên
                    Arrays.sort(students, (student1, student2) -> student1.getName().compareToIgnoreCase(student2.getName()));

                    // hiển thị lại danh sách
                    for (Student danhsach : students) {
                        danhsach.nhap2();
                    }
                    break;
                case 5: // sắp xếp sinh viên theo tuổi giảm dần
                    System.out.println("------------------------");
                    System.out.println("\nSắp xếp sinh viên theo tuổi giảm dần: ");
                    // Sử dụng Comparator để so sánh theo tuổi (giảm dần)
                    Arrays.sort(students, (student1, student2) -> Integer.compare(student2.getAge(), student1.getAge()));

                    // Hiển thị lại danh sách sinh viên đã sắp xếp
                    for (Student danhsach : students) {
                        danhsach.nhap2();
                    }
                    break;

                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Bạn đã chọn sai chức năng! Vui lòng chọn lại !");
            }

        }
    }
}