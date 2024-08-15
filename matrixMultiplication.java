
import javax.swing.text.DefaultStyledDocument;

public class matrixMultiplication {
    public static void main(String[] args) {
        int[][] m1 = {{1, 2, 3}, {4, 7, 8}}; // 2 x 3 matrix
        int[][] m2 = {{1, 2}, {3, 4}, {7, 8}};// 3 x 2 matrix
        if(m1[0].length != m2.length) {
            System.out.println("Multiplication undefined");
        }
        else{
            int[][] result = multiply(m1 ,m2);

            for (int row = 0; row < result.length; row++){
                for(int column = 0; column < result.length; column++){
                    System.out.println(result[row][column] + " ");
                }
                System.out.println();
            }
        }
    }

    public static int[][] multiply(int[][] mat1, int[][] mat2) {
        // all elementsare initialized to be zeros
        int[][] answer = new int[mat1.length][mat2[0].length];
        for(int row = 0; row < mat1.length; row++) {
            for(int column = 0; column < mat2[0].length; column++){
                for(int i = 0; i < mat1[0].length; i++){
                    answer [row] [column] += mat1[row] [i] * mat2[i] [column];
                }
            }
        }
        return answer;
    }
}
