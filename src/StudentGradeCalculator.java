import java.util.Scanner;


    public class StudentGradeCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numberOfSubjects = 5;
        int totalMarks = 0;

        System.out.println("===== Student Grade Calculator =====");

        for (int i = 1; i <= numberOfSubjects; i++) {

            System.out.print("Enter marks for Subject " + i + ": ");
            int marks = sc.nextInt();

            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks! Please enter marks between 0 and 100.");
                i--;
                continue;
            }

            totalMarks += marks;
        }

        double percentage = (double) totalMarks / numberOfSubjects;

        char grade;

        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else if (percentage >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println("\n===== Result =====");
        System.out.println("Total Marks: " + totalMarks + "/" + (numberOfSubjects * 100));
        System.out.println("Average Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}