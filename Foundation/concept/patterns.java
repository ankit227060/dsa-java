/*
 * JAVA PATTERNS - CONCEPT NOTES FOR REVISION
 * ===========================================
 * 23 patterns with diagrams, approach, and code
 */

// ============================================================================
// PATTERN 1: RECTANGULAR STAR PATTERN
// ============================================================================
/*
 * DIAGRAM (n=5):
 * * * * *
 * * * * *
 * * * * *
 * * * * *
 * * * * *
 * 
 * APPROACH:
 * - Outer loop: for rows
 * - Inner loop: for columns
 * - Print "*" for each position
 */
class Pattern1 {
    public static void rectangularStar(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // Pattern1.rectangularStar(5);
}


// ============================================================================
// PATTERN 2: RIGHT-ANGLED TRIANGLE PATTERN
// ============================================================================
/*
 * DIAGRAM (n=5):
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 * 
 * APPROACH:
 * - Outer loop: for rows (1 to n)
 * - Inner loop: for columns (1 to i)
 * - Print "*" for each position
 */
class Pattern2 {
    public static void rightTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // Pattern2.rightTriangle(5);
}


// ============================================================================
// PATTERN 3: RIGHT-ANGLED NUMBER PYRAMID
// ============================================================================
/*
 * DIAGRAM (n=5):
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 * 1 2 3 4 5
 * 
 * APPROACH:
 * - Outer loop: for rows
 * - Inner loop: for numbers (1 to i)
 * - Print numbers incrementing
 */
class Pattern3 {
    public static void numberPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    // Pattern3.numberPyramid(5);
}


// ============================================================================
// PATTERN 4: RIGHT-ANGLED NUMBER PYRAMID - II
// ============================================================================
/*
 * DIAGRAM (n=5):
 * 1
 * 2 2
 * 3 3 3
 * 4 4 4 4
 * 5 5 5 5 5
 * 
 * APPROACH:
 * - Outer loop: for rows
 * - Inner loop: for columns (1 to i)
 * - Print row number i times
 */
class Pattern4 {
    public static void numberPyramidII(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    // Pattern4.numberPyramidII(5);
}


// ============================================================================
// PATTERN 5: INVERTED RIGHT PYRAMID
// ============================================================================
/*
 * DIAGRAM (n=5):
 * * * * * *
 * * * * *
 * * * *
 * * *
 * *
 * 
 * APPROACH:
 * - Outer loop: from n down to 1
 * - Inner loop: for i iterations
 * - Print "*" for each position
 */
class Pattern5 {
    public static void invertedRightPyramid(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // Pattern5.invertedRightPyramid(5);
}


// ============================================================================
// PATTERN 6: INVERTED NUMBERED RIGHT PYRAMID
// ============================================================================
/*
 * DIAGRAM (n=5):
 * 1 2 3 4 5
 * 1 2 3 4
 * 1 2 3
 * 1 2
 * 1
 * 
 * APPROACH:
 * - Outer loop: from n down to 1
 * - Inner loop: for j from 1 to i
 * - Print numbers incrementing
 */
class Pattern6 {
    public static void invertedNumberedPyramid(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    // Pattern6.invertedNumberedPyramid(5);
}


// ============================================================================
// PATTERN 7: STAR PYRAMID PATTERN
// ============================================================================
/*
 * DIAGRAM (n=5):
 *     *
 *    * *
 *   * * *
 *  * * * *
 * * * * * *
 * 
 * APPROACH:
 * - Outer loop: for rows (1 to n)
 * - Print spaces: (n - i) spaces
 * - Inner loop: for i stars
 * - Print "*" with spacing
 */
class Pattern7 {
    public static void starPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }
            // Print stars
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // Pattern7.starPyramid(5);
}


// ============================================================================
// PATTERN 8: INVERTED STAR PYRAMID
// ============================================================================
/*
 * DIAGRAM (n=5):
 * * * * * *
 *  * * * *
 *   * * *
 *    * *
 *     *
 * 
 * APPROACH:
 * - Outer loop: from n down to 1
 * - Print spaces: (n - i) spaces
 * - Inner loop: for i stars
 * - Print "*" with spacing
 */
class Pattern8 {
    public static void invertedStarPyramid(int n) {
        for (int i = n; i >= 1; i--) {
            // Print spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }
            // Print stars
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // Pattern8.invertedStarPyramid(5);
}
