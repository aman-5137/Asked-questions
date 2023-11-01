import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        

        int number1, number2;
        char operator;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number A: ");
        number1=sc.nextInt();
        System.out.print("Ebter number B: ");
        number2=sc.nextInt();
        System.out.print("Enter the operator(+,-,*,/): ");
        operator=sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("A + B = "+(number1+number2));
                break;
                case '-':
                System.out.println("A - B = "+ (number1-number2));
                break;
                 case '*':
                System.out.println("A * B = "+ (number1*number2));
                break;
                 case '/':
                System.out.println("A / B = "+ (number1/number2));
                break;

            default:
            System.out.println("You entered wrong input!!");
        }

    }
}
