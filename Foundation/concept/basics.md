# Java Foundation Concepts - Revision Notes

## 1. User Input / Output

**Example:**
```java
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        String name = sc.nextLine();  // Read string input
        
        System.out.println("Enter your age: ");
        int age = sc.nextInt();  // Read integer input
        
        System.out.println("Hello " + name + ", you are " + age + " years old");
        sc.close();
    }
}

## 2. Arrays and Strings

**Arrays:**
- Collection of elements of the same data type
- Fixed size, indexed from 0
- `int[] arr = {1, 2, 3};` or `int[] arr = new int[5];`

**Strings:**
- Sequence of characters
- Immutable in Java
- `String str = "Hello";`

**Example:**
```java
public class ArraysAndStrings {
    public static void main(String[] args) {
        // Array
        int[] numbers = {10, 20, 30, 40};
        System.out.println("Array element: " + numbers[0]);
        
        // String
        String str = "Java";
        System.out.println("String: " + str);
        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        
        // String array
        String[] fruits = {"Apple", "Banana", "Orange"};
        System.out.println("First fruit: " + fruits[0]);
    }
}
```

---

## 3. Data Types

**Primitive Data Types:**
- `byte` (8 bits): -128 to 127
- `short` (16 bits): -32,768 to 32,767
- `int` (32 bits): -2,147,483,648 to 2,147,483,647
- `float` (32 bits): Decimal numbers
- `long` (64 bits): Very large numbers
- `double` (64 bits): More precise decimal numbers
- `boolean`: true or false
- `char`: Single character

**Non-Primitive Data Types:**
- `String`, `Arrays`, `Classes`, `Objects`

**Example:**
```java
public class DataTypes {
    public static void main(String[] args) {
        int age = 25;
        double salary = 50000.50;
        boolean isStudent = true;
        char grade = 'A';
        String name = "John";
        
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Grade: " + grade);
    }
}
```

---

## 4. If-Else Statements

**Concept:**
- Executes code block if condition is true
- `else` executes if condition is false
- `else if` checks multiple conditions

**Example:**
```java
public class IfElse {
    public static void main(String[] args) {
        int marks = 85;
        
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 80) {
            System.out.println("Grade: B");
        } else if (marks >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }
    }
}
```

---

## 5. Switch Statement

**Concept:**
- Cleaner alternative to multiple if-else
- Checks a variable against multiple values
- Use `break` to exit (prevents fall-through)
- `default` executes if no case matches

**Example:**
```java
public class SwitchStatement {
    public static void main(String[] args) {
        int day = 3;
        String dayName;
        
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            default:
                dayName = "Unknown";
        }
        System.out.println("Day: " + dayName);
    }
}
```

---

## 6. For Loops

**Concept:**
- Repeats code block for a fixed number of times
- Syntax: `for (init; condition; increment)`
- Used when number of iterations is known

**Example:**
```java
public class ForLoop {
    public static void main(String[] args) {
        // Standard for loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }
        
        // For-each loop (iterate over array)
        String[] colors = {"Red", "Green", "Blue"};
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
```

---

## 7. While Loops

**Concept:**
- Repeats code block while condition is true
- Condition checked before execution
- Used when number of iterations is unknown
- Risk of infinite loop if condition never becomes false

**Example:**
```java
public class WhileLoop {
    public static void main(String[] args) {
        // Standard while loop
        int count = 1;
        while (count <= 5) {
            System.out.println("Count: " + count);
            count++;
        }
        
        // Do-while loop (executes at least once)
        int num = 1;
        do {
            System.out.println("Number: " + num);
            num++;
        } while (num <= 3);
    }
}
```

---

## 8. Functions (Pass by Reference and Value)

**Concept:**
- **Pass by Value:** Copies the value (primitives)
- **Pass by Reference:** Passes memory address (objects)
- Methods can return values or return nothing (void)

**Example:**
```java
public class Functions {
    // Pass by value (primitive)
    public static void changeValue(int x) {
        x = 100;  // Changes only local copy
    }
    
    // Pass by reference (object)
    public static void changeArray(int[] arr) {
        arr[0] = 999;  // Changes actual array
    }
    
    // Return value
    public static int add(int a, int b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        // Pass by value
        int num = 10;
        changeValue(num);
        System.out.println("num after call: " + num);  // Still 10
        
        // Pass by reference
        int[] arr = {1, 2, 3};
        changeArray(arr);
        System.out.println("arr[0] after call: " + arr[0]);  // Changed to 999
        
        // Function with return value
        int sum = add(5, 3);
        System.out.println("Sum: " + sum);  // Output: 8
    }
}
```

---

## 9. Time Complexity [Basics]

**Concept:**
- Measures how algorithm performance grows with input size
- Expressed using Big O notation
- Helps analyze efficiency of code

**Common Time Complexities (from best to worst):**
- **O(1)** - Constant: Accessing array element by index
- **O(log n)** - Logarithmic: Binary search
- **O(n)** - Linear: Simple loop through array
- **O(n log n)** - Log-linear: Merge sort, Quick sort
- **O(n²)** - Quadratic: Nested loops (Bubble sort)
- **O(n³)** - Cubic: Triple nested loops
- **O(2ⁿ)** - Exponential: Recursive fibonacci
- **O(n!)** - Factorial: Permutations generation

**Example:**
```java
public class TimeComplexity {
    
    // O(1) - Constant
    public static int getFirst(int[] arr) {
        return arr[0];
    }
    
    // O(n) - Linear
    public static int findSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {  // Loop runs n times
            sum += num;
        }
        return sum;
    }
    
    // O(n²) - Quadratic
    public static void printPairs(int[] arr) {
        for (int i = 0; i < arr.length; i++) {  // n times
            for (int j = 0; j < arr.length; j++) {  // n times
                System.out.println(arr[i] + ", " + arr[j]);
            }
        }
    }
    
    // O(log n) - Logarithmic (Binary Search)
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {  // Runs log n times
            int mid = (left + right) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
}
```

**Quick Tips:**
- O(1) is best, avoid O(n!) or O(2ⁿ) when possible
- Nested loops multiply complexities
- Drop constants and lower-order terms: O(2n) = O(n)

