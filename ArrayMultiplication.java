public class ArrayMultiplication {
    public static void main(String args[]){

            int[][] arr1=new int[][]{{1,2},{4,3},{5,6}};
        int[][] arr2=new int[][]{{2,2,2},{6,6,6}};

//       Display marix one
        int arrM[][]= new int[][]{{0,0,0},{0,0,0}};
        for(int i =0; i<arr1.length; i++) {
            System.out.println();
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print("  "+arr1[i][j]);
            }
        }
//       Display matrix two
        System.out.println("\n\n\n");
        for(int i =0; i<arr2.length; i++) {
            System.out.println();
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print("  "+arr2[i][j]);
            }
        }
//    Multiplying both the arrays
System.out.println("\n\n\n");
        for(int i =0; i<arr1.length; i++){
            for(int j=0; j<arr1[i].length;j++){
                 arrM[i][j] = arr1[i][j]* arr2[i][j];
                }
            }
//    Display the product of both matrices
        for(int i =0; i<arr1.length; i++){
            System.out.println();
            for(int j=0; j<arr1[i].length;j++) {
                    System.out.print("  "+arrM[i][j]);
                }
            }


    }
}
