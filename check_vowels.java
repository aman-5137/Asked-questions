import java.util.Scanner;

class vowel{
    public static void main(String args[]){

        Scanner sc =new Scanner(System.in);

        System.out.print("Enter a word : ");
        String word=sc.nextLine();

        boolean isvow=false;
    

        for (int i=0;i<word.length();i++){
            char Character= word.charAt(i);
            if(Character=='A'|| Character=='a'||Character=='E'||Character=='e'||Character=='I'||Character=='i'||Character=='O'||Character=='o'||Character=='U'||Character=='u'){
                isvow=true;
                break;

            }}
        if(isvow){
            System.out.println("The word contains vowel....");
        }
        else{
            System.out.println("The word does not contain vowel....");
        }
    }
}