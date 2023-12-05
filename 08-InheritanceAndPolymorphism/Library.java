import java.util.ArrayList;

public class Library {
    public static void main(String[] args) {
        
    
    Book b = new Book("Lalka", "Bolesław Prus");
    Ebook e = new Ebook("Lalka", "Bolesław Prus","LalkaEbook");
    Audiobook a = new Audiobook("Lalka", "Bolessław Prus", 213, 32);

    ArrayList<Book> books = new ArrayList<Book>();
    books.add(b);
    books.add(b);
    books.add(b);
    
        for(int i = 0; i < books.size(); i++ ){
            Book s;
            s = books.get(i);
            s.display();
        }
    
}
}