import java.util.Scanner;
public class StudentGradeApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student's name: ");
        String StudentName = scanner.nextLine();

        System.out.println("Enter student's grade: ");
        int marks = scanner.nextInt();

        String grade;
        if (marks >= 85) {
            grade = "A";
        } else if (marks >= 70) {
            grade = "B";
        } else if (marks >= 55) {
            grade = "C";
        } else if (marks >= 40) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Student Name: " + StudentName);
        System.out.println("Grade: " + grade);
    }
}