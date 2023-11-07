public class DrivingLicenseTest {
    public static void main(String[] args) {
        DrivingLicense d = new DrivingLicense();
        d.setDriversName("tomek");
        d.setAddres("ulica R");
        d.setYear(2024);
        System.out.println(d.toString());
    }
}
