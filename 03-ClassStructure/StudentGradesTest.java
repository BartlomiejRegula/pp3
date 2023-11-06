public class StudentGradesTest {
    public static void main(String[] args) {
        double[] grades = {3.5, 4.5, 4.0, 2.0, 5.0, 3.5, 3.5};
        double[] grades2 = {3.5, 4.5, 4.0, 2.0, 5.0, 3.5, 3.5};
        StudentGrades s = new StudentGrades("Bartek", grades);
        StudentGrades s1 = new StudentGrades("dzejms", grades2);
    //     System.out.println(s.lowestGrade());
    //     System.out.println(s.highestGrade());
    //     System.out.println(s.numberOfGrades());
    //     System.out.println(s.average());
        s.display();
        s1.display();
        StudentGrades s2 = new StudentGrades("Sranek", 6);
        s2.display();
    }

}
