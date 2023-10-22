public class HoursAndMinutes {
    public static void main(String[] args) {
        int hours = 14;
        int minutes = 26;

        // System.out.print("time: "+hours+ ":" + minutes + "\n");

        System.out.printf("time: %d:%d \n",hours,minutes);

        int MinutesFromMidnight = (hours * 60) + minutes;
        System.out.println("Minutes from midnight: " + MinutesFromMidnight);

        int SecondsFromMidnight = MinutesFromMidnight * 60;
        System.out.println("Seconds from midnight: " + SecondsFromMidnight);
    }
}
