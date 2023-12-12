import java.lang.reflect.Array;
import java.util.ArrayList;

public class Numbers {
    int one,two,three,four,five;
    ArrayList<Integer> lista = new ArrayList<>();
    
    public Numbers(int one, int two, int three, int four, int five){
        this.one = one;
        this.two=two;
        this.three = three;
        this.four = four;
        this.five = five;
        lista.add(one);
        lista.add(two);
        lista.add(three);
        lista.add(four);
        lista.add(five);
    }
    
    public boolean different(){
        // int[] arr = {one,two,three,four,five};
        return (one != two && one != three && one != four && one != five &&
                two != three && two != four && two != five &&
                three != four && three != five &&
                four != five);
        
    }



        public static void main(String[] args) {
            Numbers n = new Numbers(3, 4, 2, 1, 6);
            System.out.println(n.different());
            Numbers n1 = new Numbers(9, 7, 4, 3, 7);
            System.out.println(n1.different());
        }
    }

