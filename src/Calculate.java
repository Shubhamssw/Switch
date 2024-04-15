import java.util.Scanner;

public class Calculate
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Select operation:");
        System.out.println("1: Addition (+)");
        System.out.println("2: Subtraction (-)");
        System.out.println("3: Multiplication (*)");
        System.out.println("4: Division (/)");
        System.out.print("Enter the operation number (1/2/3/4): ");
        int operation = scanner.nextInt();


        System.out.print("Enter first number: ");
        double number1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double number2 = scanner.nextDouble();


        switch (operation) {
            case 1:
                System.out.printf("%.2f + %.2f = %.2f\n", number1, number2, (number1 + number2));
                break;
            case 2:
                System.out.printf("%.2f - %.2f = %.2f\n", number1, number2, (number1 - number2));
                break;
            case 3:
                System.out.printf("%.2f * %.2f = %.2f\n", number1, number2, (number1 * number2));
                break;
            case 4:
                if (number2 != 0) {
                    System.out.printf("%.2f / %.2f = %.2f\n", number1, number2, (number1 / number2));
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operation number. Please enter 1, 2, 3, or 4.");
                break;
        }

        scanner.close();
    }
}
