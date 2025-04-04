import java.util.Scanner;

public class thuong_sang_hoa {
    public static void main(String[] args) {
        // nhập vào 1 chuỗi => chuyển chữ cái dầu tiên từ thường sang cữ hoa

//khai báo
        Scanner sc = new Scanner(System.in);

        //hiển  thị thông báo cho người dùng nhập vào

        // In ra thông báo yêu cầu người dùng  nhập chuỗi vào
        System.out.print("Nhập vào chuỗi : ");
        // đọc toàn bộ dòng chỗi người dùng nhập vào và loại bỏ tất cả khoảng trắng dư thừa
        String nh = sc.nextLine().trim();// .trim là loại bỏ các khoảng trắng dư thừa ở đầu và cuối

        // điều kiện là chuỗi rõng thì in ra thong báo và kết thức chương trình(dùng phương thức isEmpty())

        // kểm tra xem chuỗi có rỗng không
        if (nh.isEmpty()) {
            // nếu rỗng thì in ra thông báo
            System.out.println("Chuỗi rỗng, không thể xử lí!");
           // kết thúc chương trình
            return;
        }

        // tách chuỗi thành mảng các từ , dùng "\\s+" để xử lí 1 hoặc nhiểu khoảng trắng
        String[] strs = nh.split("\\s+");

        // vòng lặp duyệt qua các từ trong mảng
        for (int i = 0; i < strs.length; i++) {


            //kiểm tra xem từ tại vị trí [i] có rỗng không
            if (!strs[i].isEmpty()) {
                // chuyển từ kí đầu tin thành chữ hoa và ghép với phần còn lại
                strs[i] = strs[i].substring(0, 1).toUpperCase() + strs[i].substring(1);
            }
        }
        System.out.println(String.join(" ", strs));

    }
}
