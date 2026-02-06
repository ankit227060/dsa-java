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
