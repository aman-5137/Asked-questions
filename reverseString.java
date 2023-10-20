import java.util.*;

class reverse{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        String word;
        System.out.print("Type the word: ");
        word=sc.nextLine();

        String reversestr="";
        for(int i=0;i<word.length();i++){
            reversestr=word.charAt(i)+reversestr;
        }
        System.out.println("Reverse of the word is : "+reversestr);
    }
}