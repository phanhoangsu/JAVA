//import java.util.Scanner;
//
//public class Asgn2 {
//    public static void main(String[] args) {
//        /* Viết chương trình in ra bảng cửu chương thừ 1 -> 9
//        VD:
//        1 x 1 = 1   2 x 1 = 2   ...
//        1 x 2 = 2   2 x 2 = 4
//        1 x 3 = 3   2 x 3 = 6
//        1 x 4 = 4   2 x 4 = 8
//        1 x 5 = 5   2 x 5 = 10
//        1 x 6 = 6   2 x 6 = 12
//        1 x 7 = 7   2 x 7 = 14
//        1 x 8 = 8   2 x 8 = 16
//        1 x 9 = 9   2 x 9 = 18
//        * */
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("nhập bảng cửu chương : ");
//        int so = Integer.parseInt(input.nextLine());
////        System.out.printf("bẳng cửu chương vừa nhập là %d : ", so  ); dấu phẩu là dùng printf
//        System.out.println("bẳng cửu chương vừa nhập là " + so + ":");//dấu +là dùng println
//
//
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(so + " x " + i + " = " + (so * i));
//        }
//    }
//}
//



public class Asgn2 {
    public static void main(String[] args) {
        /* Viết chương trình in ra bảng cửu chương thừ 1 -> 9
        VD:
        1 x 1 = 1   2 x 1 = 2   ...
        1 x 2 = 2   2 x 2 = 4
        1 x 3 = 3   2 x 3 = 6
        1 x 4 = 4   2 x 4 = 8
        1 x 5 = 5   2 x 5 = 10
        1 x 6 = 6   2 x 6 = 12
        1 x 7 = 7   2 x 7 = 14
        1 x 8 = 8   2 x 8 = 16
        1 x 9 = 9   2 x 9 = 18
        * */

        for (int i = 1; i < 10; i++) {
            String tinhtoan="";
            for (int j = 1; j < 10; j++) {
              tinhtoan +=j+"x"+i+"="+(i*j)+"\t";
            }
            System.out.println(tinhtoan);
        }
    }
}