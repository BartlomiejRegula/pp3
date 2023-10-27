public class SurfaceArea {
    // prostopadłościan, kula, stożek

    public static double cuboidArea(double x, double y, double z){
        return x*y*z;
    }
    public static double sphereArea(double r){
        return Math.round(Math.PI * r*100.0)/100.0;
    }
    public static double coneArea(double r,double l){
        return Math.round(Math.PI * r * (r+l)*100.0)/100.0;
    }

    public static void main(String[] args) {
        System.out.println(cuboidArea(2, 4 , 4));
        System.out.println(sphereArea(2));
        System.out.println(coneArea(2, 12));
        
    }

}
