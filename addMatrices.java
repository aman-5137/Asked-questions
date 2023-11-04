public class addMatrices {
    public static void main(String[] args){

        int [][] matrice1 ={{1,2,3},{1,2,3},{2,3,4}};  // 3X3 Matrix
        int [][] matrice2 ={{3,3,3},{4,4,4},{4,4,4}};  // 3X3 Matrix
        int [][] sum= {{0,0,0},{0,0,0},{0,0,0}};       // 3X3 Matrix taking default sum to be zero

        for(int i=0; i<matrice1.length;i++){
            for (int j=0;j<matrice1.length;j++){
                sum[i][j]= matrice1[i][j]+matrice2[i][j];   
            }
        }
        for(int i=0; i<matrice1.length;i++){
            System.out.println();
            for(int j=0; j<matrice2.length;j++){
                System.out.print(sum[i][j]+" ");

            }
        }
    }
}
