public class InternetDeviceTest {
    public static void main(String[] args) {
        InternetDevice laptop = new InternetDevice("laptop");
        InternetDevice tablet = new InternetDevice("tablet");
        InternetDevice smartphone = new InternetDevice("smartphone");
        InternetDevice radio  = new InternetDevice("radio ");
        InternetDevice TV = new InternetDevice("TV");

        laptop.connect();
        tablet.connect();
        smartphone.connect();

        laptop.displayStatus();
        tablet.displayStatus();
        smartphone.displayStatus();
        radio.displayStatus();
        TV.displayStatus();

        InternetDevice.displayConnections();
    }
}
