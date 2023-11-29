import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the square matrix size: ");
        int n = sc.nextInt();

        int row=n,column=n;
        int[][] spiral = new int[row][column];
        int value = 1;
        int startRow=0, endRow=row-1;
        int startColumn=0, endCol=column-1;

        while (startRow<= endRow && startColumn <= endCol){
            for(int i =startColumn; i<=endCol; i++){
                spiral[startRow][i] = value++;
            }
            startRow++;



            for(int i= startRow; i<=endRow; i++){
                spiral[i][endCol] = value++;
            }
            endCol--;


            if(startRow <= endRow){
                for(int i = endCol; i>= startColumn; i--){
                    spiral[endRow][i] = value++;
                }
                endRow--;
            }

            if(startColumn <= endCol){
                for(int i=endRow; i>=startRow; i--){
                    spiral[i][startColumn]=value++;
                }
                startColumn++;
            }
        }
        for(int[] rows: spiral){
            for(int element : rows){
                System.out.print(element+"\t");
            }
            System.out.println();
        }
    }
}
