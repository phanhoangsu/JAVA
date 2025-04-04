import java.util.Arrays;
import java.util.Scanner;

public class Asgn1 {
    public static void main(String[] args) {
        /**
         khởi tạo mảng số nguyeen1 chiều gồm n phần tử (n nhập từ bàn phím ).
         1. nhập giá trị cá phần tử mảng
         2. hiển thị mảng vừa nhập
         3.In ra phần tử có giá trị lớn nhất , nhỏ nhất
         4. In ra phần tử có giá trị số nguyên tố
         5. In ra phần tử có giá trị hoàn hảo
         6. sắp xếp mảng giảm dần
         */

        // khởi tạo mảng
        Scanner sc = new Scanner(System.in);
        // nhập vào kích thước của mảng
        System.out.print("nhập số phần tử của mảng : ");
        int n = Integer.parseInt(sc.nextLine());

        int[] songuyen = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("phần tử [" + i + "]=");
            songuyen[i] = Integer.parseInt(sc.nextLine());
        }
        // hiển thị mảng vừa nhập vô
        System.out.println("phần tử của mảng là :");
        for (int i = 0; i < n; i++) {
            System.out.print(songuyen[i] + " ");
        }
        // hiên thị giá trị lớn nhất và nhỏ nhất
        int max = songuyen[0];
        int min = songuyen[0];
        for (int i = 1; i < n; i++) {
            if (songuyen[i] > max) {
                max = songuyen[i];
            }
            if (songuyen[i] < min) {
                min = songuyen[i];
            }
        }
        System.out.println("\nGiá trị lớn nhất là : " + max);
        System.out.println("Giá trị nhỏ nhất là : " + min);

        // tìm và hiển thị số nguyên tố
        System.out.print("\nCác số nguyên tố trong mảng là : ");

        for (int num : songuyen) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        // tìm số hoàn hảo
        System.out.print("\nCác số hoàn hảo trong mảng là: ");
        for (int num : songuyen) {
            if (isPerfect(num)) {
                System.out.print(num + " ");
            }
        }
        //sắp xếp mảng giảm dần và hiển thị

        Arrays.sort(songuyen);
        System.out.println("\nMảng sắp xếp giảm dần : ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(songuyen[i] + " ");
        }

    }

    // hàm kiểm tra số nguyên tố
    public static boolean isPrime(int num) {
        // số nhỏ hơn hoặc bằng 1 không phải là số nguyên tố
        if (num <= 1) return false;
// kiểm tra các số từ 2 đến căn bậc bậc hai của num
        for (int i = 2; i <= Math.sqrt(num); i++) {
            // nếu chia hết cho i,tức là num có ước số khác 1 và chính nó
            if (num % i == 0) return false;
        }
        return true;
    }

    // hàm kiểm tra số hoàn hảo
    public static boolean isPerfect(int num) {
        // nếu num bé hơn hặc bằng 1 thì k tính
        if (num <= 1) return false;
        // khỏi tạo biến sum để lưu tổng các ước của num
        int sum = 1;
        for (int i = 2; i <= num / 2; i++) {

            if (num % i == 0) sum += i;

        }
        return sum == num;
    }
}




