import java.util.Scanner;

public class IT26101325Lab9Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value a: ");
        double a = input.nextDouble();

        System.out.print("Enter value b: ");
        double b = input.nextDouble();

        System.out.print("Enter value c: ");
        double c = input.nextDouble();

        double discriminant = Math.pow(b, 2) - (4 * a * c);

        System.out.println();

        if (discriminant > 0) {
            // Two real and different roots
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.println("Roots are real and different :");
            System.out.printf("Root 1: %.2f%n", root1);
            System.out.printf("Root 2: %.2f%n", root2);

        } else if (discriminant == 0) {
            // Two real and equal roots
            double root1 = -b / (2 * a);

            System.out.println("Roots are real and equal :");
            System.out.printf("Root 1: %.2f%n", root1);
            System.out.printf("Root 2: %.2f%n", root1);

        } else {
            // Complex (imaginary) roots
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);

            System.out.println("Roots are complex :");
            System.out.printf("Root 1: %.2f + %.2fi%n", realPart, imaginaryPart);
            System.out.printf("Root 2: %.2f - %.2fi%n", realPart, imaginaryPart);
        }

        input.close();
    }
}