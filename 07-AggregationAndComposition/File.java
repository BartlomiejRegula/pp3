public class File {
    private String name;
    private int size;
    private String type;
    private String address;
    private String created;


    public File(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void changeAddress(String fileAddress){
        this.address = fileAddress;
    } 

    public void deleteFile(){
        this.name = null;
    }

    public String getName() {
        return name;
    }
    
    




}
