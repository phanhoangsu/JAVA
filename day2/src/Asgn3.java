import java.text.Normalizer;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Asgn3 {
    public static void main(String[] args) {
        /**
         * Viết chương trình Java nhập vào mảng họ và tên (Họ, tên đệm, tên) của N sinh viên.
         * Xử lý các yêu cầu sau:
         * ***************************MENU*****************************
         * 1. Hiển thị danh sách sinh viên vừa nhập
         * 2. Sắp xếp danh sách sinh viên theo tên A-Z
         * 3. Tìm kiếm sinh viên với từ khóa truyền vào
         * 4. Thoát
         */

        String[] names = new String[]{"Phan Duy Phương", "Nguyễn Quốc Đạt", "Trần Đức Thành", "Nguyễn Minh Tuyên", "Phan Hoàng Sử", "Nguyễn Văn Khánh", "Đàm Nhật Tuấn Anh"};

        // duyệt qua từng phần tử trong mảng names
        for (int i = 0; i < names.length; i++) {// names lấy độ dài của mảng

            // với mỗi phần tử names[i],vòng lặp trong sẽ duyệt qua tất cả cá phần tử tiếp theo names[j]
            // VD: "phan hoang sử" tách ra thành  ["phan","hoàng","sử"]
            for (int j = i + 1; j < names.length; j++) {
                String[] name_i = names[i].split(" ");
                String[] name_j = names[j].split(" ");


                //hàm (name_i[name_i.length - 1]) lấy từng phần tử cuối cùng ra
                //VD:"phan hoang sủ lấy thanh "sủ"
                //covertToString là
                //toUpperCase chuyển từ chữ thường thành chữ hoa

                String str_i = covertToString(name_i[name_i.length - 1]).toUpperCase();
                String str_j = covertToString(name_j[name_j.length - 1]).toUpperCase();


                // so sánh theo bảng chữ cái
                //compareTo là phương thức so sánh 2 chuỗi
                if (str_i.compareTo(str_j) > 0) {
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }

        // in ra danh sách theo bảng chữ cái a-z
        System.out.println("Danh sách sinh viên đã sắp xếp A-Z");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + ", ");
        }

        // tìm kiếm tên trong mảng
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nNhập từ khóa tìm kiếm: ");
        String key = scanner.nextLine();
        for (int i = 0; i < names.length; i++) {
            //contains dùng để kiểm tra tên sinh viên có chứa từ khóa timg kiếm hay không
            if (names[i].toLowerCase().contains(key.toLowerCase())) {
                System.out.print(names[i] + ", ");
            }
        }
    }

    public static String covertToString(String value) {
        try {
            // chuyển đổi tiếng việt thành không dấu
            //Normalizer.normalize(value, Normalizer.Form.NFD) là chuyển các kí tự có dấu thành dạng phân tách
            //VD: Ử thành U
            String temp = Normalizer.normalize(value, Normalizer.Form.NFD);

            //Loại bỏ dấu kết hợp (diacritical marks)
//            Pattern.compile("\\p{InCombiningDiacriticalMarks}+").replaceAll("") là dùng để loại bỏ tất cả các dấu thanh (dấu kết hợp) trong chuỗi
            // VD: á thanh a
            Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
            return pattern.matcher(temp).replaceAll("").toLowerCase().replaceAll(" ", "-").replaceAll("đ", "d");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}