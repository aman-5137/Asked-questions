import java.util.Scanner;

class factorial{
    public static void main(String args[]){

//multiple of all number from 1 to the given number


        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number to get factorial of : ");
        int num = sc.nextInt();

        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        if(num==1)
            System.out.println("Factorial of "+num+" is "+num);
        else

            System.out.println("Falctorial of "+num+" is "+fact);

    }
}