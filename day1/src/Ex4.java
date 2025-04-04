import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        // nhập vào 1 số có 4 chữu số , hiển thị ra các chữ số là nghìn , trăm , chục ,đơn vị
        // VD: 1234=> 1 nghìn 2 trăm  3 chục 4 đơn vị

        Scanner input = new Scanner(System.in);
        System.out.println("nhập vào có 4 chữ số: ");
        int number = Integer.parseInt(input.nextLine());

        int nghin = 0, tram = 0, chuc = 0, donvi = 0;

        if (number < 1000 || number > 9999) {
            System.out.print(("vui lòng chỉ nhập vào đúng 4 chứ số!"));
            return;

        } else {
            nghin = number / 1000;
            tram = (number % 1000) / 100;
            chuc = (number % 100) / 10;
            donvi = number % 10;
        }
        System.out.println(nghin + " nghìn " + tram + " tram " + chuc + " chuc " + donvi + " donvi ");

    }
}
