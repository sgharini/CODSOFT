import java.util.*;

class GradeCalculator
{
        public static void main(String[] args) 
    {
        System.out.println("          STUDENT GRADE CALCULATOR \n");
        System.out.print("Enter the number of subjects: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Number of subjects must be greater than zero.");
            return;
        }
    
        int total = 0;
        
        for(int i=1; i<=n; i++)
        {
            System.out.print("Enter the mark " + i + " :");
            int mark = sc.nextInt();
            if (mark < 0 || mark > 100) {
                System.out.println("Mark must be between 0 and 100.");
                return;
            }
            total += mark;
        }
        
        double average = (double)total/n;
        System.out.println("\nTotal marks: " + total);
        System.out.println("Average percentage: " + String.format("%.2f",average) + "%");

        String grade;
        if (average >= 90) {
            grade = "A";
        } 
        else if (average >= 80) {
            grade = "B";
        } 
        else if (average >= 70) {
            grade = "C";
        } 
        else if (average >= 60) {
            grade = "D";
        } 
        else if (average >= 50) {
            grade = "E";
        } 
        else {
            grade = "F";
        }

        System.out.println("Grade: " + grade);
    }

}
