import java.util.Scanner;

class java{
    public static void main(String args[]){
        //Swapping two numbers without using third variable.
        System.out.println("\033c");
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number in A: ");
        a=sc.nextInt();
        System.out.print("Enter a number in B: ");
        b=sc.nextInt();

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("The swapped number for A is: "+a+" and for B is: "+b);

    }
}