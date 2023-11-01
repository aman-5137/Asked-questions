import java.util.Scanner;

public class recursionFibonacci {
    int fibo;
    public int febo(int i){
        if(i==0||i==1){
            return i;
        }
        else {
            return fibo=febo(i - 1)+ febo(i - 2);
        }
    }
    public static void main(String[] args){

        recursionFibonacci obj = new recursionFibonacci();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for Fibonacci: ");
        int number = sc. nextInt();

        obj.febo(number);
        System.out.println("Fibonacci of "+number+" is : "+obj.fibo);
    }
}
