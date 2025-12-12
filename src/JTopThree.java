import java.util.Scanner;

public class JTopThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] employeeNames = new String[100];
        int[] employeeSalaries = new int[100];
        final int TOP_THREE = 3;
        final int totalEmployees = readEmployeeNamesAndSalariesIntoArrays(sc, employeeNames, employeeSalaries);
        sortEmployeesBySalaryAndName(employeeNames, employeeSalaries, totalEmployees);
        displayMostWellPaidEmployees(employeeNames, employeeSalaries, TOP_THREE, totalEmployees);
    }

    public static int readEmployeeNamesAndSalariesIntoArrays(Scanner sc, String[] employeeNames, int[] employeeSalaries) {
        int totalEmployees = 0;

        String name = sc.nextLine();
        while (!name.equals("END") && totalEmployees < employeeNames.length) {
            employeeNames[totalEmployees] = name;
            employeeSalaries[totalEmployees] = Integer.parseInt(sc.nextLine());
            totalEmployees++;
            name = sc.nextLine();
        }
        return totalEmployees;
    }

    public static void sortEmployeesBySalaryAndName(String[] employeeNames, int[] employeeSalaries, int totalEmployees) {
        for (int i = 0; i < totalEmployees - 1; i++) {
            for (int j = i + 1; j < totalEmployees; j++) {
                if (employeeSalaries[i] < employeeSalaries[j]) {
                    int temp = employeeSalaries[i];
                    String temp2 = employeeNames[i];
                    employeeSalaries[i] = employeeSalaries[j];
                    employeeNames[i] = employeeNames[j];
                    employeeSalaries[j] = temp;
                    employeeNames[j] = temp2;
                }
            }
        }
        for (int i = 0; i < totalEmployees - 1; i++) {
            for (int j = i + 1; j < totalEmployees; j++) {
                if (employeeSalaries[i] == employeeSalaries[j]) {
                    if (employeeNames[i].compareTo(employeeNames[j]) > 0) {
                        int temp = employeeSalaries[i];
                        String temp2 = employeeNames[i];
                        employeeSalaries[i] = employeeSalaries[j];
                        employeeNames[i] = employeeNames[j];
                        employeeSalaries[j] = temp;
                        employeeNames[j] = temp2;
                    }
                }
            }
        }
    }

    public static void displayMostWellPaidEmployees(String[] employeeNames, int[] employeeSalaries, int num, int num2) {
        if (num <= num2) {
            for (int i = 0; i < num; i++) {
                System.out.printf("#%d:%s:%d%n", i + 1, employeeNames[i], employeeSalaries[i]);
            }
        } else {
            for (int i = 0; i < num2; i++) {
                System.out.printf("#%d:%s:%d%n", i + 1, employeeNames[i], employeeSalaries[i]);
            }
        }
    }
}
