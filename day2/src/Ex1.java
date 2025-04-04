import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        // viết chương trình java khởi tạo mảng 1 chiều số nguyên n phần tử
        // nhập từ bàn phím , thực hiện các yêu cầu sau:
        // 1. Nhập giá trị các phần tử của mảng
        //2. In ra các phần tử của mảng
        //3. tính tổng các phần tử của mảng
        //4. In giá trị các phần tử là chẵn
        // 5. sắp xếp mảng tăng dần
        //6. thoát

      Scanner input = new Scanner(System.in);

        System.out.print("nhập số phần tử của mang : ");
        int n=Integer.parseInt(input.nextLine());

        int [] phan= new  int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("phantu[" + i + "] = " );
            phan[i] = Integer.parseInt(input.nextLine());
        }
        System.out.println("phần  tử của mảng : ");
        for (int i = 0; i < n; i++) {
            System.out.print(phan[i] + " ");
        }
//        tính tổng
        int tinhtong=0;
        for (int i = 0; i < n; i++) {
            tinhtong +=phan[i];
        }
        System.out.println("tổng giá trị các phần tử  là : "+tinhtong);

        //in ra các phần tử chẵn
        System.out.println("các phần tử chẵn : ");
        for (int i = 0; i < n; i++) {
            if(phan[i]%2==0){
                System.out.print(phan[i] +" ");
            }
        }
        // sắp xếp mảng tăng dần
        System.out.print("\nmảng sau khi sắp xếp :");
        for (int i = 0; i < n; i++) {
            for(int j=0;j<n;j++){
                if(phan[i]>phan[j]){// sắp xếp
                    int temp=phan[i];
                    phan[i]=phan[j];
                    phan[j]=temp;

                }
            }

        }
        for (int phantu : phan){
            System.out.print(phantu + " ");
        }


    }

}
