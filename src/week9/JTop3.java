package week9;

import java.util.Scanner;

public class JTop3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] employeeNames = new String[100];
        final int TOP_THREE = 3;
        int[] employeeSalaries = new int[100];
        readEmployeeNamesAndSalariesIntoArrays(sc, employeeNames, employeeSalaries);
        sortEmployeesBySalary(employeeNames, employeeSalaries);
        displayMostWellPaidEmployees(employeeNames, employeeSalaries, TOP_THREE);
    }

    public static void readEmployeeNamesAndSalariesIntoArrays(Scanner sc, String[] employeeNames, int[] employeeSalaries) {
        int totalEmployees = 0;
        String name = sc.nextLine();

        while (!name.equals("END")) {
            employeeNames[totalEmployees] = name;
            employeeSalaries[totalEmployees] = Integer.parseInt(sc.nextLine());
            totalEmployees++;
            name = sc.nextLine();
        }
    }

    public static void sortEmployeesBySalary(String[] employeeNames, int[] employeeSalaries) {
        for (int i = 0; i < employeeNames.length - 1; i++) {
            for (int j = i + 1; j < employeeNames.length; j++) {
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
    }

    public static void displayMostWellPaidEmployees(String[] employeeNames, int[] employeeSalaries, int num) {
        for (int i = 0; i < num - 1; i++) {
            for (int j = i + 1; j < num; j++) {
                if (employeeSalaries[i] == employeeSalaries[j]) {
                    employeeNames[i].compareTo(employeeNames[j])
                }
        }
    }
}

