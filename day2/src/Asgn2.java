import java.util.Arrays;
import java.util.Scanner;

public class Asgn2 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);

//        // Nhập kích thước ma trận
//        System.out.print("Nhập vào số hàng: ");
//        int h = Integer.parseInt(sc.nextLine());
//        System.out.print("Nhập vào số cột: ");
//        int c = Integer.parseInt(sc.nextLine());
//
//        int[][] a = new int[h][c];
//
//        // 1. Nhập các phần tử của ma trận
//        System.out.println("Nhập các phần tử của mảng:");
//        for (int i = 0; i < h; i++) {// số hàng
//            for (int j = 0; j < c; j++) {// số cột
//                System.out.print("a[" + i + "][" + j + "] = ");
//                a[i][j] = Integer.parseInt(sc.nextLine());
//            }
//        }
//
//        // 2. Hiển thị ma trận
//        System.out.println("\nMa trận vừa nhập:");
//        for (int i = 0; i < h; i++) {
//            for (int j = 0; j < c; j++) {
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        // 3. In các phần tử trên đường biên
//        System.out.println("\nCác phần tử trên đường biên:");
//        for (int i = 0; i < h; i++) {
//            for (int j = 0; j < c; j++) {
//                if (i == 0 || i == h - 1 || j == 0 || j == c - 1) {
//                    System.out.print(a[i][j] + " ");
//                }
//            }
//        }
//        System.out.println();
//
//        // 4. In và tính tổng đường chéo chính và phụ
//        if (h == c) { // Kiểm tra ma trận vuông
//            System.out.println("\nĐường chéo chính:");
//            int tongCheoChinh = 0;
//            for (int i = 0; i < h; i++) {
//                System.out.print(a[i][i] + " ");
//                tongCheoChinh += a[i][i];
//            }
//            System.out.println("\nTổng đường chéo chính: " + tongCheoChinh);
//
//            System.out.println("\nĐường chéo phụ:");
//            int tongCheoPhu = 0;
//            for (int i = 0; i < h; i++) {
//                System.out.print(a[i][h - 1 - i] + " ");
//                tongCheoPhu += a[i][h - 1 - i];
//            }
//            System.out.println("\nTổng đường chéo phụ: " + tongCheoPhu);
//        }
//
//        // 5. Sắp xếp các cột tăng dần
//        for (int j = 0; j < c; j++) {
//            int[] cot = new int[h];
//            for (int i = 0; i < h; i++) {
//                cot[i] = a[i][j];
//            }
//            Arrays.sort(cot);
//            for (int i = 0; i < h; i++) {
//                a[i][j] = cot[i];
//            }
//        }
//
//        // Hiển thị ma trận sau khi sắp xếp
//        System.out.println("\nMa trận sau khi sắp xếp các cột tăng dần:");
//        for (int i = 0; i < h; i++) {
//            for (int j = 0; j < c; j++) {
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }

        // sắp xếp các cột trong mảng tăng dần

        //khởi tạo mảng
        try {
            int[][] nums = new int[4][];
            nums[0] = new int[]{7, 3, 9};
            nums[1] = new int[]{6, 5, 4};
            nums[2] = new int[]{5, 4, 3};
            nums[3] = new int[]{8, 2, 6};

            // hàm i chạy từ i=0 đến i=2 (tướng ứng với cột 1,2,3)
            for (int i = 0; i < 3; i++) {// duyệt từng cột

                // duyệt từng hàng trong cột đang xét
                // chạy từ j=0 đến j=2 từ hàng trên xuống hàng dưới
                for (int j = 0; j < 4; j++) {// duyệt từng hàng(lần lượt từng phần tử trong cột)

                    // duyệt các phần tử bên dưới phần tử hiện tại
                    // nếu giá trị hàng trn lớn hơn giá tr bên dưới thì đổi chỗ
                    for (int k = j + 1; k < 4; k++) {// so sánh với các hàng bên dưới
                        if (nums[j][i] > nums[k][i]) {// ĐK: nếu phần tử trên lớn hơn phần tử dưới thì đổi chỗ)
                            int temp = nums[j][i];
                            nums[j][i] = nums[k][i];
                            nums[k][i] = temp;
                        }
                    }
                }
            }
            System.out.println("sắp xếp mảng tăng dần : ");
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(nums[i][j] + " ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Lỗi " + e.getMessage());
        }
    }
}
