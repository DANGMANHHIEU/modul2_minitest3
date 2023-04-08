import java.util.List;
import java.util.Scanner;

public class menu {
   public static Scanner sc = new Scanner(System.in);
   public static staffList List =new staffList();
   //nhân viên full-time
    public static void addFulltime(){
        System.out.println("Mã Nhân viên : "); String code = sc.nextLine();sc.nextLine();
        System.out.println("Họ và tên:");String name = sc.nextLine();
        System.out.println("Tuổi: ");int age = sc.nextInt();//sc.nextLine();
        System.out.println("SĐT: ");int phone = sc.nextInt();sc.nextLine();
        System.out.println("Email: ");String email=sc.nextLine();
        //địa chỉ
        System.out.println("Địa chỉ: ");
        System.out.println("Số nhà:");
        String homeNumber = sc.nextLine();
        System.out.println("Xã:");
        String commune = sc.nextLine();
        System.out.println("Huyện:");
        String district = sc.nextLine();
        System.out.println("Tỉnh:");
        String conscious =sc.nextLine();
       addressHome addressHome=new addressHome(homeNumber,commune,district,conscious);

        System.out.println("Lương cứng:");double salary= sc.nextDouble();
        System.out.println("Tiền thưởng:");double bonus= sc.nextDouble();
        System.out.println("Tiền phạt:");double fine = sc.nextDouble();

      fullTimeStaff fullTime = new fullTimeStaff(code,name,age,phone,email,addressHome,salary,bonus,fine);
      List.addStaff(fullTime);
    }

    //thêm nhân viên part-time
    public static void addPartTime(){
        System.out.println("Mã Nhân viên : "); String code = sc.nextLine();sc.nextLine();
        System.out.println("Họ và tên:");String name = sc.nextLine();
        System.out.println("Tuổi: ");int age = sc.nextInt();//sc.nextLine();
        System.out.println("SĐT: ");int phone = sc.nextInt();sc.nextLine();
        System.out.println("Email: ");String email=sc.nextLine();
        //địa chỉ
        System.out.println("Địa chỉ: ");
        System.out.println("Số nhà:");
        String homeNumber = sc.nextLine();
        System.out.println("Xã:");
        String commune = sc.nextLine();
        System.out.println("Huyện:");
        String district = sc.nextLine();
        System.out.println("Tỉnh:");
        String conscious =sc.nextLine();
        addressHome addressHome=new addressHome(homeNumber,commune,district,conscious);

        System.out.println("Số giờ làm: ");double hourWorking= sc.nextDouble();
        System.out.println("Tiền 1 giờ làm:");int money1hour= sc.nextInt();

        partTimeStaff partTime = new partTimeStaff(code,name,age,phone,email,addressHome,hourWorking,money1hour);
        List.addStaff(partTime);
    }
    // hiểnthijij danh sách sinh viên
    public static void display(){
        List.renderStaff();
    }

    //lương trung bình của cả công ty
    public static void average(){
        System.out.println(List.averageWage());
    }

    //danh sách toàn nv Fulltime lương thấp hơn trung bình
    public static void shortWage(){
        List.shortStaffWage();
    }

    //tổng lương trả cho nhân viên part-time
 public static void totalPartTime(){
     System.out.println(List.totalWagePartTime());
 }

 //sắp sếp nhân viên toàn thời gian theo lương
    public static void shortHigh(){
        List.ascending();
    }
}
