import java.util.Scanner;

public class Calc2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Welcome to the Calculator with switch statement.");

        System.out.print("\nEnter number = ");
        double num1 = scan.nextDouble();
        scan.nextLine();

        System.out.print("Enter another number = ");
        double num2 = scan.nextDouble();
        scan.nextLine();

        System.out.print(("Enter your choices either \nadd for Addition\nsub for Subtraction\nmul for Multiplication\ndiv for Division\nmod for Modulus\nchoice = "));
        String operations = scan.nextLine();

        switch (operations){
            case ("add"):
                System.out.printf("%f + %f = %f", num1, num2, num1+num2);
                break;
            case ("sub"):
                System.out.printf("%f - %f = %f", num1, num2, num1-num2);
                break;
            case ("mul"):
                System.out.printf("%f * %f = %f", num1, num2, num1*num2);
                break;
            case("div"):
                System.out.printf("%f / %f = %f", num1, num2, num1/num2);
                break;
            case("mod"):
                System.out.printf("%f % %f = %f", num1, num2, num1%num2);
                break;
            default:
                System.out.println("Please rerun the program and enter the valid option");
        }
        scan.close();
    }
}
