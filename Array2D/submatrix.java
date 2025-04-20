public class Submatrix {
    public static void main(String[] args) {
        int aArray[][] = {{1, 2}, {3, 4}};
        int bArray[][] = {{1, 2}, {3, 4}};

        int[][] result = submatrix(aArray, bArray);

        if (result != null) {
            System.out.println("Resulting Matrix (2x2):");
            printMatrix(result);
        } else {
            System.out.println("Matrix dimensions are not compatible.");
        }
    }

    public static int[][] submatrix(int[][] aArray, int[][] bArray) {
        int rows = aArray.length;
        int cols = aArray[0].length;

        if (bArray.length != rows || bArray[0].length != cols) {
            return null;
        }

        int[][] result = new int[rows][cols];

        boolean matricesEqual = true; // Assume both matrices are equal.

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = aArray[i][j] - bArray[i][j];
                if (result[i][j] != 0) {
                    matricesEqual = false; // Matrices are not equal if any element is non-zero.
                }
            }
        }

        // Check if the matrices are equal.
        if (matricesEqual) {
            return new int[2][2]; // Return a 2x2 zero matrix.
        }

        return result;
    }

    public static void printMatrix(int[][] nArray) {
        if (nArray.length != 2 || nArray[0].length != 2) {
            System.out.println("Matrix dimensions are not 2x2.");
        } else {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(nArray[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}

