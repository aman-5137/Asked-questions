import java.util.Scanner;

public class recursionFactorial {
  int fact;
    public int factorial(int i){
        if(i==1 || i==0){
            return 1;

        }
        else {
            System.out.println(i);
            return fact=i * factorial(i - 1);
        }
    }

    public static void main(String [] args){

        recursionFactorial rs = new recursionFactorial();
//        Created object of class


        Scanner sc = new Scanner(System.in);
        System.out.print("Take a number for factorial: ");
        int number= sc.nextInt();
//      Taking input from user, using Scanner class

        rs.factorial(number);  //calling the factorial method
        System.out.println("Factorial of "+number+" is: "+ rs.fact);


    }
}
