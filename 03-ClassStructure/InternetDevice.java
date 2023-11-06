public class InternetDevice  {
    String name;
    boolean connected;
    static int connectedDevices;

    
    public InternetDevice(String name){
        this.name = name;
        this.connected = false;
    }

    void connect(){
        this.connected = true;
        connectedDevices++;
    }

    void disconnect(){
        this.connected = false;
        connectedDevices--;
    }

    // void isConnceted(){
    //     if (connected==true){
    //         System.out.println("");
    //     }
    // }

    public void displayStatus(){
        if(connected==true){
        System.out.println("device is connected");;
    }
        else{  System.out.println("device isn't connected");
    }
    }

    public static  void displayConnections(){
        System.out.println("connected devices: " + connectedDevices);
    }

}

