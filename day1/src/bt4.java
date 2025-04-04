import java.util.Scanner;

public class bt4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhập vào số nguyên dương :");
        int nguyenduong = Integer.parseInt(input.nextLine());

        if (nguyenduong <= 0) {
            System.out.println("vui lòng nhập vào số nguyên dương");
        }
        int sochiahetcho3 = 0, sokhongchiahetcho3 = 0;

        for (int i = 1; i <= nguyenduong; i++) {
            if (i % 3 != 0) {

                sochiahetcho3 += i;

            } else {
                sokhongchiahetcho3 += i;
            }
        }
        System.out.println(" số chia hết cho 3 là: " + sochiahetcho3);
        System.out.println(" số không chia hết cho 3 là: " + sokhongchiahetcho3);
    }
}
