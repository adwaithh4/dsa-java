package array;

public class SearchSortedMatrix {

    public static boolean search(int[][] matrix, int target) {

        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {

            if (matrix[row][col] == target) {
                return true;
            }

            else if (target < matrix[row][col]) {
                col--;       // move left
            }

            else {
                row++;       // move down
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[][] matrix = {
            {1, 4, 7, 11},
            {2, 5, 8, 12},
            {3, 6, 9, 16},
            {10, 13, 14, 17}
        };

        int target = 6;

        System.out.println(search(matrix, target));
    }
}
