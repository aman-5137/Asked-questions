// fibonacci : next digit is sum of last two digits 0,1,1,2,3,5,8.............

import java.util.*;

class fibo{

    public static void main(String args[]){

        System.out.print("\033c");

        int n, first=0, second=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Take a number for fibonacci: ");
        n=sc.nextInt();


        System.out.print("The fibonacci number is : ");
        for(int i=0;i<n;i++){
            System.out.print(first+" ");
            int nextTerm=first+second;
            first=second;
            second=nextTerm;
        }

    }
}