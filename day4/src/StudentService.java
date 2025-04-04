// CLASS XỬ LÍ LOGIC (THÊM SỬA THÊM , HIỂN THỊ SINH VIÊN)

import java.util.Arrays;
import java.util.Scanner;

public class StudentService {
    private Student[] students;  // MẢNG LƯU TRỮ DANH SÁCH SINH VIÊN
    private int count;            // BIẾN ĐẾM SỐ LƯỢNG SINH VIÊN ĐÃ THÊM
    private static Scanner SC = new Scanner(System.in);  // ĐỐI TƯỢNG NHẬP DỮ LIỆU TỪ BÀN PHÍM


    // KHỞI TẠO ĐỂ LƯU TỐI ĐA SỐ LƯỢNG SINH VIÊN
    public StudentService() {
        students = new Student[10];
        count = 0; // BIẾN ĐẾM SỐ SINH ĐÃ ĐƯỢC THÊM
    }

    // Constructor

    // Thu thập thông tin từ người dùng để taot và thêm thông tin sinh viên
    public void addStudent() {
        System.out.println("=== THÊM SINH VIÊN MỚI ===");
        System.out.println("Nhập mã sinh viên: ");
        String id = SC.nextLine();

        System.out.println("Nhập tên sinh viên: ");
        String name = SC.nextLine();

        System.out.println("Nhập tuổi: ");
        int age = Integer.parseInt(SC.nextLine());

        System.out.println("Nhập giới tính (1:Nam, 0: Nữ: ");
        boolean gender = Integer.parseInt(SC.nextLine()) == 1;

        System.out.println("Nhập điểm HTML: ");
        double html = Double.parseDouble(SC.nextLine());

        System.out.println("Nhập điểm ReactJs: ");
        double react = Double.parseDouble(SC.nextLine());

        System.out.println("Nhập điểm MySQL: ");
        double mysql = Double.parseDouble(SC.nextLine());

        // Constructor
        Student student = new Student(id, name, age, gender, html, react, mysql);
        add(student);
        System.out.println("Thêm sinh viên thành công!");
    }

    // Thêm hàm để hiển thị danh sách sinh viên đã sắp xếp theo điểm trung bình giảm dần
    public void showStudentSortedByAvgScore() {
        System.out.println("=== DANH SÁCH SINH VIÊN THEO ĐIỂM TRUNG BÌNH GIẢM DẦN ===");

        // Sắp xếp sinh viên theo điểm trung bình giảm dần
        Student[] sortedStudents = sortByAvgScoreDesc();

        // kiểm tra danh sách rỗng
        if (sortedStudents.length == 0) {
            System.out.println("Danh sách sinh viên trống!");
            return;
        }

        for (Student student : sortedStudents) {
            // Làm tròn và hiển thị điểm trung bình với 2 chữ số thập phân
            double avgScore = student.getAverageScore();
            System.out.println("Mã SV: " + student.getId());
            System.out.println("Tên SV: " + student.getName());
            System.out.println("Tuổi SV: " + student.getAge());
            System.out.println("Giới tính: " + (student.isGender() ? "Nam" : "Nữ"));
            System.out.println("Điểm HTML: " + student.getHtml());
            System.out.println("Điểm ReactJS: " + student.getReactjs());
            System.out.println("Điểm MySQL: " + student.getMysql());
            System.out.println("Điểm TB: " + String.format("%.2f", avgScore));  // In ra với 2 chữ số thập phân
            System.out.println("--------------------------------");
        }
    }


    public void showStudent() {
        System.out.println("=== DANH SÁCH SINH VIÊN ===");
        Student[] students = findAll();
        if (students.length == 0) {
            System.out.println("Danh sác sinh viên trống!");
            return;
        }
        for (Student student : students) {
            System.out.println("Mã SV: " + student.getId());
            System.out.println("Tên SV: " + student.getName());
            System.out.println("Tuổi SV: " + student.getAge());
            System.out.println("Giới tính: " + (student.isGender() ? "Nam" : "Nữ"));
            System.out.println("Điểm HTML: " + student.getHtml());
            System.out.println("Điểm ReactJS: " + student.getReactjs());
            System.out.println("Điểm MySQL: " + student.getMysql());
            System.out.println("--------------------------------");
        }
    }

    /**
     * Thêm một sinh viên vào mảng
     *
     * @param student đối tượng {@link Student} cần thêm
     */

    // phương thức
    public void add(Student student) {
        if (count >= students.length) {
            System.out.println("Danh sách đã đầy không thể thêm sinh viên mới!");
            return;
        }
        students[count] = student;
        count++;
    }

    /**
     * Cập nhật thông tin sinh viên đã lưu
     *
     * @param student đối tượng {@link Student} mang thông tin thay đổi
     * @return trả về {@code true} nếu thực hiện thành công ngược lại trả về {@code false}
     */
    public boolean update(Student student) {
        return false;
    }

    /**
     * Xóa sinh viên đã lưu
     *
//     * @param id mã sinh viên cần xóa
     * @return trả về {@code true} nếu thực hiện thành công ngược lại trả về {@code false}
     */
    // Trong class StudentService

// Thêm phương thức này để xử lý việc xóa sinh viên từ giao diện người dùng
    public void removeStudent() {
        System.out.println("=== XÓA SINH VIÊN ===");
        System.out.print("Nhập mã sinh viên cần xóa: ");
        String id = SC.nextLine();

        if (remove(id)) {
            System.out.println("Xóa sinh viên thành công!");
        } else {
            System.out.println("Không tìm thấy sinh viên với mã " + id + " để xóa!");
        }
    }

    // Cập nhật phương thức remove() đã có sẵn
    public boolean remove(String id) {
        for (int i = 0; i < count; i++) {
            if (students[i].getId().equals(id)) {
                // Di chuyển các phần tử phía sau lên để điền vào vị trí bị xóa
                for (int j = i; j < count - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[count - 1] = null; // Xóa phần tử cuối cùng
                count--; // Giảm số lượng sinh viên
                return true;
            }
        }
        return false; // Không tìm thấy sinh viên để xóa
    }
    /**
     * Trả về danh sách sinh viên đã lưu
     *
     * @return trả về mảng {@link Student} đã lưu
     */
    public Student[] findAll() {
        return Arrays.copyOf(students, count);  // TRẢ VỀ MẢNG CHỨA CÁC SINH VIÊN ĐÃ THÊM
    }

    /**
     * Tìm kếm danh sách sinh viên theo tên
     *
     * @param name tên sinh viên cần tìm
     * @return trả về mảng {@link Student} đã lưu
     */
    public Student[] findByName(String name) {
        Student[] result = new Student[count]; // Mảng kết quả có cùng kích thước với số lượng sinh viên hiện tại
        int index = 0;

        for (int i = 0; i < count; i++) {
            // kiểm tra tên của sinh viên có chưa tên đã nhập vô hay không
            if (students[i].getName().toLowerCase().contains(name.toLowerCase())) {
                result[index++] = students[i]; // Thêm vào mảng kết quả
            }
        }

        return Arrays.copyOf(result, index); // Trả về mảng chứa các sinh viên tìm được
    }

    // Hiển thị danh sách sinh viên tìm được theo tên
    public void searchStudentByName() {
        System.out.print("Nhập tên sinh viên cần tìm: ");
        String name = SC.nextLine();

        Student[] foundStudents = findByName(name);
        if (foundStudents.length == 0) {
            System.out.println("Không tìm thấy sinh viên nào có tên chứa: " + name);
            return;
        }

        System.out.println("=== DANH SÁCH SINH VIÊN TÌM ĐƯỢC ===");
        for (Student student : foundStudents) {
            System.out.println("Mã SV: " + student.getId());
            System.out.println("Tên SV: " + student.getName());
            System.out.println("Tuổi SV: " + student.getAge());
            System.out.println("Giới tính: " + (student.isGender() ? "Nam" : "Nữ"));
            System.out.println("Điểm TB: " + String.format("%.2f", student.getAverageScore()));
            System.out.println("--------------------------------");
        }
    }

    /**
     * Sắp sếp danh sách sinh viên theo điểm trung bình các môn
     *
     * @return trả về mảng {@link Student} đã được sắp xếp
     */
    public Student[] sortByAvgScoreDesc() {
        // Tạo bản sao của mảng students chỉ chứa các phần tử đã thêm (không null)
        Student[] studentsToSort = Arrays.copyOf(students, count);
        // Sắp xếp theo điểm trung bình giảm dần (không làm tròn khi so sánh)
        Arrays.sort(studentsToSort, (o1, o2) -> Double.compare(o2.getAverageScore(), o1.getAverageScore()));
        return studentsToSort;
    }

}