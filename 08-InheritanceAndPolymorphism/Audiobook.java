public class Audiobook extends Book {
    private int minutes;
    private int seconds;

    public Audiobook(String title, String author, int minutes, int seconds) {
        super(title, author);
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
    
    public void display(){
        System.out.println("Book title: " + getTitle());
        System.out.println("Book author: " +getAuthor());
        System.out.printf("Audiobook length: %d : %d ",minutes, seconds );
    }
}