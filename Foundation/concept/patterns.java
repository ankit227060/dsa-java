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


// ============================================================================
// PATTERN 9: DIAMOND STAR PATTERN
// ============================================================================
/*
 * DIAGRAM (n=5):
 *     *
 *    * *
 *   * * *
 *  * * * *
 * * * * * *
 *  * * * *
 *   * * *
 *    * *
 *     *
 * 
 * APPROACH:
 * - Upper half: Star pyramid (1 to n)
 * - Lower half: Inverted star pyramid (n-1 to 1)
 */
class Pattern9 {
    public static void diamondStar(int n) {
        // Upper half
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) System.out.print("  ");
            for (int j = 0; j < i; j++) System.out.print("* ");
            System.out.println();
        }
        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j < n - i; j++) System.out.print("  ");
            for (int j = 0; j < i; j++) System.out.print("* ");
            System.out.println();
        }
    }
    // Pattern9.diamondStar(5);
}


// ============================================================================
// PATTERN 10: HALF DIAMOND STAR PATTERN
// ============================================================================
/*
 * DIAGRAM (n=5):
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 * * * * *
 * * * *
 * * *
 * *
 * 
 * APPROACH:
 * - Upper half: Right triangle (1 to n)
 * - Lower half: Inverted right triangle (n-1 to 1)
 */
class Pattern10 {
    public static void halfDiamond(int n) {
        // Upper half
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) System.out.print("* ");
            System.out.println();
        }
        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) System.out.print("* ");
            System.out.println();
        }
    }
    // Pattern10.halfDiamond(5);
}


// ============================================================================
// PATTERN 11: BINARY NUMBER TRIANGLE PATTERN
// ============================================================================
/*
 * DIAGRAM (n=5):
 * 1
 * 0 1
 * 1 0 1
 * 0 1 0 1
 * 1 0 1 0 1
 * 
 * APPROACH:
 * - Outer loop: for rows
 * - Inner loop: alternate between 0 and 1
 * - If (i+j) is even, print 1; else print 0
 */
class Pattern11 {
    public static void binaryTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(((i + j) % 2) + " ");
            }
            System.out.println();
        }
    }
    // Pattern11.binaryTriangle(5);
}


// ============================================================================
// PATTERN 12: NUMBER CROWN PATTERN
// ============================================================================
/*
 * DIAGRAM (n=5):
 * 1        1
 * 12      21
 * 123    321
 * 1234  4321
 * 1234554321
 * 
 * APPROACH:
 * - Outer loop: for rows
 * - Left side: print 1 to i (no spaces)
 * - Spaces: (2 * (n - i)) spaces
 * - Right side: print i down to 1 (no spaces)
 */
class Pattern12 {
    public static void numberCrown(int n) {
        for (int i = 1; i <= n; i++) {
            // Left side (1 to i)
            for (int j = 1; j <= i; j++) System.out.print(j);
            // Spaces in middle
            for (int j = 0; j < 2 * (n - i); j++) System.out.print(" ");
            // Right side (i down to 1)
            for (int j = i; j >= 1; j--) System.out.print(j);
            System.out.println();
        }
    }
    // Pattern12.numberCrown(5);
}


// ============================================================================
// PATTERN 13: INCREASING NUMBER TRIANGLE PATTERN
// ============================================================================
/*
 * DIAGRAM (n=5):
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 * 11 12 13 14 15
 * 
 * APPROACH:
 * - Outer loop: for rows
 * - Inner loop: for columns
 * - Use counter variable to print continuous numbers
 */
class Pattern13 {
    public static void increasingNumberTriangle(int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }
    // Pattern13.increasingNumberTriangle(5);
}


// ============================================================================
// PATTERN 14: INCREASING LETTER TRIANGLE PATTERN
// ============================================================================
/*
 * DIAGRAM (n=5):
 * A
 * A B
 * A B C
 * A B C D
 * A B C D E
 * 
 * APPROACH:
 * - Outer loop: for rows
 * - Inner loop: for columns
 * - Cast (char)('A' + j) to print letters
 */
class Pattern14 {
    public static void increasingLetterTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char)('A' + j) + " ");
            }
            System.out.println();
        }
    }
    // Pattern14.increasingLetterTriangle(5);
}


// ============================================================================
// PATTERN 15: REVERSE LETTER TRIANGLE PATTERN
// ============================================================================
/*
 * DIAGRAM (n=5):
 * E D C B A
 * D C B A
 * C B A
 * B A
 * A
 * 
 * APPROACH:
 * - Outer loop: from n down to 1
 * - Inner loop: print letters from 'A' to ('A' + n - i)
 * - Letters in reverse order
 */
class Pattern15 {
    public static void reverseLetterTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print((char)('A' + j - 1) + " ");
            }
            System.out.println();
        }
    }
    // Pattern15.reverseLetterTriangle(5);
}


// ============================================================================
// PATTERN 16: ALPHA-RAMP PATTERN
// ============================================================================
/*
 * DIAGRAM (n=5):
 * A
 * B B
 * C C C
 * D D D D
 * E E E E E
 * 
 * APPROACH:
 * - Outer loop: for rows
 * - Inner loop: repeat same letter i times
 * - Use (char)('A' + i) for letter
 */
class Pattern16 {
    public static void alphaRamp(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char)('A' + i) + " ");
            }
            System.out.println();
        }
    }
    // Pattern16.alphaRamp(5);
}


// ============================================================================
// PATTERN 17: ALPHA-HILL PATTERN
// ============================================================================
/*
 * DIAGRAM (n=4):
 *    A
 *   ABA
 *  ABCBA
 * ABCDCBA
 * 
 * APPROACH:
 * - Outer loop: for rows
 * - Print spaces: (n - i - 1)
 * - Left side: print A to (i+1)th letter - no spaces
 * - Right side: print from (i-1)th letter to A - no spaces
 */
class Pattern17 {
    public static void alphaHill(int n) {
        for (int i = 0; i < n; i++) {
            // Spaces
            for (int j = 0; j < n - i - 1; j++) System.out.print(" ");
            // Left side
            for (int j = 0; j <= i; j++) System.out.print((char)('A' + j));
            // Right side
            for (int j = i - 1; j >= 0; j--) System.out.print((char)('A' + j));
            System.out.println();
        }
    }
    // Pattern17.alphaHill(4);
}


// ============================================================================
// PATTERN 18: ALPHA-TRIANGLE PATTERN
// ============================================================================
/*
 * DIAGRAM (n=5):
 * A
 * B C D
 * E F G H I
 * J K L M N O P
 * Q R S T U V W X Y
 * 
 * APPROACH:
 * - Use counter to track character
 * - Outer loop: for rows
 * - Inner loop: print (2*i - 1) characters per row
 * - Increment and print character continuously
 */
class Pattern18 {
    public static void alphaTriangle(int n) {
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            // Print 2*i - 1 characters
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
    // Pattern18.alphaTriangle(5);
}


// ============================================================================
// PATTERN 19: SYMMETRIC-VOID PATTERN
// ============================================================================
/*
 * DIAGRAM (n=5):
 * **********
 * ****  ****
 * ***    ***
 * **      **
 * *        *
 * *        *
 * **      **
 * ***    ***
 * ****  ****
 * **********
 * 
 * APPROACH:
 * - Upper half: decreasing stars with increasing space
 * - Lower half: mirror of upper half
 */
class Pattern19 {
    public static void symmetricVoid(int n) {
        // Upper half
        for (int i = 0; i < n; i++) {
            // Left stars
            for (int j = 0; j < n - i; j++) System.out.print("*");
            // Middle spaces
            for (int j = 0; j < 2 * i; j++) System.out.print(" ");
            // Right stars
            for (int j = 0; j < n - i; j++) System.out.print("*");
            System.out.println();
        }
        // Lower half
        for (int i = 1; i <= n; i++) {
            // Left stars
            for (int j = 0; j < i; j++) System.out.print("*");
            // Middle spaces
            for (int j = 0; j < 2 * (n - i); j++) System.out.print(" ");
            // Right stars
            for (int j = 0; j < i; j++) System.out.print("*");
            System.out.println();
        }
    }
    // Pattern19.symmetricVoid(5);
}


// ============================================================================
// PATTERN 20: SYMMETRIC-BUTTERFLY PATTERN
// ============================================================================
/*
 * DIAGRAM (n=5):
 * *         *
 * * *     * *
 * * * * * * *
 * * *     * *
 * *         *
 * 
 * APPROACH:
 * - Upper half: increasing stars, gap in middle, decreasing stars
 * - Middle row: all stars
 * - Lower half: mirror of upper
 */
class Pattern20 {
    public static void symmetricButterfly(int n) {
        for (int i = 1; i <= n; i++) {
            // Left stars
            for (int j = 0; j < i; j++) System.out.print("* ");
            // Middle space
            for (int j = 0; j < 2 * (n - i); j++) System.out.print("  ");
            // Right stars
            for (int j = 0; j < i; j++) System.out.print("* ");
            System.out.println();
        }
        // Lower half (mirror)
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) System.out.print("* ");
            for (int j = 0; j < 2 * (n - i); j++) System.out.print("  ");
            for (int j = 0; j < i; j++) System.out.print("* ");
            System.out.println();
        }
    }
    // Pattern20.symmetricButterfly(5);
}


// ============================================================================
// PATTERN 21: HOLLOW RECTANGLE PATTERN
// ============================================================================
/*
 * DIAGRAM (n=4, m=5):
 * * * * *
 * *     *
 * *     *
 * * * * *
 * 
 * APPROACH:
 * - First row: print all stars
 * - Middle rows: first and last column only
 * - Last row: print all stars
 * - No spaces between stars
 */
class Pattern21 {
    public static void hollowRectangle(int n, int m) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || i == n || j == 1 || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    // Pattern21.hollowRectangle(4, 5);
}


// ============================================================================
// PATTERN 22: THE NUMBER PATTERN
// ============================================================================
/*
 * DIAGRAM (n=4):
 * 4 4 4 4 4 4 4
 * 4 3 3 3 3 3 4
 * 4 3 2 2 2 3 4
 * 4 3 2 1 2 3 4
 * 
 * APPROACH:
 * - Outer loop: for rows (0 to n-1)
 * - Inner loop: for columns
 * - Calculate minimum distance from edges
 * - Print (n - min_distance)
 */
class Pattern22 {
    public static void numberPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                // Calculate distance from all edges
                int top = i;
                int left = j;
                int right = (2 * n - 2) - j;
                int bottom = (n - 1) - i;
                
                // Minimum distance from any edge
                int min = Math.min(Math.min(top, bottom), Math.min(left, right));
                System.out.print((n - min) + " ");
            }
            System.out.println();
        }
    }
    // Pattern22.numberPattern(4);
}


// ============================================================================
// PATTERN 23: HEART PATTERN
// ============================================================================
/*
 * DIAGRAM (n=6):
 *   ***   ***
 * ************
 * ************
 *  **********
 *   ********
 *    ******
 *     ****
 *      **
 * 
 * APPROACH:
 * - Upper curves: two separate sections
 * - Middle: full width
 * - Lower: inverted pyramid
 */
class Pattern23 {
    public static void heartPattern(int n) {
        // Upper part - two curves
        for (int i = n / 2; i <= n; i += 2) {
            // Left spaces
            for (int j = 1; j < n - i; j += 2) System.out.print(" ");
            // Left curve
            for (int j = 1; j <= i; j++) System.out.print("*");
            // Middle spaces
            for (int j = 1; j <= n - i; j++) System.out.print(" ");
            // Right curve
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
        
        // Lower part - inverted pyramid
        for (int i = n; i >= 1; i--) {
            for (int j = i; j < n; j++) System.out.print(" ");
            for (int j = 1; j <= (i * 2) - 1; j++) System.out.print("*");
            System.out.println();
        }
    }
    // Pattern23.heartPattern(6);
}


/*
╔═════════════════════════════════════════════════════════════════════════════╗
║                         PATTERNS QUICK RECAP                               ║
╚═════════════════════════════════════════════════════════════════════════════╝

PATTERN              KEY CONCEPT                            DIFFICULTY
─────────────────────────────────────────────────────────────────────────────
1. Rectangle         Two nested loops (i, j)                Easy
2. Right Triangle    Inner loop: j <= i                     Easy
3. Number Pyramid    Print 1 to i each row                  Easy
4. Number Pyramid II Print i, i times                       Easy
5. Inverted Pyramid  Outer: i from n to 1                   Easy
6. Inverted Numbered Number pyramid reversed                Easy
7. Star Pyramid      Spaces + Triangle                      Medium
8. Inv Star Pyramid  Spaces + Inv Triangle                  Medium
9. Diamond           Pyramid + Inv Pyramid combined         Medium
10. Half Diamond     Triangle + Inv Triangle combined      Medium
11. Binary Triangle  (i+j)%2 logic                          Medium
12. Number Crown     Left side + spaces + right side       Medium
13. Inc Number Tri   Use counter for continuous numbers    Medium
14. Inc Letter Tri   Cast to char: (char)('A' + j)         Medium
15. Reverse Letter   Start from high, go to low            Medium
16. Alpha Ramp       Same letter repeated per row          Easy
17. Alpha Hill       Spaces + increasing + decreasing     Medium
18. Alpha Triangle   Use counter for alphabet progression  Medium
19. Symmetric Void   Hollow triangle pattern               Hard
20. Symmetric Butterfly Left + gap + right pattern        Hard
21. Hollow Rectangle Border only filled                   Medium
22. Number Pattern   1...i...1 pattern each row           Medium
23. Heart            Complex math-based pattern           Hard

╔═════════════════════════════════════════════════════════════════════════════╗
║                      TIPS FOR PATTERN SOLVING                              ║
╚═════════════════════════════════════════════════════════════════════════════╝

1. IDENTIFY THE STRUCTURE:
   - Triangles (increasing/decreasing)
   - Pyramids (centered)
   - Rectangles (hollow/solid)
   - Diamonds (symmetric)

2. COUNT THE LOOPS:
   - Most patterns: 2 loops (rows × columns)
   - Complex: 3+ loops (spaces, symbols, etc)

3. HANDLE SPACES:
   - Leading spaces: usually (n - i) or (n - i - 1)
   - Middle spaces: 2 * (n - i) or similar
   - Check alignment carefully

4. USE CONDITIONS:
   - if (i == 1 || i == n) → First/last row
   - if (j == 1 || j == i) → First/last column
   - if ((i + j) % 2) → Alternating pattern

5. CHARACTER/NUMBER LOGIC:
   - Numbers: Cast to int
   - Characters: Cast to (char)('A' + offset)
   - Use counters for progressive values

6. COMMON PATTERNS:
   - Spaces before content
   - Mirror after middle
   - Increment/Decrement logic
   - Conditional printing

*/
