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

    // Rotated Half Pyramid
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

        sc.close();
    }
}