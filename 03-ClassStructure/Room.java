public class Room {
    int number;
    int beds;
    boolean ocupied;
    String guestName;

    public Room(int number){
        this.number = number;
        this.beds = 2;
        this.ocupied = false;
        this.guestName = null;
    }

    public Room(int number,int beds){
        this.number = number;
        this.beds = 2;
        this.ocupied = true;
        this.guestName = null;
    }

    public void checkin(String guestName){
        this.guestName = guestName;
        this.ocupied = true;
    }

    public void checkout(){
        this.ocupied = false;
    }

    public boolean isOcupied() {
        return ocupied;
    }

    public String displayStatus(){
        return String.format("room number: %d beds: %d is occupied: %b  guest name: %s", number,beds,ocupied,guestName);
    }

}
