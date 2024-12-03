import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Enter the size of the array: ");
            int n = scan.nextInt();

            int[] arr = new int[n];

            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }

            System.out.print("Enter the target sum: ");
            int targetSum = scan.nextInt();

            
            int result = su.subArrSum(arr, targetSum);
            System.out.println("Number of unique subarrays that sum to " + targetSum + ": " + result);

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter integers only.");
        } finally {
            scan.close();
        }
    }
}
