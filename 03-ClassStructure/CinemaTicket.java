public class CinemaTicket {
    static String cinemaName = "Fajne kino :)";
    String title;
    int row;
    int seat;
    int price;

    public String toString(){
        return cinemaName  + title+" " + row +" "  + seat +" " + price;

    }

    public static void main(String[] args) {
        
        CinemaTicket c = new CinemaTicket();
        c.title = "gowno";
        c.row = 213;
        c.seat = 420;
        c.price = 231;

        System.out.println(c);
    }
}
