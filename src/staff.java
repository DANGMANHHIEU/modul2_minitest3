public abstract class staff {
    protected String staffCode;
    protected String name;
    protected int age;
    protected int phone;
    protected String email;
    protected addressHome address;
    public staff(){};

    public staff(String staffCode, String name, int age, int phone, String email, addressHome address) {
        this.staffCode = staffCode;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public String getStaffCode() {
        return staffCode;
    }

    public void setStaffCode(String employeeCode) {
        this.staffCode = employeeCode;
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

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public addressHome getAddress() {
        return address;
    }

    public void setAddress(addressHome address) {
        this.address = address;
    }
    public abstract double realWages();
}
