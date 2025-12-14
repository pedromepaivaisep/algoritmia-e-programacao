import java.util.Scanner;

public class QCondominiumV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int entrances = scan.nextInt();
        int floors = scan.nextInt();
        scan.nextLine();
        String[][] apartmentOwners = readEachApartmentOwner(scan, entrances, floors);
        displayOwnerInformations(scan, apartmentOwners);
    }

    public static String[][] readEachApartmentOwner(Scanner scan, int entrances, int floors) {
        String[][] apartmentOwners = new String[entrances][floors];
        for (int i = 0; i < apartmentOwners.length; i++) {
            for (int j = 0; j < apartmentOwners[0].length; j++) {
                apartmentOwners[i][j] = scan.nextLine();
            }
        }
        return apartmentOwners;
    }

    public static void displayOwnerInformations(Scanner scan, String[][] apartmentOwners) {
        String owner = scan.nextLine();
        int counter = 0;
        for (int i = 0; i < apartmentOwners.length; i++) {
            for (int j = 0; j < apartmentOwners[0].length; j++) {
                if (owner.equals(apartmentOwners[i][j])) {
                    System.out.printf("name=%s%n", apartmentOwners[i][j]);
                    System.out.printf("entrance=%d%n", i);
                    System.out.printf("floor=%d%n", j);
                    counter++;
                }
            }
        }
        if(counter == 0) {
            System.out.println("Do not live in the building");
        }
    }
}
