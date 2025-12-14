import java.util.Scanner;

public class OQuadrants {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        int[][] matrix = readMatrix(scan, N);
        displaySumOfEachQuadrant(matrix);
    }

    public static int[][] readMatrix(Scanner scan, int num) {
        int[][] matrix = new int[num][num];
        for (int i = 0; i < num; i = i + 1) {
            for (int j = 0; j < num; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        return matrix;
    }

    public static void displaySumOfEachQuadrant(int[][] matrix) {
        int size = matrix.length;
        int half = size / 2;
        if (size % 2 == 0) {
            int q1 = sumSubMatrix(matrix, 0, half, half, size);
            int q2 = sumSubMatrix(matrix, 0, half, 0, half);
            int q3 = sumSubMatrix(matrix, half, size, 0, half);
            int q4 = sumSubMatrix(matrix, half, size, half, size);
            System.out.printf("[%d][%d]%n", q2, q1);
            System.out.printf("[%d][%d]%n", q3, q4);
        } else {
            int q1 = sumSubMatrix(matrix, 0, half, half+1, size);
            int q2 = sumSubMatrix(matrix, 0, half, 0, half);
            int q3 = sumSubMatrix(matrix, half+1, size, 0, half);
            int q4 = sumSubMatrix(matrix, half+1, size, half+1, size);
            System.out.printf("[%d][%d]%n", q2, q1);
            System.out.printf("[%d][%d]%n", q3, q4);
        }
    }

    private static int sumSubMatrix(int[][] matrix, int rowStart, int rowEnd, int colStart, int colEnd) {
        int sum = 0;
        for (int i = rowStart; i < rowEnd; i++) {
            for (int j = colStart; j < colEnd; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }
}
