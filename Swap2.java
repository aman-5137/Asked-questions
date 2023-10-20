import java.util.Scanner;

public class Swap2 {
    public static void main(String args[]){

        int a, b, c=0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number for A: ");
        a=sc.nextInt();
        System.out.print("Enter a number for B: ");
        b=sc.nextInt();

        c=a;
        a=b;
        b=c;

        System.out.println("The swapped number for A is: "+a+" and for B is: "+b);

    }
}
