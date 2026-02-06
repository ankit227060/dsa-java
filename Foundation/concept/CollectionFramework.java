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

