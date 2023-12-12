public class Car extends Vehicle {
    private int maxSpeed;

    public Car(int s, int maxSpeed) {
        super(s);
        this.maxSpeed = maxSpeed;
    }
    
    public int[] spec(){
        int[] arr = {getSeats() ,maxSpeed};
        return arr;
    }
    public static void main(String[] args) {
        Car c = new Car(4, 200);
        for(int i: c.spec()){
            System.out.println(i);
        }
        
    }
}
