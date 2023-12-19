public class TV implements CanOnOff, CanChangeChannel {
    boolean isOn;

    @Override
    public void turnOff() {
        isOn = false;
    }

    @Override
    public void turnOn() {
        isOn = true;
    }
    
    public void display(){
        if(isOn == false){
            System.out.println("Telewizor wyłączony");
        } else{
            System.out.println("Telewizor włączony");
        }
    }

    int channelNo = 1;
    @Override
    public void channelDown() {
        if (channelNo > 1 && isOn == true){
            channelNo--;
        }
    }

    @Override
    public void channelUp() {
        if (channelNo < 99 && isOn == true){
            channelNo++;
        }
    }

    @Override
    public void setChannel(int channelNo) {
        if ( channelNo >= 1 && channelNo <= 99){
            this.channelNo = channelNo;
        }
    }
    
    
}
