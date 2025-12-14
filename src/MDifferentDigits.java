import java.util.Arrays;
import java.util.Scanner;

public class MDifferentDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] tempEnteredNumbers = new int[100];
        int arrSize = readValuesIntoAnArrayAndReturnArrSize(scan, tempEnteredNumbers);
        int[] enteredNumbers = Arrays.copyOf(tempEnteredNumbers, arrSize);
        int[] enteredNumbersDifferentDigitsCounter = calculateHowManyDifferentDigitsMakeEachArrayValue(enteredNumbers);
        displayResult(enteredNumbers, enteredNumbersDifferentDigitsCounter);
    }

    public static int readValuesIntoAnArrayAndReturnArrSize(Scanner scan, int[] arr) {
        int enteredNumber = scan.nextInt();
        int counter = 0;
        while(enteredNumber >= 0) {
            arr[counter] = enteredNumber;
            counter++;
            enteredNumber = scan.nextInt();
        }
        return counter;
    }

    public static int[] calculateHowManyDifferentDigitsMakeEachArrayValue(int[] arr) {
        int[] differentDigits = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            boolean[] seen = new boolean[10];
            int count = 0;
            int number = arr[i];

            if (number == 0) {
                differentDigits[i] = 1;
                continue;
            }

            while (number > 0) {
                int digit = number % 10;
                if (!seen[digit]) {
                    seen[digit] = true;
                    count++;
                }
                number /= 10;
            }

            differentDigits[i] = count;
        }

        return differentDigits;
    }

    public static void displayResult(int[] arr, int[] arr2) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d:%d%n", arr[i],arr2[i]);
        }
    }
}
