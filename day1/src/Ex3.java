import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào các tháng : ");
        int age = Integer.parseInt(input.nextLine());
        String thang = null;
        switch (age) {
            case 1:
                thang = "tháng 1";
                break;
            case 2:
                thang = "tháng 2";
                break;
            case 3:
                thang = "tháng 3";
                break;
            case 4:
                thang = "tháng 4";
                break;
            case 5:
                thang = "tháng 5";
                break;
            case 6:
                thang = "tháng 6";
                break;
            case 7:
                thang = "tháng 7";
                break;
            case 8:
                thang = "tháng 8";
                break;
            case 9:
                thang = "tháng 9";
                break;
            case 10:
                thang = "tháng 10";
                break;
            case 11:
                thang = "tháng 11";
                break;
            case 12:
                thang = "tháng 12";
                break;
            default:
                System.out.print("bạn chỉ nhập giá trị  từ 1->12!");
                return;
        }
//        if (thang != null) {
//            System.out.print("Hôm nay là: " + thang);
//        }
        System.out.print("Hôm nay là: " + thang);
    }
}

