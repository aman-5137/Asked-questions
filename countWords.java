import java.util.Scanner;

 public class countWords {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = sc.nextLine();
        int word=1;

        for (int i = 0; i <string.length();i++){
            char Character= string.charAt(i);
            if(Character==' '){
            word++;
            }
        }
        System.out.println("Number of word ="+word);
    }}