import java.util.Arrays;
import java.util.Scanner;

public class LNeighbours {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] tempEnteredNumbers = new int[30];
        int arrSize = readNumbersIntoAnArrayAndReturnSize(scan, tempEnteredNumbers);
        int[] enteredNumbers = Arrays.copyOf(tempEnteredNumbers, arrSize);
        displayNumbersThatAreLargerThanItsNeighbours(enteredNumbers);
    }

    public static int readNumbersIntoAnArrayAndReturnSize(Scanner scan, int[] arr) {
        int arrSize = 0;
        int num = scan.nextInt();
        while (num >= 0) {
            arr[arrSize] = num;
            num = scan.nextInt();
            arrSize++;
        }
        return arrSize;
    }

    public static void displayNumbersThatAreLargerThanItsNeighbours(int[] arr) {
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i-1] && arr[i] > arr[i+1]) {
                System.out.println(arr[i]);
            }
        }
    }
}
