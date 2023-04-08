import java.util.Comparator;

public class fullTimeStaff extends staff  {
    private double hardSalary;
    private double bonus;
    private double fine;
    public fullTimeStaff(){};

    public fullTimeStaff(String staffCode, String name, int age, int phone, String email, addressHome address, double hardSalary, double bonus, double fine) {
        super(staffCode, name, age, phone, email, address);
        this.hardSalary = hardSalary;
        this.bonus = bonus;
        this.fine = fine;
    }

    public double getHardSalary() {
        return hardSalary;
    }

    public void setHardSalary(double hardSalary) {
        this.hardSalary = hardSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    @Override
    public String toString() {
        return "Nhân viên full-time{" +
                "Mã nhân viên: "  + staffCode+
                ", Tên: " + name  +
                ", Tuổi: " + age +
                ", SĐT: " + phone +
                ", Email" + email  +
                ", Địa chỉ: " + address +
                ", Lương cứng: "+ hardSalary+
                ", Tiền thưởng: "+ bonus+
                ", Tiền phạt: "+fine+
                "} " ;
    }

    @Override
    public double realWages() {
        return this.hardSalary + this.bonus - this.fine;
    }

}
