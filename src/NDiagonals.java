import java.util.Scanner;

public class NDiagonals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        int[][] matrix = readValuesIntoSquareMatrix(scan, N);
        displayMatrixDiagonalsFromRightToLeft(matrix, N);
    }

    public static int[][] readValuesIntoSquareMatrix(Scanner scan, int num) {
        int[][] matrix = new int[num][num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        return matrix;
    }

    public static void displayMatrixDiagonalsFromRightToLeft(int[][] m, int n) {
        for (int col = n - 1; col >= 0; col--) {
            int i = 0;
            int j = col;
            while (i < n && j < n) {
                System.out.printf("[%d]", m[i][j]);
                i++;
                j++;
            }
            System.out.println();
        }

        for (int lin = 1; lin < n; lin++) {
            int i = lin;
            int j = 0;
            while (i < n && j < n) {
                System.out.printf("[%d]", m[i][j]);
                i++;
                j++;
            }
            System.out.println();
        }
    }
}
