public class Student {
    String name;
    int age;
    String studentIDcard;
    boolean cardValid;
    int semesterNumber;
    double averageGrade;


    void sayHello(){
        System.out.println("Hello from "+name);
}
    void displayName(){
        System.out.println("Name"+name);
    }
    void displayAge(){
        System.out.println("age "+age);
    }

    void displayStudentStats(){
        System.out.println(name+" "+semesterNumber+ " "+averageGrade);
}

    void changeIDstatus(){
        cardValid =! cardValid;
    }

}
