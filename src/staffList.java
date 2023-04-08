import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class staffList {
    private ArrayList<staff> listStaff;
    public staffList(){
        this.listStaff=new ArrayList<>();
    }
    public staffList(ArrayList<staff> list){
        this.listStaff=list;
    }
    // add nhân viên
    public void addStaff(staff list){
        this.listStaff.add(list);
    }

    // xóa nhân viên theo mã nhân viên
    public void deleteStaff(String codeStaff){
        for (staff n:listStaff){
            if(n.getStaffCode().equals(codeStaff)){
                this.listStaff.remove(n);
            }
        }
    }

    // sửa nhân viên theo mã
    public void updateStaff(String codeStaff, staff list){
        int index =0;
        for(staff n : listStaff){
            if(n.getStaffCode().equals(codeStaff)){
                index = listStaff.indexOf(n);
                break;
            }
        }
        listStaff.set(index,list);
    }

    // hiển thị nhân viên
    public void renderStaff(){
        for (staff n : listStaff){
            System.out.println(n);
        }
    }

    //tính trung bình lương nhân viên công ty
    public double averageWage(){
        double total =0;
        for(staff n:listStaff){
            total+=n.realWages();
        }
        return total/(listStaff.size());
    }

    //danh sách nhân viên fulltime có mức lương  thấp hơn mức trung bình
    public void shortStaffWage(){
        for(staff n: listStaff){
            if(n instanceof fullTimeStaff){
                if(n.realWages()<averageWage()){
                    System.out.println(n);
                }
            }
        }
    }


    //tính  tổng lương phải trả cho toàn nhân viên part-time
   public double totalWagePartTime(){
        double total =0;
        for(staff n: listStaff ){
            if(n instanceof partTimeStaff){
                total += n.realWages();
            }
        }
        return total;
   }

   // sắp xếp nhân viên toàn thời gian theo mức lương tăng dần

 public void ascending(){
         ArrayList<fullTimeStaff>listNew=new ArrayList<>();
        for(staff n : listStaff){
            if(n instanceof fullTimeStaff){
               listNew.add((fullTimeStaff) n);
            }
        }
        Collections.sort(listNew, new Comparator<fullTimeStaff>() {
            @Override
            public int compare(fullTimeStaff o1, fullTimeStaff o2) {
                if(o1.realWages()>o2.realWages()){
                    return 1;
                } else if (o1.realWages()<o2.realWages()){
                    return  -1;
                }
                else return 0;
            }
        });
     for(fullTimeStaff n: listNew){
         System.out.println(n);
     }
 }

}
