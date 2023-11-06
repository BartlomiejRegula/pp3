import java.util.Random;
import java.util.random.RandomGenerator;
import java.util.Arrays;

public class StudentGrades {

    String studentName;
    double[] grades;

    StudentGrades(String name, double[] grades) {
        this.studentName = name;
        this.grades = grades;
    }

    StudentGrades(String name, int numberOfGrades){
        Random random = new Random();
        int[] arr = {};
        for (int i = 0; i < numberOfGrades; i++){
            int x = random.nextInt( 6)+1;
            arr[i]=x;
        }
    }

    public double lowestGrade(){
        double x = 6.0;
        for (int i = 0; i < grades.length;i++ ){
            if (grades[i] < x){
                x = grades[i];
            }
        }
        return x;
    }

    public double highestGrade(){
        double x = 0.0;
        for (int i = 0; i < grades.length;i++ ){
            if (grades[i] > x){
                x = grades[i];
            }
        }
        return x;
    }

    public int numberOfGrades(){
        int x = 0;
        for (int i = 0; i < grades.length;i++ ){
            x++;
        }
        return x;
    }

    public double average(){
        double x = 0.0;
        for (int i = 0; i < grades.length;i++ ){
            x += grades[i];
        }
        return Math.round(x/grades.length *100.00)/100.00;
    }

    public void display(){
        StringBuilder sr = new StringBuilder();
        for (int i = 0; i< grades.length; i++){
            sr.append(grades[i]);
            sr.append("  ");
        }
        System.out.println(studentName );
        System.out.println(sr);
        System.out.println(numberOfGrades());
        System.out.println(lowestGrade());
        System.out.println(highestGrade());
        System.out.println(average());
    }



}

