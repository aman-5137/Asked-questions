 public class TransposeMatrix {
    public static void main(String[] args) {

        int r=3, c=3;
        int mat[][]={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println("Original matrix");
        for (int i=0;i< r;i++){
            System.out.println();
            for(int j=0; j<c;j++){
                System.out.print(mat[i][j]+" ");
            }
        }
        System.out.println("\nTransposed matrix");
        for (int i=0;i< r;i++){
            System.out.println();
            for(int j=0; j<c;j++){
                System.out.print(mat[j][i]+" ");
            }
        }
    }
}
 
    

