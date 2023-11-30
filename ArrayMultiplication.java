public class ArrayMultiplication{
    public static void main(String[] args) {

        int r1 =2, c1=2;
        int arr1[][]={
                {1,2},
                {3,4}
        };
        int r2=2, c2=2;
        int arr2[][]={
                {1,1},
                {1,1}
        };

//      To display array1
        System.out.println("Array 1 is: ");
        for(int i=0; i< r1;i++){
            for(int j=0; j<c1; j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }

//      To display array2
        System.out.println("\nArray 2 is: ");
        for(int i=0; i< r2;i++){
            for(int j=0; j<c2; j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }

//       Check if the matrices are correct to multiply
        int arrM[][] = new int[r1][c2];
        if(r2 != c1){
            System.out.println("Cannot multiply!! Correct the matrix");
        }else {
//        Multiplying both the arrays
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    for (int k = 0; k < r2; k++) {
                        arrM[i][j] += arr1[i][k] * arr2[k][j];
                    }
                }
            }
        }

//      Display the product of both the matrices
        System.out.println("\nMultiplication of array1 and array2 is: ");
        for(int i=0; i< r1;i++){
            for(int j=0; j<c2; j++){
                System.out.print(arrM[i][j]+" ");
            }
            System.out.println();
        }

        
    }
}