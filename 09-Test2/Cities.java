import java.util.ArrayList;

public class Cities {
    private String[] miasta;
    ArrayList<String> lista = new ArrayList<>();

    public Cities(String[] miasta) {
        this.miasta = miasta;
    }
    public Cities filter(char c){

        for(int i = 0; i < miasta.length;i++){
            if(miasta[i].charAt(0) == c){
                lista.add(miasta[i]);
            }
        }
        return this;
    }

    public String cities(){
        String x = "";
        for (String s : lista){
            x+=s;
        }
        return x;
    }

    public static void main(String[] args) {
        String[] m = {"Warszawa","Sopot","Kielce","Szczecin"};
        Cities c = new Cities(m);
        System.out.println(c.filter('S').cities());
        
    }
}
