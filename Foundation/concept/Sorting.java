/*
 * SORTING ALGORITHMS IN JAVA - CONCEPT NOTES FOR REVISION
 * ========================================================
 */

// ============================================================================
// 1. BUBBLE SORT (ITERATIVE)
// ============================================================================
/*
 * CONCEPT:
 * - Compares adjacent elements and swaps if out of order
 * - Largest element "bubbles" to the end in each pass
 * - Stable sort (maintains relative order of equal elements)
 * - Not efficient for large datasets
 * 
 * TIME COMPLEXITY:
 * - Best: O(n) - when array is already sorted (with optimization)
 * - Average: O(n²)
 * - Worst: O(n²) - when array is reverse sorted
 * 
 * SPACE COMPLEXITY: O(1) - in-place sorting
 * 
 * EXAMPLE:
 * Array: [64, 34, 25, 12, 22]
 * Pass 1: [34, 25, 12, 22, 64] - 64 bubbles to end
 * Pass 2: [25, 12, 22, 34, 64] - 34 bubbles to position
 * ...continues until sorted
 */
class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        // Outer loop: number of passes
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            // Inner loop: compare adjacent elements
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // Optimization: if no swap, array is sorted
            if (!swapped) break;
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22};
        bubbleSort(arr);
        System.out.println("Bubble Sort: " + java.util.Arrays.toString(arr));
        // Output: [12, 22, 25, 34, 64]
    }
}


// ============================================================================
// 2. SELECTION SORT
// ============================================================================
/*
 * CONCEPT:
 * - Finds minimum element and places it at the beginning
 * - Divides array into sorted and unsorted portions
 * - NOT stable (may change relative order of equal elements)
 * - Better than bubble sort but still O(n²)
 * 
 * TIME COMPLEXITY:
 * - Best: O(n²)
 * - Average: O(n²)
 * - Worst: O(n²)
 * 
 * SPACE COMPLEXITY: O(1) - in-place sorting
 * 
 * EXAMPLE:
 * Array: [64, 34, 25, 12, 22]
 * Pass 1: Find min(12), swap → [12, 34, 25, 64, 22]
 * Pass 2: Find min(22), swap → [12, 22, 25, 64, 34]
 * ...continues until sorted
 */
class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        // Outer loop: each position to be filled
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            // Find minimum in unsorted portion
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            // Swap minimum with current position
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22};
        selectionSort(arr);
        System.out.println("Selection Sort: " + java.util.Arrays.toString(arr));
        // Output: [12, 22, 25, 34, 64]
    }
}


// ============================================================================
// 3. INSERTION SORT (ITERATIVE)
// ============================================================================
/*
 * CONCEPT:
 * - Builds sorted array one item at a time
 * - Inserts element into correct position in sorted portion
 * - Stable sort (maintains relative order of equal elements)
 * - Efficient for small datasets and nearly sorted arrays
 * 
 * TIME COMPLEXITY:
 * - Best: O(n) - when array is already sorted
 * - Average: O(n²)
 * - Worst: O(n²) - when array is reverse sorted
 * 
 * SPACE COMPLEXITY: O(1) - in-place sorting
 * 
 * EXAMPLE:
 * Array: [64, 34, 25, 12, 22]
 * Step 1: [34, 64, 25, 12, 22] - 34 inserted
 * Step 2: [25, 34, 64, 12, 22] - 25 inserted
 * Step 3: [12, 25, 34, 64, 22] - 12 inserted
 * Step 4: [12, 22, 25, 34, 64] - 22 inserted
 */
class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        // Start from second element
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            // Shift elements greater than key to right
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            // Insert key at correct position
            arr[j + 1] = key;
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22};
        insertionSort(arr);
        System.out.println("Insertion Sort: " + java.util.Arrays.toString(arr));
        // Output: [12, 22, 25, 34, 64]
    }
}
