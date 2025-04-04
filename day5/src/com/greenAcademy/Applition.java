package com.greenAcademy;

import java.util.Scanner;

public class Applition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Quản lí danh mục : ");
            System.out.println("2. Quản lí sản phẩm : ");
            System.out.println("0. Thoát  ");
            System.out.print("Chọn chức năng: ");
            int ch = Integer.parseInt(sc.nextLine());
            switch (ch) {
                case 1:
                    break;
                case 2:
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Bạn chọn sai chức năng. Vui lòng chọn lại!");
                    break;

            }
        }
    }

    public static void categoryManager(Scanner sc) {
        while (true) {
            System.out.println("________________ QUẢN LÍ SẢN PHẨM __________________");
            System.out.println("1. chọn sản phẩm ");
//            System.out.println("2. hiển thị dnah mục ");
//            System.out.println("0. quay lại ");
//            System.out.print("chọn chức năng");
            int cho = Integer.parseInt(sc.nextLine());
            switch (cho) {
                case 1:
                    break;

                case 2:
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Bạn chọn sai chức năng. Vui lòng chọn lại!");
                    break;
            }
        }
    }
}
