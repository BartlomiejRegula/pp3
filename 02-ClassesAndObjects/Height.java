public class Height{
    public static void main(String[] args) {
        int myHeight = 181;
        double foots = myHeight / 30.48;
        double inches = (myHeight % 30)/2.54; 


        System.out.println(foots);
        System.out.println(inches);
    }
}