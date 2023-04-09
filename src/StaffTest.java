import java.util.Scanner;

public class StaffTest {
    public static void main(String[] args) {
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Vui lòng chọn chức năng:");
            System.out.println(
                    "1.Thêm nhân viên toàn full-time.\n"
                            +"2.Thêm nhân viên part-time \n"
                            +"3.Hiển thị danh sách nhân viên\n"
                            +"4.Lương trung bình cả công ty.\n"
                            +"5.Danh sách toàn nv Fulltime lương thấp hơn lương trung bình.\n"
                            +"6.Tổng lương trả cho nhân viên part-time\n"
                            +"7.Sắp sếp nhân viên toàn thời gian theo lương \n"
                            +"0.Exit");
            System.out.println();
            choice=sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Thêm nhâ viên full-time:");
                    menu.addFulltime();
                    break;
                case 2:
                    System.out.println("Thêm nhân viên part-time:");
                    menu.addPartTime();
                    break;
                case 3:
                    System.out.println("Hiển thị danh sách nhân viên: ");
                    menu.display();
                    break;
                case 4:
                    System.out.println("Lương trung bình của công ty: ");
                    menu.average();
                    break;
                case 5:
                    System.out.println("Danh sách lương nhân viên fulltime thấp hơn lương trung bình:");
                    menu.shortWage();
                    break;
                case 6:
                    System.out.println("Tổng lương nhân viên part-time:");
                    menu.totalPartTime();
                    break;
                case 7:
                    System.out.println("Lương nhân viên fulltime từ thấp đến cao:");
                    menu.shortHigh();
                default:
                    System.out.println("Vui lòng chọn đúng chức năng!!!");
            }

        }while (choice != 0);
    }
}
