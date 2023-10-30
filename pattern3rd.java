public class pattern3rd {
    public static void main(String[] args) {
        

        
        int m=10;
        for(int i=0;i<=m;i++){
            for(int j=0;j<=i;j++){
                System.out.print("  ");
            }
            int n=10;
            for(int k=0;k<=n-i;k++){
                System.out.print("*   ");
            }
            System.out.println();
        }
    }
}
