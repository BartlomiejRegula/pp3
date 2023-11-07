public class Counter {
    int initialValue = 0;

    void increaseByOne(){
        initialValue+=1;
    }
    void decreaseByOne(){
        initialValue --;
    }

    void increaseByTen(){
        initialValue+=10;
    }

    void decreaseByTen(){
        initialValue-=10;
    }

    void resetCounter(){
        initialValue=0;
    }

    void displayCounter(){
        System.out.println(initialValue);
    }



}
