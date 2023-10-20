import java.util.Scanner;

public class permutation{
    public static void permutation_Check(String word, String permutation){

        if (word.length()==0){
            System.out.println(permutation);
            return;
        }

        for(int i=0;i<word.length();i++){
            char this_char =word.charAt(i);

            String newWord=word.substring(0, i)+word.substring(i+1);

            permutation_Check(newWord, permutation+this_char);
        }
    }

    public static void main(String args[]){
        System.out.println("\033c");

        Scanner sc = new Scanner(System.in);
        String word;
        System.out.print("Enter the word you want to do permutation of : ");
        word =sc.nextLine();

        permutation_Check(word,"");

    }}