public class demoString {
    public static void main(String[] args) {
        String a = "abc";
        String b = "abc";
        String c = new String("abc");


        System.out.println("a=b:"+(a==b));
        System.out.println("a=c:"+(a==c));
    }
}
