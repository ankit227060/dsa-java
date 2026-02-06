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


// ============================================================================
// 4. MERGE SORT
// ============================================================================
/*
 * CONCEPT:
 * - Divide and conquer algorithm
 * - Divides array into halves, sorts recursively, then merges
 * - Stable sort (maintains relative order of equal elements)
 * - Efficient for large datasets
 * - Requires additional space for merging
 * 
 * TIME COMPLEXITY:
 * - Best: O(n log n)
 * - Average: O(n log n)
 * - Worst: O(n log n)
 * 
 * SPACE COMPLEXITY: O(n) - needs temporary array for merging
 * 
 * EXAMPLE:
 * Array: [64, 34, 25, 12]
 * Divide: [64, 34] [25, 12]
 * Further: [64] [34] [25] [12]
 * Merge: [34, 64] [12, 25]
 * Final: [12, 25, 34, 64]
 */
class MergeSort {
    public static void mergeSort(int[] arr) {
        if (arr.length <= 1) return;
        int mid = arr.length / 2;
        
        // Create left and right subarrays
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];
        
        // Copy data to subarrays
        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, arr.length - mid);
        
        // Recursively sort both halves
        mergeSort(left);
        mergeSort(right);
        
        // Merge sorted halves
        merge(arr, left, right);
    }
    
    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        
        // Merge smaller elements
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        
        // Copy remaining elements
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22};
        mergeSort(arr);
        System.out.println("Merge Sort: " + java.util.Arrays.toString(arr));
        // Output: [12, 22, 25, 34, 64]
    }
}


// ============================================================================
// 5. RECURSIVE BUBBLE SORT
// ============================================================================
/*
 * CONCEPT:
 * - Bubble sort implemented recursively
 * - Recursively bubbles largest element to end
 * - Base case: array of size 1 is sorted
 * - Similar performance to iterative, but uses call stack
 * 
 * TIME COMPLEXITY:
 * - Best: O(n) - already sorted
 * - Average: O(n²)
 * - Worst: O(n²)
 * 
 * SPACE COMPLEXITY: O(n) - call stack depth
 */
class RecursiveBubbleSort {
    public static void recursiveBubbleSort(int[] arr, int n) {
        // Base case: if array size is 1, it's sorted
        if (n == 1) return;
        
        // One pass: largest element goes to end
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                // Swap
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        
        // Recursively sort first n-1 elements
        recursiveBubbleSort(arr, n - 1);
    }
    
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22};
        recursiveBubbleSort(arr, arr.length);
        System.out.println("Recursive Bubble Sort: " + java.util.Arrays.toString(arr));
        // Output: [12, 22, 25, 34, 64]
    }
}


// ============================================================================
// 6. RECURSIVE INSERTION SORT
// ============================================================================
/*
 * CONCEPT:
 * - Insertion sort implemented recursively
 * - Recursively sorts first n-1 elements, then inserts nth element
 * - Base case: array of size 1 is sorted
 * - More intuitive than iterative version
 * 
 * TIME COMPLEXITY:
 * - Best: O(n) - already sorted
 * - Average: O(n²)
 * - Worst: O(n²)
 * 
 * SPACE COMPLEXITY: O(n) - call stack depth
 */
class RecursiveInsertionSort {
    public static void recursiveInsertionSort(int[] arr, int n) {
        // Base case: first element is always sorted
        if (n <= 1) return;
        
        // Sort first n-1 elements
        recursiveInsertionSort(arr, n - 1);
        
        // Insert nth element into sorted portion
        insertElement(arr, n - 1);
    }
    
    private static void insertElement(int[] arr, int index) {
        int key = arr[index];
        int j = index - 1;
        
        // Shift elements greater than key to right
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }
        
        // Insert key at correct position
        arr[j + 1] = key;
    }
    
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22};
        recursiveInsertionSort(arr, arr.length);
        System.out.println("Recursive Insertion Sort: " + java.util.Arrays.toString(arr));
        // Output: [12, 22, 25, 34, 64]
    }
}


// ============================================================================
// 7. QUICK SORT
// ============================================================================
/*
 * CONCEPT:
 * - Divide and conquer algorithm
 * - Picks pivot and partitions array around it
 * - Recursively sorts subarrays
 * - NOT stable (may change relative order of equal elements)
 * - Average case is very efficient, widely used in practice
 * 
 * TIME COMPLEXITY:
 * - Best: O(n log n) - well-balanced partitions
 * - Average: O(n log n)
 * - Worst: O(n²) - when pivot is smallest/largest (rare with good pivot selection)
 * 
 * SPACE COMPLEXITY: O(log n) - call stack depth
 * 
 * EXAMPLE:
 * Array: [64, 34, 25, 12, 22]
 * Pivot: 64
 * Partition: [34, 25, 12, 22] | 64 | []
 * Continue recursively on subarrays
 */
class QuickSort {
    public static void quickSort(int[] arr) {
        if (arr.length == 0) return;
        quickSort(arr, 0, arr.length - 1);
    }
    
    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition and get pivot index
            int pi = partition(arr, low, high);
            
            // Recursively sort left and right subarrays
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    
    private static int partition(int[] arr, int low, int high) {
        // Choose last element as pivot
        int pivot = arr[high];
        int i = low - 1;
        
        // Move smaller elements to left
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        // Place pivot at correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        
        return i + 1;
    }
    
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22};
        quickSort(arr);
        System.out.println("Quick Sort: " + java.util.Arrays.toString(arr));
        // Output: [12, 22, 25, 34, 64]
    }
}


// ============================================================================
// SORTING ALGORITHMS QUICK COMPARISON
// ============================================================================

/*
╔═════════════════════════════════════════════════════════════════════════════╗
║                    SORTING ALGORITHMS - QUICK RECAP                        ║
╚═════════════════════════════════════════════════════════════════════════════╝

ALGORITHM              TIME COMPLEXITY          SPACE    STABLE  BEST FOR
                   BEST       AVG       WORST    COMP
─────────────────────────────────────────────────────────────────────────────
Bubble Sort        O(n)       O(n²)     O(n²)    O(1)     YES     Educational
Selection Sort     O(n²)      O(n²)     O(n²)    O(1)     NO      Small datasets
Insertion Sort     O(n)       O(n²)     O(n²)    O(1)     YES     Small/nearly sorted
Merge Sort         O(n log n) O(n log n) O(n log n) O(n)  YES     Large datasets
Recursive Bubble   O(n)       O(n²)     O(n²)    O(n)     YES     Educational
Recursive Insert   O(n)       O(n²)     O(n²)    O(n)     YES     Educational
Quick Sort         O(n log n) O(n log n) O(n²)   O(log n) NO      General purpose

╔═════════════════════════════════════════════════════════════════════════════╗
║                         KEY CHARACTERISTICS                                 ║
╚═════════════════════════════════════════════════════════════════════════════╝

1. BUBBLE SORT
   ├─ Compares adjacent elements
   ├─ Stable and in-place
   ├─ Optimization: break if no swaps
   └─ Use: Learning, small arrays

2. SELECTION SORT
   ├─ Finds and places minimum
   ├─ Not stable, in-place
   ├─ Consistent O(n²) performance
   └─ Use: When memory is critical

3. INSERTION SORT
   ├─ Builds sorted array incrementally
   ├─ Stable and in-place
   ├─ O(n) for nearly sorted data
   └─ Use: Small arrays, online sorting

4. MERGE SORT
   ├─ Divide and conquer approach
   ├─ Stable, requires O(n) space
   ├─ Guaranteed O(n log n)
   └─ Use: Large datasets, consistent performance

5. RECURSIVE BUBBLE SORT
   ├─ Bubble sort using recursion
   ├─ Stable, uses O(n) stack space
   ├─ Same time complexity as iterative
   └─ Use: Understanding recursion

6. RECURSIVE INSERTION SORT
   ├─ Insertion sort using recursion
   ├─ Stable, uses O(n) stack space
   ├─ Elegant recursive pattern
   └─ Use: Understanding recursion

7. QUICK SORT
   ├─ Divide and conquer with partitioning
   ├─ Not stable, uses O(log n) stack space
   ├─ O(n log n) average, O(n²) worst case
   └─ Use: General-purpose, industrial standard

╔═════════════════════════════════════════════════════════════════════════════╗
║                      WHEN TO USE WHICH ALGORITHM                           ║
╚═════════════════════════════════════════════════════════════════════════════╝

Small Dataset (< 50 elements)?
  → Use Insertion Sort (O(n) best case, simple implementation)

Large Dataset?
  → Merge Sort (guaranteed O(n log n), stable)
  → Quick Sort (average O(n log n), widely used)

Need Stable Sort?
  → Bubble Sort, Insertion Sort, Merge Sort

Memory Critical?
  → Selection Sort, Bubble Sort (O(1) space)

Already Nearly Sorted?
  → Insertion Sort (O(n) best case)

Need Best Average Performance?
  → Quick Sort (O(n log n) average, faster in practice)

Need Guaranteed Performance?
  → Merge Sort (always O(n log n))

╔═════════════════════════════════════════════════════════════════════════════╗
║                         QUICK CODE SNIPPETS                                ║
╚═════════════════════════════════════════════════════════════════════════════╝

BUBBLE SORT (Optimized):
  for (int i = 0; i < n-1; i++) {
    boolean swapped = false;
    for (int j = 0; j < n-i-1; j++) {
      if (arr[j] > arr[j+1]) { swap(j, j+1); swapped = true; }
    }
    if (!swapped) break;
  }

SELECTION SORT:
  for (int i = 0; i < n-1; i++) {
    int min = i;
    for (int j = i+1; j < n; j++) {
      if (arr[j] < arr[min]) min = j;
    }
    swap(i, min);
  }

INSERTION SORT:
  for (int i = 1; i < n; i++) {
    int key = arr[i];
    for (int j = i-1; j >= 0 && arr[j] > key; j--) {
      arr[j+1] = arr[j];
    }
    arr[j+1] = key;
  }

MERGE SORT: Divide → Sort → Merge (O(n log n) guaranteed)

QUICK SORT: Partition → Sort left/right (O(n log n) average)

*/
