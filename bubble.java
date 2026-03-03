public class bubble {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were swapped, array is sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] a) {
        int[] numbers = {5, 3, 8, 4, 2};

        bubbleSort(numbers);

        System.out.println("Sorted array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
