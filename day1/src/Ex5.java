public class Ex5 {
    // global varible
    static int b = 1;

    public static void main(String[] args) {

        // local varible

        int a = 4;
        b =a + 1;
        Test();
        System.out.println("a= "+a);

    }

    public static void Test() {
        System.out.println("c= " + b);
    }
}
