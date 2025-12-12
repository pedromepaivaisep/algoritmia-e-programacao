import java.util.Scanner;

public class KNoRepetitions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        int[] enteredNumbers = new int[N];
        readEnteredNumbers(scan, enteredNumbers);
        int[] arrayWithoutRepeatedNumbers = eliminateRepeatedValuesFromArray(enteredNumbers);
        displayArr(arrayWithoutRepeatedNumbers);
    }

    public static void readEnteredNumbers(Scanner scan, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
    }

    public static int[] eliminateRepeatedValuesFromArray(int[] arr) {
        int currentSize = arr.length;
        for (int i = 0; i < currentSize - 1; i++) {
            for (int j = i+1; j < currentSize; j++) {
                if(arr[i] == arr[j]) {
                    for (int k = j; k < currentSize - 1; k++) {
                        arr[k] = arr[k+1];
                    }
                    currentSize--;
                    j--;
                }
            }
        }
        int[] arrayWithoutRepeatedNumbers = new int[currentSize];
        for (int i = 0; i < currentSize; i++) {
            arrayWithoutRepeatedNumbers[i] = arr[i];
        }
        return arrayWithoutRepeatedNumbers;
    }

    public static void displayArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
