import java.util.Scanner;

public class Asgn3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("nhập vào số nguyên dương: ");
        int n = Integer.parseInt(input.nextLine());

        int tongchan = 0, tongle = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                tongchan += i;
            } else {
                tongle += i;
            }
        }

        System.out.println("tổng các  số  chẵn " + n + " là : " + tongchan);
        System.out.println("tổng các  số  chẵn " + n + " là : " + tongle);


    }

}
