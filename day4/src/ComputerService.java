import java.util.Arrays;

public class ComputerService {
    private Computer[] computers;
    private int initSize = 2;
    private int index = 0;

    public ComputerService() {
        computers = new Computer[initSize];
    }

    public ComputerService(Computer[] computer) {
        this.computers = computer;
    }

    public void add(Computer computer) {
        if (index == computers.length) {
            computers = Arrays.copyOf(computers, computers.length + initSize);
        }
        computers[index++] = computer;
    }

    public void display() {
        System.out.println("Danh sách máy tính ");
        for (int i = 0; i < index; i++) {
            System.out.println("Molder: " + computers[i].getModel());
            System.out.println("Brand: " + computers[i].getBrand());
            System.out.println("Price: " + computers[i].getPrice());
            System.out.println("==================================");
        }
    }

    public void delete(String model) {
        boolean found = false;
        for (int i = 0; i < index; i++) {
            if (computers[i].getModel().equalsIgnoreCase(model)) {
                found = true;
                for (int j = i; j < index - 1; j++) {
                    computers[j] = computers[j + 1]; //dịch phần tử lên
                }
                computers[index - 1] = null;// giảm index
                index--;
                System.out.println("Đã xóa máy tính có Model: " + model);
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy máy tính có Model: " + model);
        }
    }
    // trả về tất cả các computer đã lưu
    public Computer[] findAll() {
        return null;
    }
}
