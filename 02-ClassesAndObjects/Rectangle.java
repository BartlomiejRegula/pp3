public class Rectangle {
    int bok1;
    int bok2;
    
    void displayDimentions(){
        System.out.printf("Wymiary: %d x %d\n", bok1, bok2);
    } 

    void displayPerimetes(){
        System.out.println("Perimeter: " + (2*bok1+2*bok2));
    } 
    void displaySurfaceArea(){
        System.out.println("Surface Area: " + bok1*bok2 );
    }
}
