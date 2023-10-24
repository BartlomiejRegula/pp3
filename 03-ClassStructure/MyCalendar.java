public class MyCalendar {
    static int year = 2023;
    static int month = 4;
    static int day = 9;

    /*
     * Returns date
     * in the form yyyy-mm-dd
     */
    static String myDate(){
        String x = String.format("%d-%02d-%02d", year, month, day);
        return x;
    }
    
    /*
     * Returns the number of days
     * from the beginning of year
     */
    static String days(){
        return null;
    }
    /*
     * Returns month name
     */
    public static void main(String[] args) {
        System.out.println(myDate());
    }
}

