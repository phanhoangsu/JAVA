        import java.util.Scanner;

        public class ComputerManager {
            public static void main(String[] args) {
                Scanner CM = new Scanner(System.in);
                ComputerService computerService = new ComputerService();
                while (true) {
                    System.out.println("1. Nhập máy tính ");
                    System.out.println("2. Danh sách máy tính ");
                    System.out.println("3. Xóa máy tính");
                    System.out.println("4. Tìm kiếm máy tính ");
                    System.out.println("0. Thoát");
                    System.out.println("Chọn chức năng : ");
                    int chon = Integer.parseInt(CM.nextLine());

                    switch (chon) {
                        case 1:
                            System.out.println("Nhập thông tin máy tính ");
                            Computer computer = new Computer();
                            System.out.println("Model: ");
                            computer.setModel(CM.nextLine());
                            System.out.println("Brand: ");
                            computer.setBrand(CM.nextLine());
                            System.out.println("Price: ");
                            computer.setPrice(Double.parseDouble(CM.nextLine()));
                            computerService.add(computer);
                            break;

                        case 2:
                            computerService.display();
                            break;
                        case 3:
                            // xóa máy tính đã được thêm trong mảng dựa trên model
                            System.out.print("Nhập model cần xóa: ");
                            String modelToDelete = CM.nextLine();
                            computerService.delete(modelToDelete);
                            break;
        //                case 4://tìm kiếm theo tên


                        case 0:
                            System.out.println("Thoát chương trình ");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Lựa chọn không hợp lệ, vui lòng nhập lại!");
                            break;

                    }
                }
            }
        }
