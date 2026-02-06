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
