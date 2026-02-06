/*
 * JAVA COLLECTION FRAMEWORK - CONCEPT NOTES FOR REVISION
 * ========================================================
 */

// ============================================================================
// 1. ARRAYLIST
// ============================================================================
/*
 * CONCEPT:
 * - Resizable array implementation of List interface
 * - Dynamic size (grows/shrinks automatically)
 * - Maintains insertion order
 * - Not thread-safe
 * 
 * KEY OPERATIONS (Time Complexity):
 * - add(E e): O(1) amortized
 * - get(int index): O(1)
 * - remove(int index): O(n)
 * - contains(Object o): O(n)
 * 
 * EXAMPLE:
 */
import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        // Add elements
        list.add(10);
        list.add(20);
        list.add(30);
        
        // Access element
        System.out.println("First: " + list.get(0));  // 10
        
        // Remove element
        list.remove(1);  // Removes 20
        
        // Check size
        System.out.println("Size: " + list.size());  // 2
        
        // Iterate
        for (int num : list) {
            System.out.println(num);
        }
    }
}


// ============================================================================
// 2. STACK
// ============================================================================
/*
 * CONCEPT:
 * - LIFO (Last In First Out) data structure
 * - Last element added is first to be removed
 * - Built on top of Vector class
 * 
 * KEY OPERATIONS:
 * - push(E e): Add element at top - O(1)
 * - pop(): Remove and return top element - O(1)
 * - peek(): View top element without removing - O(1)
 * - isEmpty(): Check if empty - O(1)
 * 
 * EXAMPLE:
 */
class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        
        // Push elements
        stack.push("A");
        stack.push("B");
        stack.push("C");
        
        // Peek (view top)
        System.out.println("Top: " + stack.peek());  // C
        
        // Pop (remove top)
        System.out.println("Popped: " + stack.pop());  // C
        
        // Check if empty
        System.out.println("Empty: " + stack.isEmpty());  // false
    }
}


// ============================================================================
// 3. QUEUE
// ============================================================================
/*
 * CONCEPT:
 * - FIFO (First In First Out) data structure
 * - First element added is first to be removed
 * - Interface (implement with LinkedList, ArrayDeque, etc.)
 * 
 * KEY OPERATIONS:
 * - add(E e) / offer(E e): Add element to rear - O(1)
 * - remove() / poll(): Remove and return front - O(1)
 * - element() / peek(): View front without removing - O(1)
 * 
 * EXAMPLE:
 */
class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        
        // Add elements
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        
        // Peek front
        System.out.println("Front: " + queue.peek());  // 10
        
        // Poll front
        System.out.println("Removed: " + queue.poll());  // 10
        
        // Size
        System.out.println("Size: " + queue.size());  // 2
    }
}


// ============================================================================
// 4. LINKEDLIST
// ============================================================================
/*
 * CONCEPT:
 * - Doubly-linked list implementation
 * - Not thread-safe
 * - Implements both List and Deque
 * - Better for insertion/deletion at both ends
 * 
 * KEY OPERATIONS:
 * - add(E e): Add at end - O(1)
 * - addFirst(E e) / addLast(E e): O(1)
 * - remove(int index): O(n)
 * - get(int index): O(n)
 * 
 * EXAMPLE:
 */
class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        
        // Add elements
        list.add("A");
        list.add("B");
        list.add("C");
        
        // Add at specific positions
        list.addFirst("Z");  // Add at beginning
        list.addLast("W");   // Add at end
        
        // Remove
        list.removeFirst();
        list.removeLast();
        
        // Iterate
        for (String s : list) {
            System.out.println(s);  // Z, A, B, C
        }
    }
}


// ============================================================================
// 5. ITERATOR
// ============================================================================
/*
 * CONCEPT:
 * - Interface to traverse collection elements sequentially
 * - Allows safe removal during iteration
 * - Methods: hasNext(), next(), remove()
 * 
 * KEY OPERATIONS:
 * - hasNext(): Check if more elements - O(1)
 * - next(): Get next element - O(1)
 * - remove(): Remove current element - O(n) depends on collection
 * 
 * EXAMPLE:
 */
class IteratorExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        
        Iterator<Integer> iter = list.iterator();
        
        while (iter.hasNext()) {
            int num = iter.next();
            if (num == 2) {
                iter.remove();  // Safe removal
            }
            System.out.println(num);
        }
        
        System.out.println("After removal: " + list);  // [1, 3, 4, 5]
    }
}


// ============================================================================
// 6. PRIORITYQUEUE
// ============================================================================
/*
 * CONCEPT:
 * - Min-heap by default (smallest element has highest priority)
 * - Not thread-safe
 * - Elements ordered by priority, not insertion order
 * 
 * KEY OPERATIONS:
 * - add(E e) / offer(E e): Add element - O(log n)
 * - poll(): Remove min element - O(log n)
 * - peek(): View min element - O(1)
 * 
 * EXAMPLE:
 */
class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        // Add elements (unordered)
        pq.add(30);
        pq.add(10);
        pq.add(20);
        
        // Poll removes in priority order (min first)
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());  // 10, 20, 30
        }
        
        // For max-heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.add(30);
        maxHeap.add(10);
        maxHeap.add(20);
        System.out.println(maxHeap.poll());  // 30
    }
}


// ============================================================================
// 7. ARRAYDEQUE
// ============================================================================
/*
 * CONCEPT:
 * - Resizable array implementation of Deque (Double Ended Queue)
 * - Faster than LinkedList for operations at both ends
 * - Not thread-safe
 * 
 * KEY OPERATIONS:
 * - addFirst(E e) / addLast(E e): Add at ends - O(1)
 * - removeFirst() / removeLast(): Remove from ends - O(1)
 * - getFirst() / getLast(): View ends - O(1)
 * 
 * EXAMPLE:
 */
class ArrayDequeExample {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();
        
        // Add at both ends
        deque.addFirst("A");
        deque.addLast("B");
        deque.addLast("C");
        
        // View
        System.out.println("First: " + deque.getFirst());  // A
        System.out.println("Last: " + deque.getLast());    // C
        
        // Remove from both ends
        System.out.println("Removed First: " + deque.removeFirst());  // A
        System.out.println("Removed Last: " + deque.removeLast());    // C
    }
}


// ============================================================================
// 8. HASHSET
// ============================================================================
/*
 * CONCEPT:
 * - Unordered collection of unique elements
 * - Based on HashMap
 * - No duplicate values allowed
 * - No insertion order maintained
 * 
 * KEY OPERATIONS:
 * - add(E e): Add element - O(1)
 * - remove(Object o): Remove element - O(1)
 * - contains(Object o): Check existence - O(1)
 * - size(): Get size - O(1)
 * 
 * EXAMPLE:
 */
class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        
        // Add elements
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);  // Duplicate, won't be added
        
        System.out.println("Size: " + set.size());  // 3
        System.out.println("Contains 20: " + set.contains(20));  // true
        
        // Remove
        set.remove(20);
        
        // Iterate
        for (int num : set) {
            System.out.println(num);
        }
    }
}


// ============================================================================
// 9. LINKEDHASHSET
// ============================================================================
/*
 * CONCEPT:
 * - LinkedList + HashSet combination
 * - Maintains insertion order
 * - Unique elements only
 * - Slightly slower than HashSet due to linked list overhead
 * 
 * KEY OPERATIONS:
 * - add(E e): Add element - O(1)
 * - remove(Object o): Remove element - O(1)
 * - Iteration order: Insertion order
 * 
 * EXAMPLE:
 */
class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        
        // Add elements
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("A");  // Duplicate ignored
        
        // Iterate - maintains insertion order
        for (String s : set) {
            System.out.println(s);  // A, B, C
        }
    }
}


// ============================================================================
// 10. TREESET
// ============================================================================
/*
 * CONCEPT:
 * - Sorted Set using Red-Black tree
 * - Elements automatically sorted (ascending by default)
 * - No duplicates
 * - Slower than HashSet but maintains order
 * 
 * KEY OPERATIONS:
 * - add(E e): Add element - O(log n)
 * - remove(Object o): Remove element - O(log n)
 * - ceiling(E e): Smallest >= E - O(log n)
 * - floor(E e): Largest <= E - O(log n)
 * 
 * EXAMPLE:
 */
class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        
        // Add elements (automatically sorted)
        set.add(30);
        set.add(10);
        set.add(20);
        
        // Iterate - automatic sorting
        for (int num : set) {
            System.out.println(num);  // 10, 20, 30
        }
        
        // Range operations
        System.out.println("Ceiling of 15: " + set.ceiling(15));  // 20
        System.out.println("Floor of 15: " + set.floor(15));      // 10
        
        // Reverse order
        for (int num : set.descendingSet()) {
            System.out.println(num);  // 30, 20, 10
        }
    }
}


// ============================================================================
// 11. SET OF CUSTOM CLASSES
// ============================================================================
/*
 * CONCEPT:
 * - Store custom objects in Set
 * - Must override equals() and hashCode() for HashSet/LinkedHashSet
 * - Must implement Comparable for TreeSet
 * 
 * EXAMPLE:
 */
class Student {
    int id;
    String name;
    
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }
    
    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
    
    @Override
    public String toString() {
        return "Student(" + id + ", " + name + ")";
    }
}

class CustomSetExample {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<>();
        
        set.add(new Student(1, "Alice"));
        set.add(new Student(2, "Bob"));
        set.add(new Student(1, "Alice"));  // Duplicate, won't be added
        
        System.out.println("Size: " + set.size());  // 2
        
        for (Student s : set) {
            System.out.println(s);
        }
    }
}


// ============================================================================
// 12. HASHMAP
// ============================================================================
/*
 * CONCEPT:
 * - Key-Value pair storage with HashMap
 * - Unordered (order not guaranteed)
 * - Allows null key and values
 * - Not thread-safe
 * 
 * KEY OPERATIONS:
 * - put(K key, V value): Add/update - O(1)
 * - get(Object key): Retrieve value - O(1)
 * - remove(Object key): Remove entry - O(1)
 * - containsKey(Object key): Check key - O(1)
 * 
 * EXAMPLE:
 */
class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        
        // Add entries
        map.put(1, "Alice");
        map.put(2, "Bob");
        map.put(3, "Charlie");
        
        // Get value
        System.out.println("ID 2: " + map.get(2));  // Bob
        
        // Check key
        System.out.println("Contains 1: " + map.containsKey(1));  // true
        
        // Remove
        map.remove(2);
        
        // Iterate
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}


// ============================================================================
// 13. TREEMAP
// ============================================================================
/*
 * CONCEPT:
 * - Sorted Map using Red-Black tree
 * - Keys automatically sorted in ascending order
 * - Slower than HashMap but maintains order
 * - No null keys allowed
 * 
 * KEY OPERATIONS:
 * - put(K key, V value): Add/update - O(log n)
 * - get(Object key): Retrieve - O(log n)
 * - remove(Object key): Remove - O(log n)
 * - ceilingKey(K key): First key >= K - O(log n)
 * 
 * EXAMPLE:
 */
class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        
        // Add entries (automatically sorted by key)
        map.put(3, "Charlie");
        map.put(1, "Alice");
        map.put(2, "Bob");
        
        // Iterate - automatic sorting by key
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
            // Output: 1->Alice, 2->Bob, 3->Charlie
        }
        
        // Range operations
        System.out.println("Ceiling key of 2: " + map.ceilingKey(2));  // 2
        System.out.println("Floor key of 2: " + map.floorKey(2));      // 2
    }
}


// ============================================================================
// 14. ARRAYS CLASS
// ============================================================================
/*
 * CONCEPT:
 * - Utility class for array operations
 * - Static methods for sorting, searching, copying
 * - Part of java.util package
 * 
 * KEY OPERATIONS:
 * - Arrays.sort(array): Sort array - O(n log n)
 * - Arrays.binarySearch(array, key): Search sorted array - O(log n)
 * - Arrays.copyOf(array, length): Copy array - O(n)
 * - Arrays.fill(array, value): Fill array - O(n)
 * - Arrays.asList(array): Convert to List - O(1)
 * 
 * EXAMPLE:
 */
class ArraysClassExample {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9};
        
        // Sort
        Arrays.sort(arr);
        System.out.println("Sorted: " + Arrays.toString(arr));  // [1, 2, 5, 8, 9]
        
        // Binary search (must be sorted)
        int index = Arrays.binarySearch(arr, 5);
        System.out.println("Index of 5: " + index);  // 2
        
        // Copy
        int[] copy = Arrays.copyOf(arr, arr.length);
        
        // Fill
        Arrays.fill(arr, 0);
        System.out.println("Filled: " + Arrays.toString(arr));  // [0, 0, 0, 0, 0]
        
        // Convert to List
        List<Integer> list = Arrays.asList(1, 2, 3);
    }
}


// ============================================================================
// 15. COLLECTIONS CLASS
// ============================================================================
/*
 * CONCEPT:
 * - Utility class for collection operations
 * - Static methods for searching, sorting, shuffling
 * - Provides unmodifiable, synchronized views
 * 
 * KEY OPERATIONS:
 * - Collections.sort(list): Sort list - O(n log n)
 * - Collections.reverse(list): Reverse list - O(n)
 * - Collections.shuffle(list): Randomize list - O(n)
 * - Collections.binarySearch(list, key): Search - O(log n)
 * - Collections.max(collection): Get maximum - O(n)
 * - Collections.min(collection): Get minimum - O(n)
 * - Collections.frequency(collection, obj): Count occurrences - O(n)
 * - Collections.unmodifiableList(list): Make immutable
 * - Collections.synchronizedList(list): Make thread-safe
 * 
 * EXAMPLE:
 */
class CollectionsClassExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 9, 2));
        
        // Sort
        Collections.sort(list);
        System.out.println("Sorted: " + list);  // [1, 2, 2, 5, 8, 9]
        
        // Reverse
        Collections.reverse(list);
        System.out.println("Reversed: " + list);  // [9, 8, 5, 2, 2, 1]
        
        // Find max/min
        System.out.println("Max: " + Collections.max(list));  // 9
        System.out.println("Min: " + Collections.min(list));  // 1
        
        // Frequency
        System.out.println("Frequency of 2: " + Collections.frequency(list, 2));  // 2
        
        // Shuffle
        Collections.shuffle(list);
        System.out.println("Shuffled: " + list);
        
        // Binary search
        Collections.sort(list);
        int index = Collections.binarySearch(list, 5);
        System.out.println("Index of 5: " + index);
        
        // Make unmodifiable
        List<Integer> immutable = Collections.unmodifiableList(list);
        // immutable.add(10);  // Throws UnsupportedOperationException
    }
}


/*
 * ========================================================================
 * QUICK COMPARISON TABLE
 * ========================================================================
 * 
 * LIST:
 * ArrayList     - Fast random access, slow insertion/deletion (middle)
 * LinkedList    - Fast insertion/deletion, slow random access
 * 
 * SET:
 * HashSet       - Unordered, fastest, no duplicates
 * LinkedHashSet - Insertion order maintained, unique elements
 * TreeSet       - Sorted order, unique, slow but ordered
 * 
 * QUEUE:
 * Queue         - FIFO operations
 * Deque         - Double ended operations
 * PriorityQueue - Elements by priority
 * 
 * MAP:
 * HashMap       - Unordered key-value pairs, fastest
 * TreeMap       - Sorted by key, slower but ordered
 * 
 * ========================================================================
 */


// ============================================================================
// QUICK RECAP - ALL 15 COLLECTIONS AT A GLANCE
// ============================================================================

/*
╔═════════════════════════════════════════════════════════════════════════════╗
║                  ALL 15 COLLECTIONS - QUICK SUMMARY CHART                   ║
╚═════════════════════════════════════════════════════════════════════════════╝

#   NAME              TYPE       ORDER          KEY METHODS           COMPLEXITY  BEST FOR
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
1   ArrayList         List       Insertion      add, get, remove      O(1)/O(n)   Fast random access
2   Stack             LIFO       LIFO           push, pop, peek       O(1)        Undo/Redo, DFS
3   Queue             FIFO       FIFO           offer, poll, peek     O(1)        BFS, Task queue
4   LinkedList        List       Insertion      add, get, remove      O(1)/O(n)   Insert/Delete ends
5   Iterator          —          Sequential     hasNext, next, remove O(1)/O(n)   Safe iteration
6   PriorityQueue     Queue      Priority       add, poll, peek       O(log n)/O(1) Heap, Dijkstra
7   ArrayDeque        Deque      Both ends      addFirst/Last         O(1)        Deque operations
8   HashSet           Set        Unordered      add, remove, contains O(1)        Fast lookup
9   LinkedHashSet     Set        Insertion      add, remove, contains O(1)        Order + speed
10  TreeSet           Set        Sorted         add, ceiling, floor   O(log n)    Sorted + range
11  Custom Class Set  Set        —              Override equals/hash  O(1)/O(log) Object storage
12  HashMap           Map        Unordered      put, get, remove      O(1)        Key-value lookup
13  TreeMap           Map        Sorted key     put, get, ceiling     O(log n)    Sorted map
14  Arrays            Utility    —              sort, search, copy    O(n log n)  Array operations
15  Collections       Utility    —              sort, shuffle, max     O(n log n)  Collection utilities
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━

╔═════════════════════════════════════════════════════════════════════════════╗
║                    ONE-LINER QUICK REFERENCE                               ║
╚═════════════════════════════════════════════════════════════════════════════╝

1.  ArrayList        → Resizable array, fast random access O(1), slow middle removal O(n)
2.  Stack            → LIFO push/pop/peek O(1), use for undo/backtracking
3.  Queue (FIFO)     → FIFO offer/poll/peek O(1), use for BFS/scheduling
4.  LinkedList       → Doubly-linked, fast ends O(1), slow random access O(n)
5.  Iterator         → Traverse safely with hasNext/next/remove, avoid ConcurrentModification
6.  PriorityQueue    → Min-heap O(log n) add/remove, max-heap with reverseOrder()
7.  ArrayDeque       → Fast deque operations at both ends O(1), faster than LinkedList
8.  HashSet          → Unordered unique elements O(1), override equals/hashCode
9.  LinkedHashSet    → HashSet + insertion order O(1), slight overhead vs HashSet
10. TreeSet          → Sorted unique O(log n), Red-Black tree, ceiling/floor/range queries
11. Set of Custom    → Override equals/hashCode for Hash types, Comparable for Tree types
12. HashMap          → Unordered key-value O(1), allows null key/values, fast lookup
13. TreeMap          → Sorted by key O(log n), Red-Black tree, range operations, no null keys
14. Arrays Class     → Static utilities: sort O(n log n), binarySearch O(log n), copy, fill, asList
15. Collections      → Static utilities: sort, reverse, shuffle, max, min, frequency, unmodifiable

╔═════════════════════════════════════════════════════════════════════════════╗
║                         DECISION TREE                                       ║
╚═════════════════════════════════════════════════════════════════════════════╝

NEED A COLLECTION?
├─ NEED ORDERED ACCESS?
│  ├─ Random access? → ArrayList (fast get O(1))
│  └─ Frequent insertions? → LinkedList (O(1) at ends)
│
├─ NEED UNIQUE ELEMENTS (SET)?
│  ├─ Need fast lookup only? → HashSet O(1)
│  ├─ Need insertion order? → LinkedHashSet O(1)
│  └─ Need sorted order? → TreeSet O(log n) + range operations
│
├─ NEED FIFO/LIFO?
│  ├─ LIFO (Last-In-First-Out)? → Stack (push/pop/peek)
│  ├─ FIFO (First-In-First-Out)? → Queue with LinkedList
│  ├─ By priority? → PriorityQueue (heap)
│  └─ Both ends? → ArrayDeque (deque operations)
│
└─ NEED KEY-VALUE PAIRS (MAP)?
   ├─ Need fast lookup? → HashMap O(1)
   ├─ Need sorted keys? → TreeMap O(log n)
   └─ Need insertion order? → LinkedHashMap (not in 15)

╔═════════════════════════════════════════════════════════════════════════════╗
║                     OPERATION COMPARISON TABLE                              ║
╚═════════════════════════════════════════════════════════════════════════════╝

           ArrayList  LinkedList  Stack   Queue   HashSet  TreeSet  HashMap  TreeMap
add()      O(1)       O(1)        O(1)    O(1)    O(1)     O(log n) O(1)     O(log n)
remove()   O(n)       O(n)        O(1)    O(1)    O(1)     O(log n) O(1)     O(log n)
get()      O(1)       O(n)        —       —       —        —        —        —
contains() O(n)       O(n)        —       —       O(1)     O(log n) O(1)     O(log n)
iterate    O(n)       O(n)        O(n)    O(n)    O(n)     O(n)     O(n)     O(n)

╔═════════════════════════════════════════════════════════════════════════════╗
║                        KEY PATTERNS & TRICKS                                ║
╚═════════════════════════════════════════════════════════════════════════════╝

Stack → Use LinkedList or ArrayDeque for better performance (not always Stack class)
Queue → Implement with LinkedList: Queue<T> q = new LinkedList<>();
MaxHeap → PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
Custom Objects → HashSet/TreeSet need equals/hashCode or Comparable
Sorted Map → TreeMap only, no alternative
Immutable → Collections.unmodifiableList/Set/Map(collection)
Thread-Safe → Collections.synchronizedList/Set/Map(collection)
Iterator → Use to safely remove during iteration: while(it.hasNext()) it.remove();
Array to List → Arrays.asList(array) for quick conversion
List to Array → list.toArray() or list.toArray(new T[0])

*/