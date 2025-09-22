import java.util.*;

public class SubsetCheck {

    public static boolean isSubset(int[] a, int[] b) {
        Map<Integer, Integer> freq = new HashMap<>();

        // Count frequencies of elements in a[]
        for (int num : a) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Check if all elements of b[] are present in sufficient count
        for (int num : b) {
            if (!freq.containsKey(num) || freq.get(num) == 0) {
                return false; // element missing
            }
            freq.put(num, freq.get(num) - 1); // use one occurrence
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array a
        System.out.print("Enter size of array a: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements of array a:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Input array b
        System.out.print("Enter size of array b: ");
        int m = sc.nextInt();
        int[] b = new int[m];
        System.out.println("Enter elements of array b:");
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        // Check subset
        boolean result = isSubset(a, b);
        System.out.println(result);
    }
}
