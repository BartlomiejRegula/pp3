public class Ebook extends Book {
    private String fileName;

    public Ebook(String title, String author, String fileName) {
        super(title, author);
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    
    public void display(){
        System.out.println("Book title: " + getTitle());
        System.out.println("Book author: " +getAuthor());
        System.out.println("File name: " +  fileName);
    }
}
