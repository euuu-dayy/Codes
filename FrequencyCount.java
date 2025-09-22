import java.util.*;

public class FrequencyCount {

    public static int[] countFrequencies(int[] arr) {
        int n = arr.length;
        int[] freq = new int[n]; // stores frequency for 1..n
        // by default there are 0s preset in array
        // Count occurrences
        for (int num : arr) {
            if (num >= 1 && num <= n) {
                freq[num - 1]++;  // store at index num-1
            }
        }

        return freq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input elements
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Get frequency
        int[] result = countFrequencies(arr);

        // Print result
        System.out.println(Arrays.toString(result));
    }
}
