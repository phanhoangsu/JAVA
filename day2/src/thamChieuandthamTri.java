public class thamChieuandthamTri {

    public static void main(String[] args) {

        // TRUYỀN THAM TRỊ
        int a = 5, b = 6, c = 7;
        thamtri(a, b, c);
        System.out.println("Sau khi gọi tham trị ");
        System.out.println(" || a= " + a + ", || b= " + b + ", || c= " + c);

        // TRUYỀN THAM CHIẾU

        // KHỞI TẠO ĐỐI TƯỢNG THAMCHIEU
        thamChieu THAMCHIEU = new thamChieu(7, 8, 9);
        thamChieu(THAMCHIEU);
        System.out.println("Sau khi gọi tham chiếu ");
        System.out.println(" || D= " + THAMCHIEU.getD() + " || E= " + THAMCHIEU.getE() + " || F= " + THAMCHIEU.getF());
    }


    // ĐÂY LÀ HÀM THAM TRỊ
    public static void thamtri(int a, int b, int c) {
        int temp = a;
        a = b;
        b = c;
        c = temp;
        System.out.println("Trong hàm tham trị ");
        System.out.println("a= " + a + " b= " + b + " c= " + c);

    }

    // ĐÂY LÀ HÀM THAM CHIẾU
    public static void thamChieu(thamChieu obj) {// thamChieu là tên của phương thứ ,obj thứ là tên của tham số truyền vào
        int temp = obj.getD();
        obj.setD(obj.getE());
        obj.setE(obj.getF());
        obj.setF(temp);

        System.out.println("Trong hàm tham chiếu:  ");
        System.out.println("a= " + obj.getD() + " b= " + obj.getE() + " c= " + obj.getF());

    }
}

//truyền tham trị có nghĩa là khi một biến được truyền vào 1 phương thức , 1 bản sao của giá trị của nó tạo ra và sử dụng
//trong phương thức , ĐIỀU NÀY MỘ THAY ĐỔI BÊN TRONG PHƯƠNG THỨC KHÔNG ẢNH HƯỞNG ĐẾN BIẾN GỐC
//**kết luận :JAVA LUÔN TRUYỀN THAM TRỊ VỚI KIỂU DŨ LIỆU NGUYÊN THỦY , KHÔNG CÓ CÁCH NÀO ĐỂ THAY ĐỔI GIÁ TRỊ CỦA BIẾN GỐC TỪ TRONG PHƯƠNG THỨC
