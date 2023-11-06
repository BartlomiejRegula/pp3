public class ClockTest {
    public static void main(String[] args) {

    Clock c = new Clock(12,47);
    c.setAlarm(0, 1);
    c.displayTime();
    c.setClock(18,14);
    c.displayTime();
    c.setClock(9,3);
    c.displayTime();
    c.setClock(23,58);
    c.displayTime();
    c.addOneMinute();
    c.displayTime();
    c.addOneMinute();
    c.displayTime();
    c.addOneMinute();
    c.displayTime();


    }
}
