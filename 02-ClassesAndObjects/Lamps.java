public class Lamps {

    boolean isOn;
    
    void turnOn(){
        isOn = true;
    } 
    void turnOff(){
        isOn = false;
    } 

    void display(){
        System.out.println(isOn == true ? "Is On " : "Is Off" );
    }    

        
    public static void main(String[] args) {
        
        Lamps lampa1 = new Lamps();
        lampa1.isOn = false;

        Lamps lampa2 = new Lamps();
        lampa2.isOn = true;

        lampa1.turnOn();
        lampa1.display();
    }

}
