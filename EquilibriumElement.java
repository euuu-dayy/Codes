import java.util.*;

public class EquilibriumElement {

    public static boolean hasEquilibrium(int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num; // sum of all elements
        }

        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int  rightSum = totalSum - leftSum - arr[i] ;
            if (leftSum == rightSum) {
                return true; // arr[i]
            }
            leftSum += arr[i];
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean result = hasEquilibrium(arr);
        System.out.println(result);
    }
}
