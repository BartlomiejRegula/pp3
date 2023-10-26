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
    static int days(){
        int[] monthsArr= {31,28,31,30,31,30,31,31,31,30,31,30};
        int daysFromBeg = (month*monthsArr[month-1]) + day;
        return daysFromBeg;
    }
    /*
     * Returns month name
     */
    static String monthName(){
        String[] monthNamesArr = {"Styczeń","Luty","Marzec"
        ,"Kwiecień","Maj","Czerwiec","Lipiec",
        "Sierpień","Wrzesień","Październik","Listopad","Grudzień"};
        return monthNamesArr[month-1];        
    
    }


    public static void main(String[] args) {
        System.out.println(myDate());
        System.out.println(days());
        System.out.println(monthName());
    }
}

