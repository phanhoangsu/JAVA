package greenAcademy;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Student {
    //fields
    private String id;
    private String name;
    private int age;
    private String email;

    public Student() {}

    // Alt+Insert generate code (constructor,getter,setter,..)


// Constructor
 public Student(String id, String name, int age, String email) {
     this.id = id;
     this.name = name;
     this.age = age;
     this.email = email;
 }

// Getter/Setter
 public String getId() {
     return id;
 }
 public void setId(String id) {
     this.id = id;
 }
 public String getName() {
     return name;
 }
 public void setName(String name) {
     this.name = name;
 }
 public int getAge() {
     return age;
 }
 public void setAge(int age) {
     this.age = age;
 }
 public String getEmail() {
     return email;
 }
 public void setEmail(String email) {
     this.email = email;
 }

public  void nhap() {
    Scanner st = new Scanner(System.in);
    System.out.print("Nhập mã sinh viên : ");
    this.id=st.nextLine();
    System.out.print("Nhập tên sinh viên : ");
    this.name=st.nextLine();
    System.out.print("Nhập tuổi sinh viên : ");
    this.age=Integer.parseInt(st.nextLine());
    System.out.print("Nhập email sinh viên : ");
    this.email=st.nextLine();
    System.out.println("=========================");
}
public void nhap2() {
    System.out.println("Mã sinh viên : " +this.id);
    System.out.println("Họ và tên : " +this.name);
    System.out.println("Tuổi : " +this.age);
    System.out.println("Email : " +this.email);
    System.out.println("=========================");
    }
}
