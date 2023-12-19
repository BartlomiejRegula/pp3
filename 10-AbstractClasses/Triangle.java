public class Triangle extends Shape {
    int a;
    int h;

    public Triangle(int a, int h) {
        this.a = a;
        this.h = h;
    }
    
    @Override
    public double area() {
        
        return (1/2)*(a * h);
    }

}
