public class SuperCounter extends Counter {



    public SuperCounter(int c) {
        super(c);
    }


    public void addN(int n){
        for(int i = 0; i < n;i++){
            super.add1();
        }
    }

    
    public static void main(String[] args) {
        SuperCounter s = new SuperCounter(0);
        s.addN(10);
        System.out.println(s.getCounter());
    }
}
