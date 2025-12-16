import java.util.Scanner;

public class W5PRepeatedDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        while (number >= 0) {
            displayRepeatedDigits(number);
            number = scan.nextInt();
        }
        scan.close();
    }

    public static void displayRepeatedDigits(int num) {
        int position1 = 1;
        int temp1 = num;

        while (temp1 > 0) {
            int digit1 = temp1 % 10;
            int temp2 = temp1 / 10;
            int position2 = position1 + 1;

            while (temp2 > 0) {
                int digit2 = temp2 % 10;
                if (digit1 == digit2) {
                    System.out.printf("%d : digit (%d) repeated in positions (%d) and (%d)%n", num, digit1, position1, position2);
                    return;
                }

                temp2 /= 10;
                position2++;
            }

            temp1 /= 10;
            position1++;
        }
    }
}
