import java.util.Scanner;

public class Asgn1 {
    public static void main(String[] args) {
        // viết chương trình nhập vào tháng ,năm.Hiển thị tháng năm đó có bao nhiêu ngày
        //VD:input:tháng=3,năm 2025=>tháng 3 năm 2025 có 30 ngày

        Scanner input = new Scanner(System.in);
        System.out.println("nhập vào tháng : ");
        int thang = Integer.parseInt(input.nextLine());

        System.out.println("nhập vào năm : ");
        int nam = Integer.parseInt(input.nextLine());

        int songay=0;

        switch (thang) {
            case 1, 3, 5, 7, 8, 10, 12:
                songay = 31;
                break;
            case 4, 6, 9, 11:
                songay = 30;
                break;
            case 2:
                if (nam % 4 == 0 && nam % 100 != 0 || nam % 400 == 0) {
                    songay = 29;
                } else {
                    songay = 28;

                }
            default:
                System.out.println("Tháng không hợp lệ !");
                return;
        }
        System.out.printf("tháng %d năm %d có %d ngày ", thang, nam, songay);

    }
}
