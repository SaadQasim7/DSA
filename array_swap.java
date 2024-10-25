import java.util.Arrays;

public class array_swap {
    public static void main(String[] args) {
        int[] arr = {2, 1, 53, 3, 6};

        for (int i = 0; i < arr.length - 1; i += 2) {
            // Swap the current element with the next element
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
