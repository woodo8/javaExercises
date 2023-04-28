public class thirdTask {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        int diagonalSum = 0;

        // Fill the matrix with 0's, except for the diagonal
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    matrix[i][j] = i;
                    diagonalSum += i;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }

        // Print the matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Print the sum of the diagonal elements
        System.out.println("Sum of diagonal elements: " + diagonalSum);
    }
}
