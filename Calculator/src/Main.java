import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        do {

            System.out.println("Enter a number or type \"Exit\" to quit");
            String A = scanner.next();

            if (A.equalsIgnoreCase("Exit")) {
                System.out.println("Exiting");
                break;
            }

            double a = Double.parseDouble(A);
            scanner.nextLine();
            System.out.println("Enter the nominator: +, -, /, *");
            String c = scanner.nextLine();
            System.out.println("Enter another number");
            double b = scanner.nextInt();

            System.out.print("Calculator: " + a +" "+ c +" "+ b + " = ");

            if (c.equals("*")) {
                double k = a * b;
                System.out.printf("%.2f\n", k);
            } else if (c.equals("-")) {
                double l = a - b;
                System.out.printf("%.2f\n", l);
            } else if (c.equals("/")) {
                if (b != 0) {
                    double m = a / b;
                    System.out.printf("%.2f\n", m);
                } else {
                    System.out.println("You can't divide by zero");
                }
            } else if (c.equals("+")) {
                double n = a + b;
                System.out.printf("%.2f\n", n);
            }
        } while (true);
    }
}