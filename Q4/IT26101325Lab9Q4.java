import java.util.Scanner;

public class IT26101325Lab9Q4 {

    public static double calcFinalMark(double assignmentMark, double examMark) {
        double finalMark = (assignmentMark * 0.3) + (examMark * 0.7);
        return finalMark;
    }

    public static char findGrade(double finalMark) {
        char grade;

        if (finalMark >= 75) {
            grade = 'A';
        } else if (finalMark >= 60) {
            grade = 'B';
        } else if (finalMark >= 50) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        return grade;
    }

    public static void printDetails(String name, double finalMark, char grade) {
        System.out.printf("%-20s%-15.2f%-10c%n", name, finalMark, grade);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int NUM_STUDENTS = 5;

        String[] names = new String[NUM_STUDENTS];
        double[] finalMarks = new double[NUM_STUDENTS];
        char[] grades = new char[NUM_STUDENTS];

        for (int i = 0; i < NUM_STUDENTS; i++) {
            System.out.println();
            System.out.print("Enter Name of Student " + (i + 1) + ": ");
            String name = input.next();

            System.out.print("Enter Assignment Mark (out of 100) for " + name + ": ");
            double assignmentMark = input.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100) for " + name + ": ");
            double examMark = input.nextDouble();

            names[i] = name;
            finalMarks[i] = calcFinalMark(assignmentMark, examMark);
            grades[i] = findGrade(finalMarks[i]);
        }

        System.out.println();
        System.out.printf("%-20s%-15s%-10s%n", "Name", "Final Mark", "Grade");

        for (int i = 0; i < NUM_STUDENTS; i++) {
            printDetails(names[i], finalMarks[i], grades[i]);
        }

        input.close();
    }
}