public class Folder{

    private int size;
    private String name;
    private String address;
    private String created;
    private File file;

    public Folder(String name){
        this.name = name;
    }

    public void addFile(String fileName){
        file = new File(fileName);
    }

    public void deleteFile(String fileName){

    }

    public void setName(String folderName){
        this.name = folderName;
    }

    public void change(String folderAddres){
        this.address = folderAddres;
    }

    public void deleteFolder(String folderName){

    }

    public void addFolder(String folderName){

    }

    @Override
    public String toString() {
        String s ="Nazwa folderu: " + name;
        s += "Nazwa pliku: " + file.getName();
        return "Folder name: " + name ;

    }

    

}