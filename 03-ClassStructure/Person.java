public class Person {
    String name;
    int weight;
    int height;
    
    public Person(String name){
        this.name = name;
    }

    public Person(String name, int weight, int height){
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public void setWeightAndHeight(int weight,int height){
        this.weight = weight;
        this.height = height;
    }

    public double calculateBMI(){
        return Math.round(weight * 100/(height * height * 0.0001))/100.0;
    }

    void displayRecord(){
        System.out.println(name);
        System.out.println(weight);
        System.out.println(height);
        System.out.println(calculateBMI());
    }

    public static void main(String[] args) {
        Person p = new Person("hujek",69,180);

        p.displayRecord();

    }
}
