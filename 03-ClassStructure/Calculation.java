public class Calculation {

    int x = 1;
    int y = 10;
    int counter;
    int counter1;


    public int rangeNum(){
        counter = 0;
    for (int i = x ; i <= y; i++){
        counter++;        
        }
    return counter;
    }

    public int sumOfNum(){
        counter1 = 0;
        for (int i = x; i <= y; i++){
            counter1+=i;
        }
        return counter1;
    }

    double counter2 = 0;
    double counter3 = 0;
    public double arithmeticMean(){
        for (int i = x; i <= y; i++){
            counter3+=i;
            counter2++;
        }
        return counter3/counter2;
    } 


    void display(){
    System.out.println(counter);    
    System.out.println(counter1);
    System.out.println(counter2);
    }

}
