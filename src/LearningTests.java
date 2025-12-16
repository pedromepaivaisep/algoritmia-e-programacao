public class LearningTests {
    public static void main(String[] args) {
        int[][] bidimensionalArray = new int[3][];
        bidimensionalArray[0] = new int[2];
        bidimensionalArray[1] = new int[1];
        bidimensionalArray[2] = new int[3];

        for (int i = 0; i < bidimensionalArray.length; i++) {
            for (int j = 0; j < bidimensionalArray[i].length; j++) {
                System.out.print(bidimensionalArray[i][j]);
            }
            System.out.println();
        }
    }
}
