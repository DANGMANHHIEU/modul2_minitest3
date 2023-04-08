public class partTimeStaff extends staff{
    private double workingHours;
    private int money1Hours = 100000;
    public partTimeStaff(){};

    public partTimeStaff(String staffCode, String name, int age, int phone, String email, addressHome address, double workingHours, int money1Hours) {
        super(staffCode, name, age, phone, email, address);
        this.workingHours = workingHours;
        this.money1Hours = money1Hours;
    }

    public double getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
    }

    public int getMoney1Hours() {
        return money1Hours;
    }

    public void setMoney1Hours(int money1Hours) {
        this.money1Hours = money1Hours;
    }

    @Override
    public String toString() {
        return "Nhân viên part-time{" +
                "Mã nhân viên: "  +staffCode+
                ", Tên: " + name  +
                ", Tuổi: " + age +
                ", SĐT: " + phone +
                ", Email" + email  +
                ", Địa chỉ: " + address +
                ", Tiền 1 giờ: "+ money1Hours+
                ", Số giờ làm: "+ workingHours+
                "} " ;
    }

    @Override
    public double realWages() {
        return this.workingHours * this.money1Hours;
    }
}
