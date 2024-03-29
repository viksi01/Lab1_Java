package Task4;

public class Task4 {
    public static void main(String[] args) {
        int rowFirst = 2;
        int columnFirst = 3;
        int rowSecond = 3;
        int columnSecond = 2;

        int[][] firstMatrix = {
                {5, 1, 7},
                {4, 2, 9},
        };

        int[][] secondMatrix = {
                {7, 1},
                {4, 9},
                {1, 12},
        };

        int[][] result = multiplyMatrices(firstMatrix, secondMatrix, rowFirst, columnFirst, rowSecond, columnSecond);

        //==================================================================

        System.out.println("Multiplied matrices:");
        printMatrix(result);
    }

    private static int[][] multiplyMatrices( int[][] firstMatrix, int[][] secondMatrix, int rowFirst, int columnFirst,
                                             int rowSecond, int columnSecond) {

        if (columnFirst != rowSecond) {
            System.out.println("These matrices can't be multiplied!");
        }

        int[][] resultMatrix = new int[rowFirst][columnSecond];
        for (int i = 0; i < rowFirst; i++) {
            for (int j = 0; j < columnSecond; j++) {
                for (int k = 0; k < columnFirst; k++) {
                    resultMatrix[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }

        return resultMatrix;
    }

    private static void printMatrix(int [][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
