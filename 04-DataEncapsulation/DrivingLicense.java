public class DrivingLicense {

    private String driversName = "tomek";
    private String addres;
    private String postalCode;
    private String city;
    private String licenseNumber;
    private int year;
    private String licenseCategory;

    public String getDriversName() {
        return driversName;
    }
    public String getAddres() {
        return addres;
    }
    public String getPostalCode() {
        return postalCode;
    }
    public String getCity() {
        return city;
    }
    public String getLicenseNumber() {
        return licenseNumber;
    }
    public int getYear() {
        return year;
    }
    public String getLicenseCategory() {
        return licenseCategory;
    }

    

    public void setDriversName(String driversName) {
        this.driversName = driversName;
    }
    public void setAddres(String addres) {
        this.addres = addres;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setLicenseCategory(String licenseCategory) {
        this.licenseCategory = licenseCategory;
    }
    public void display(){
        System.out.printf("Name: %s\naddres: %s\npostal code: %s\ncity: %s\nlicense: %s\n ",
        getDriversName(),getAddres(),getPostalCode()
        ,getCity(),getLicenseNumber());
    }
    @Override
    public String toString() {
        return "DrivingLicense [driversName=" + driversName + ", addres=" + addres + ", postalCode=" + postalCode
                + ", city=" + city + ", licenseNumber=" + licenseNumber + ", year=" + year + ", licenseCategory="
                + licenseCategory + "]";
    }


    

}