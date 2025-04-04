//LỚP ĐIỀU KHIỂN CHƯƠNG TRÌNH

import java.util.Scanner;

public class StudentManager {

    /**
     * BTVN
     * Viết chương trình quản lý sinh viên với các chức năng sau
     * 1. Thêm mới sinh viên
     * 2. Hiển thị danh sách sinh viên
     * 3. Hiển thị danh sách sinh viên theo điểm TB giảm dần
     * 4. Tìm kiếm sinh viên theo tên
     * 5. Cập nhật thông tin sinh viên
     * 6. Xóa sinh viên
     * 0. Thoát
     */

    private static StudentService studentService = new StudentService();
    private static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Add Sinh viên ");
            System.out.println("2. Show list sinh viên  ");
            System.out.println("3. Show list sinh viên theo điểm TB giảm dần ");
            System.out.println("4. Tìm kiếm sinh viên theo tên");
            System.out.println("6. Xóa sinh viên");
            System.out.println("0. Exit");
            System.out.print("Chọn chức năng: ");

            int choice = Integer.parseInt(SC.nextLine());
            switch (choice) {
                case 1:
                    studentService.addStudent();
                    break;
                case 2:
                    studentService.showStudent();
                    break;
                case 3:// Hiển thị danh sách sinh viên theo điểm TB giảm dần
                    studentService.showStudentSortedByAvgScore();
                    break;
                case 4:
                    studentService.searchStudentByName();
                    break;
                case 6:
                    studentService.removeStudent();
                    break;
                case 0:
                    System.out.println("Đã thoát chương trình!");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ!");

            }
        }
    }
}


