import java.util.ArrayList;

public class Family {
    Person[] osoby;
    public Family(Person[] osoby){
        this.osoby = osoby;
    }    

    public int adults(){
        int sum = 0;
        for (int i = 0 ; i < osoby.length;i++){
            if (osoby[i].getAge() >= 18){
                sum++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        
            Person person3 = new Person("Ala", 13);
            Person person1 = new Person("John", 25);
            Person person2 = new Person("Jane", 30);
    
            Person[] familyMembers = { person1, person2, person3 };
    
            Family f = new Family(familyMembers);
            System.out.println(f.adults());
        }

}



