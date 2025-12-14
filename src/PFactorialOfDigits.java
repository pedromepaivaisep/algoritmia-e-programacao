import java.util.Scanner;

public class PFactorialOfDigits {

    private static final int[] FACTORIALS = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        final int X = scan.nextInt();
        scan.close();

        int result = countFactorialsGreaterThanX(N, X);
        System.out.println(result);
    }

    public static int sumOfDigitFactorials(int K) {
        int sum = 0;
        int temp = K;

        while (temp > 0) {
            int digit = temp % 10;
            sum += FACTORIALS[digit];
            temp /= 10;
        }

        if (K == 0) {
            return FACTORIALS[0];
        }

        return sum;
    }

    public static int countFactorialsGreaterThanX(int N, int X) {
        int count = 0;

        for (int i = 0; i <= N; i++) {
            int sum = sumOfDigitFactorials(i); // Calcula a soma dos fatoriais dos dígitos de i

            if (sum > X) {
                count++;
            }
        }

        return count;
    }
}
