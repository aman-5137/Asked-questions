import java.util.Scanner;

class prime{

    public static void main(String args[]){

        int num;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check if it is prime number or not: ");
        num=sc.nextInt();

        boolean check=false;

        for(int i=2; i<=num/2;i++){
            if(num % i==0){
                check=true;
                break;
            }
        }
        if (!check)
            System.out.println("It is a prime number.");
        else
            System.out.println("It is not a prime number.");

    }
}