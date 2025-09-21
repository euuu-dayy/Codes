import java.util.*;

public class FirstNonRepeating {
    public static int firstNonRepeating(int[] arr) {
        Map<Integer, Integer> countMap = new LinkedHashMap<>(); // preserves insertion order

        // Count frequency of each element
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Find first element with frequency 1
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        // If no non-repeating element exists
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements (non-zero integers):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = firstNonRepeating(arr);
        System.out.println("First non-repeating element: " + result);
    }
}
