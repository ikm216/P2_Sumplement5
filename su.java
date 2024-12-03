import java.util.HashSet;

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
    /**
 * Calculates the number of unique subarrays in a given array that sum to a specified target value.
 * 
 * A subarray is defined as a contiguous portion of the array. The method uses a HashSet to ensure 
 * that duplicate subarrays (even if they sum to the same value) are not counted multiple times.
 * 
 * @param arr The input array of integers to search for subarrays.
 * @param a   The target sum value to which subarrays are compared.
 * @return    The number of unique subarrays that sum to the given target value.
 * 
 */
    public static int subArrSum(int[] arr, int a){
        {
            HashSet<String> set = new HashSet<>();
            int count = 0;
    
            for (int i = 0; i < arr.length; i++) {
                int sum = 0;
                StringBuilder string = new StringBuilder();
                for (int j = i; j < arr.length; j++) {
                    sum += arr[j];
                    string.append(arr[j]).append(",");
                    if (sum == a && !set.contains(string.toString())) {
                        count++;
                        set.add(string.toString());
                    }
                }
            }
            return count;
    }
}
/**
     * Finds the longest palindromic substring in a given string.
     *
     * @param string The input string in which to search for the longest palindromic substring.
     * @return The longest palindromic substring. Returns an empty string if the input is null or empty.
     *
     */
public static String palindromicSubstring(String string) {
    if (string == null || string.length() < 1) {
        return "";
    }
    int beg = 0;
    int end = 0;

    for (int i = 0; i < string.length(); i++) {
        int len1 = expandFromMid(string, i, i); 
        int len2 = expandFromMid(string, i, i + 1); 
        int len = Math.max(len1, len2);
        if (len > end - beg) {
            beg = i - ((len - 1) / 2);
            end = i + (len / 2);
        }
    }
    return string.substring(beg, end + 1);
}
/**
     * Expands outward from the middle of the string to find the length of the palindrome.
     *
     * @param string The input string.
     * @param left   The starting left index of the potential palindrome.
     * @param right  The starting right index of the potential palindrome.
     * @return The length of the palindrome centered at the given indices.
     */
public static int expandFromMid(String string, int left, int right) {
    if (string == null || left > right) {
        return 0;
    }
    while (left >= 0 && right < string.length() && string.charAt(left) == string.charAt(right)) {
        left--;
        right++;
    }
    return right - left - 1; 
}
}