package patterns;
import java.util.Scanner;

public class pattern {

    // 1. Inverted Star Pattern
    static void invertedStar(int n) {

        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    // 2. Half Pyramid Pattern
    static void halfPyramid(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    // 3. Half Pyramid using Characters
    static void characterPyramid(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print((char) ('A' + j - 1) + " ");
            }

            System.out.println();
        }
    }

    // 4. Hollow Rectangle
    static void hollowRectangle(int rows, int columns) {

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= columns; j++) {

                if (i == 1 || i == rows ||
                    j == 1 || j == columns) {

                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }

    // 5. Rotated Half Pyramid
static void rotatedHalfPyramid(int n) {
    for (int i = 1; i <= n; i++) {

        // Print spaces
        for (int j = 1; j <= n - i; j++) {
            System.out.print("  ");
        }

        // Print stars
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }

        System.out.println();
      }
    }

    //6. Inverted Half Pyramid with Numbers
    static void invertedNumberPyramid(int n) {
    for (int i = n; i >= 1; i--) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
     }
    }

    // 7. Floyd's Triangle
    static void floydsTriangle(int n) {
    int num = 1;

    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(num + " ");
            num++;
        }
        System.out.println();
      }
    }
    // 8. Zero-One Triangle
    static void zeroOneTriangle(int n) {
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            if ((i + j) % 2 == 0)
                System.out.print("1 ");
            else
                System.out.print("0 ");
        }
        System.out.println();
        }
    }

    //9. Butterfly Pattern
    static void butterflyPattern(int n) {

    // Upper half
    for (int i = 1; i <= n; i++) {

        // Left stars
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }

        // Spaces
        for (int j = 1; j <= 2 * (n - i); j++) {
            System.out.print("  ");
        }

        // Right stars
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }

        System.out.println();
    }

    // Lower half
    for (int i = n; i >= 1; i--) {

        // Left stars
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }

        // Spaces
        for (int j = 1; j <= 2 * (n - i); j++) {
            System.out.print("  ");
        }

        // Right stars
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }

        System.out.println();
        }
    }

    //10. Solid Rhombus
    static void solidRhombus(int n) {
    for (int i = 1; i <= n; i++) {

        // Print spaces
        for (int j = 1; j <= n - i; j++) {
            System.out.print("  ");
        }

        // Print stars
        for (int j = 1; j <= n; j++) {
            System.out.print("* ");
        }

        System.out.println();
      }       
    }
    //11. Hollow Rhombus
    static void hollowRhombus(int n) {
    for (int i = 1; i <= n; i++) {

        // Print spaces
        for (int j = 1; j <= n - i; j++) {
            System.out.print("  ");
        }

        // Print stars and spaces
        for (int j = 1; j <= n; j++) {
            if (i == 1 || i == n || j == 1 || j == n) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }

        System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        System.out.println("\nInverted Star Pattern:");
        invertedStar(n);

        System.out.println("\nHalf Pyramid:");
        halfPyramid(n);

        System.out.println("\nCharacter Half Pyramid:");
        characterPyramid(n);

        System.out.println("\nHollow Rectangle:");
        hollowRectangle(n, n);

        System.out.println("\nRotated Half Pyramid:");
        rotatedHalfPyramid(n);

        System.out.println("\nInverted Half Pyramid with Numbers:");
        invertedNumberPyramid(5);

        System.out.println("\nFloyd's Triangle:");
        floydsTriangle(5);

        System.out.println("\nZero-One Triangle:");
        zeroOneTriangle(5);

        System.out.println("\nButterfly Pattern:");
        butterflyPattern(5);

        System.out.println("\nSolid Rhombus:");
        solidRhombus(5);

        System.out.println("\nHollow Rhombus:");
        hollowRhombus(5);

        
        sc.close();


    }
}