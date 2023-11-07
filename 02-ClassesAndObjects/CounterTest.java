public class CounterTest {
    
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        c1.increaseByTen();
        c1.increaseByTen();
        c1.increaseByOne();
        c1.increaseByOne();
        c1.increaseByOne();
        c1.displayCounter();

        c2.decreaseByTen(); c2.decreaseByTen();c2.decreaseByTen();c2.decreaseByTen();c2.decreaseByTen();
        c2.increaseByOne();c2.increaseByOne();c2.increaseByOne();
        c2.displayCounter();
    }
}
