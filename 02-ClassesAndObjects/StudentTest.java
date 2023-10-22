public class StudentTest {    
    public static void main(String[] args) {
        
        // object creation
        Student s = new Student();
        
        // object manipulation
        s.name = "Peter";
        s.age = 21;
        System.out.println(s.name + " " + s.age);

        Student s1 = new Student();

        s1.name = "Zosia";
        s1.age = 22;
        System.out.println(s1.name + " " + s1.age);

        Student s2 = new Student();

        s2.name = "Kuba";
        s2.age = 20;
        System.out.println(s2.name + " " + s2.age);

        Student s3 = new Student();


        s3.name = "Tomek";
        s3.age = 22;
        System.out.println(s3.name + " " + s3.age);

        Student s4 = new Student();
        s4.name = "Janek";
        s4.age = 13;
        s4.displayAge();
        s3.sayHello();

    }
}


