public class MatrixMultiplication{
    public static void main(String[] args) {

        int r1 =2, c1=2;
        int mat1[][]={
                {1,2},
                {3,4}
        };
        int r2=2, c2=2;
        int mat2[][]={
                {1,1},
                {1,1}
        };

//      To display Matrix 1
        System.out.println("Matrix  1 is: ");
        for(int i=0; i< r1;i++){
            for(int j=0; j<c1; j++){
                System.out.print(mat1[i][j]+" ");
            }
            System.out.println();
        }

//      To display Matrix 2
        System.out.println("\nMatrix  2 is: ");
        for(int i=0; i< r2;i++){
            for(int j=0; j<c2; j++){
                System.out.print(mat2[i][j]+" ");
            }
            System.out.println();
        }

//       Check if the matrices are correct to multiply
        int matMult[][] = new int[r1][c2];
        if(r2 != c1){
            System.out.println("Cannot multiply!! Correct the matrix");
        }else {
//        Multiplying both the Matrix s
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    for (int k = 0; k < r2; k++) {
                        matMult[i][j] += mat1[i][k] * mat2[k][j];
                    }
                }
            }
        }

//      Display the product of both the matrices
        System.out.println("\nMultiplication of Matrix 1 and Matrix 2 is: ");
        for(int i=0; i< r1;i++){
            for(int j=0; j<c2; j++){
                System.out.print(matMult[i][j]+" ");
            }
            System.out.println();
        }

        
    }
}