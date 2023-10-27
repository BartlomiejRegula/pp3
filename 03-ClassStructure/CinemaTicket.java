public class CinemaTicket {
    static String cinemaName = "Fajne kino";
    String title;
    int row;
    int seat;
    int price;

    public String toString(){
        return cinemaName+"\n"  + title+"\n" + row +"\n"  + seat +"\n" + price;

    }

        
     public CinemaTicket(String title,int row,int seat){
        if (row <=2){
            price = 10;
        } else {
            price = 25;
        }
        this.title = title;
        this.row=row;
        this.seat=seat;
    }


    public static void main(String[] args) {
        
        CinemaTicket c = new CinemaTicket("Gladiatior",2,420);


        System.out.println(c);
    }
}
