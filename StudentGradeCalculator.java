import java.util.*;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        
        Scanner Sc = new Scanner(System.in);

        
        System.out.print("Enter  number of grades: ");
        int numGrades = Sc.nextInt();

        
        double sum = 0;

        for (int i = 1; i <= numGrades; i++) {
            System.out.print("Enter grade " + i + ": ");
            double grade = Sc.nextDouble();
            sum = sum+grade;  
        }

        
        double average = sum / numGrades;

        
        System.out.printf(" Average grade is: %.2f\n", average);

        
        Sc.close();
    }
}

