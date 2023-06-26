import java.util.Scanner;

public class Calc1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name = ");
        String name = scan.nextLine();

        System.out.printf("Hello %s, would you like to use the calculator? \nInput yes or no = ", name);
        String choice = scan.nextLine();
        if (choice.equals("yes")){
            System.out.printf("Hello %s welcome to the Calculator with if else statement.", name);
            System.out.print("\nEnter number = ");
            double num1 = scan.nextDouble();
            scan.nextLine();
            System.out.print("Enter another number = ");
            double num2 = scan.nextDouble();
            scan.nextLine();
            System.out.print("Enter your choice either add, sub, mul, div, mod ");
            String  operations = scan.nextLine();
            if (operations.equals("add")){
                System.out.printf("%f + %f = %f", num1, num2, num1+num2);
            } else if (operations.equals("sub")) {
                System.out.printf("%f - %f = %f", num1, num2, num1-num2);
            } else if (operations.equals("mul")) {
                System.out.printf("%f * %f = %f", num1, num2, num1*num2);
            } else if (operations.equals("div")) {
                System.out.printf("%f / %f = %f", num1, num2, num1/num2);
            } else if (operations.equals("mod")) {
                System.out.printf("%f % %f = %f", num1, num2, num1%num2);
            }
        } else if (choice.equals("no")) {
            System.out.printf("Okay %s have a great day!", name);
        }else {
            System.out.println("Please rerun the program and enter the valid option either yes or no.");
        }

        scan.close();
    }
}
