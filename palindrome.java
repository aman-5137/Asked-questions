import java.util.Scanner;
import java.util.*;

class palindrome{
    public static void main(String args[]){
        System.out.println("\033c");
// same from backward and forward
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check palindrome of: ");
        int num=sc.nextInt();

        int reversenum=0;
        int samenum= num;

        while(num>0){
            int div= num%10;
            reversenum=reversenum*10+div;
        num=num/10;
        }

        if(reversenum==samenum){
            System.out.println("This is a Palindrome number...");
        }else{
            System.out.println("This is not a Palindrome number....");
        }

    }}