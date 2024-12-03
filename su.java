public class su{
    /**
     * Determines if a given 2D matrix is a magic square.
     *
     * A magic square is a square matrix where the sum of every row, column, 
     * and both diagonals is the same.
     *
     * @param magic The 2D array to check.
     * @return True if the matrix is a magic square, otherwise false.
     */
    public static boolean magicSquares(int[][] magic) {
        int n = magic.length;
        if (n == 0 || magic[0].length != n){
            return false; 

        }
        int sum = 0;
        for (int val : magic[0]){
            sum += val;
        } 

        for (int i = 0; i < n; i++) {
            int row_sum = 0;
            for (int j = 0; j < n; j++) {
                row_sum += magic[i][j];
            }
            if (row_sum != sum){
                return false;
            }
        }

        // Check columns
        for (int j = 0; j < n; j++) {
            int col_sum = 0;
            for (int i = 0; i < n; i++) {
                col_sum += magic[i][j];
            }
            if (col_sum != sum) return false;
        }

        // Check diagonals
        int diag1 = 0, diag2 = 0;
        for (int i = 0; i < n; i++) {
            diag1 += magic[i][i];
            diag2 += magic[i][n - i - 1];
        }
        return diag1 == sum && diag2 == sum;
    }

    
}