public class addressHome {
    private String homeNumber;
    private String commune;
    private String district;
    private String conscious;
    public addressHome(){};

    public addressHome(String homeNumber, String commune, String district, String conscious) {
        this.homeNumber = homeNumber;
        this.commune = commune;
        this.district = district;
        this.conscious = conscious;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(String homeNumber) {
        this.homeNumber = homeNumber;
    }

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getConscious() {
        return conscious;
    }

    public void setConscious(String conscious) {
        this.conscious = conscious;
    }

    @Override
    public String toString() {
        return "Địa chỉ:{" +
                "Số nhà: " + homeNumber  +
                ", xã " + commune  +
                ", huyện " + district  +
                ", tỉnh " + conscious  +
                '}';
    }
}
