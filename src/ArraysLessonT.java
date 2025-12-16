public class ArraysLessonT {
    /*
    Utilizar um array multidimensional para guardar as temperaturas registadas por hora ao longo do dia
    durante os 7 dias da semana.
    Implementar as seguintes funcionalidades usando modularização:

    1. Criar um array de 7 linhas e 24 colunas (para representar os dias da semana e as horas do dia)
    e preencher com valores aleatórios entre [-5; 45[
    2. visualizar o conteúdo do array (em forma de matriz).
    3. obter e visualizar a temperatura media de um dia qualquer, definido pelo utilizador.
    4. obter e visualizar o dia da semana que registou a maior temperatura a uma determinada hora do dia, definida pelo utilizador.
    5. visualizar quantos dias da semana registaram temperaturas negativas.
    ===================================================================
    ###################################################################
    ===================================================================
    Use a multidimensional array to store the temperatures recorded hourly throughout the day for 7 days of the week.

    Implement the following features using modularization:

    1. Create an array of 7 rows and 24 columns (to represent days of the week and times of day)
    and fill it with random values between [-5; 45[
    2. View the contents of the array (in matrix form).
    3. Get and view the average temperature of any given day, defined by the user.
    4. Get and view the day of the week that recorded the highest temperature at a given hour of day, defined by the user.
    5. View how many days of the week had negative temperatures.
    */
    static final int DAYS = 7;
    static final int HOURS = 24;

    public static void main(String[] args) {
        double[][] temperatures = new double[DAYS][HOURS];

        fillWithTemperatures(temperatures);
        displayTemperatures(temperatures);
        int day = 2;
        System.out.printf("Average of day %d = %.1f%n", day, getAverageOfDay(temperatures, day));
        System.out.printf("Average of day %d = %.1f%n", day, getAverageOfDayV2(temperatures[day]));
        int hour = 0;
        System.out.printf("Hottest day at %d o'clock = %d %n", hour, getHottestDayAtHour(temperatures, hour));
        System.out.println("number of days with negatives temperatures=" + getNumberOfDaysWithNegativeTemperatures(temperatures));
        System.out.println("number of days with negatives temperatures=" + getNumberOfDaysWithNegativeTemperaturesV2(temperatures));
    }

    private static int getNumberOfDaysWithNegativeTemperaturesV2(double[][] temperatures) {
        int negatives = 0;
        for (int day = 0; day < temperatures.length; day++) {
            if (hasNegatives(temperatures[day]))
                negatives++;
        }
        return negatives;
    }

    private static boolean hasNegatives(double[] temperatures) {
        for (int hour = 0; hour < temperatures.length; hour++) {
            if (temperatures[hour] < 0)
                return true;
        }
        return false;
    }

    private static int getNumberOfDaysWithNegativeTemperatures(double[][] temperatures) {
        int negatives = 0;
        for (int day = 0; day < temperatures.length; day++) {
            int count = 0;
            for (int hour = 0; hour < temperatures[day].length; hour++) {
                if (temperatures[day][hour] < 0)
                    count++;
            }
            if (count > 0)
                negatives++;
        }
        return negatives;
    }

    private static int getHottestDayAtHour(double[][] temperatures, int hour) {
        double maxTemp = temperatures[0][hour];
        int maxDay = 0;
        for (int day = 0; day < temperatures.length; day++) {
            if (temperatures[day][hour] > maxTemp) {
                maxTemp = temperatures[day][hour];
                maxDay = day;
            }
        }
        return maxDay;
    }

    private static double getAverageOfDayV2(double[] temperatures) {
        double sum = 0;
        for (int hour = 0; hour < temperatures.length; hour++) {
            sum += temperatures[hour];
        }
        return sum / temperatures.length;
    }

    private static double getAverageOfDay(double[][] temperatures, int day) {
        double sum = 0;
        for (int hour = 0; hour < temperatures[day].length; hour++) {
            sum += temperatures[day][hour];
        }
        return sum / temperatures[day].length;
    }

    private static void displayTemperatures(double[][] temperatures) {
        for (int day = 0; day < temperatures.length; day++) {
            for (int hour = 0; hour < temperatures[day].length; hour++) {
                System.out.printf("%6.1f", temperatures[day][hour]);
            }
            System.out.println();
        }
    }

    private static void fillWithTemperatures(double[][] temperatures) {
        for (int day = 0; day < temperatures.length; day++) {
            for (int hour = 0; hour < temperatures[day].length; hour++) {
                temperatures[day][hour] = Math.random() * 50 - 5;
            }
        }
    }
}