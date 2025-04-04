//import java.util.Scanner;
//
//public class daChieu {
//    public static void main(String[] args) {
//
//        // khởi tạo đối tượng
//        Scanner input = new Scanner(System.in);
//
//        //nhập số hàng của mảng
//
//        System.out.println("nhập vào số hàng : ");
//        int hang = Integer.parseInt(input.nextLine());
//        // nhập số cột của mảng
//
//        System.out.println("nhập vào số cột : ");
//        int cot = Integer.parseInt(input.nextLine());
//
//        // khai báo mảng 2 chiều(nhập text)
//        String[][] name = new String[hang][cot];
//

import javax.imageio.stream.ImageInputStream;
import java.util.Scanner;

/// /        duyệt và nhập giá trị cho từng phần tử của mảng
//        for (int i = 0; i < hang; i++) {// duyệt qua từng hàng
//            for (int j = 0; j < cot; j++) {// duyệt qua từng cột
//                System.out.print("nhập giá trị[" + i + "][" + j + "] = ");
//                name[i][j] = input.nextLine();// nhập giá trị từ người dùng cho phần tử của mảng
//            }
//
//        }
//
//        // hển thị giá trị của mảng 2 chiều
//        System.out.println("mảng đa chiều :");
//        for (int i = 0; i < hang; i++) {// duyệt qua từng hàng
//            for (int j = 0; j < cot; j++) {// duệt qua từng cột
//                System.out.print(name[i][j] + " ");//in giá trị của phần từ
//            }
//            System.out.println();
//        }
//
//    }
//}


public class daChieu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("nhập sô hàng : ");
        int H = Integer.parseInt(input.nextLine());
        System.out.println("nhập số cột : ");
        int C = Integer.parseInt(input.nextLine());

            // nhập số
        int[][] nhap = new int [H][C];

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print("nhập giá trị[" + i + "][" + j + "] : ");
                nhap[i][j] = Integer.parseInt(input.nextLine());
            }
        }
        System.out.println("mảng hai chiều: ");
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(nhap[i][j]+" ");
            }
            System.out.println();
        }
    }
}