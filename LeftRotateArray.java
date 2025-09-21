import java.util.*;

public class LeftRotateArray {

    // Function to reverse a portion of the array
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Function to rotate the array left by d steps
    public static void leftRotate(int[] arr, int d) {
        int n = arr.length;
        d = d % n; // handle cases where d > n
        if (d == 0) return; // no rotation needed

        // Reverse first d elements
        reverse(arr, 0, d - 1);
        // Reverse remaining elements
        reverse(arr, d, n - 1);
        // Reverse the whole array
        reverse(arr, 0, n - 1);
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

        System.out.print("Enter number of rotations: ");
        int d = sc.nextInt();

        leftRotate(arr, d);

        System.out.println("Array after left rotation:");
        System.out.println(Arrays.toString(arr));
    }
}
