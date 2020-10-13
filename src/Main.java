/* BINARY <--> DECIMAL CONVERTER
by jm babonneau | KEA DAT20v1 | 12 october 2020
Copenhagen, Denmark | www.babonneau.com
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n---------------------------------");
        System.out.println("| BINARY <--> DECIMAL CONVERTER |");
        System.out.println("---------------------------------");
        System.out.println("|        by jm babonneau        |");
        System.out.println("---------------------------------");

        for (int retries = 0; ; retries++) {
            try {
                menu();
            } catch (Exception e) {
                System.err.println("Invalid input. Please, try again!");
                if (retries < 6) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    public static void menu() {
        Scanner menu = new Scanner(System.in);

            System.out.println("\nPlease, choose conversion type:\n(type 1, 2 or 3 + enter)");
            System.out.println(
                            "\n\t(1) Binary  --> Decimal" +
                            "\n\t(2) Decimal --> Binary" +
                            "\n\t(3) Exit");
            int choice = menu.nextInt();

            if (choice == 1 || choice == 2 || choice == 3) {

                switch (choice) {

                    case 1:
                        BinToDec conversion1 = new BinToDec();
                        conversion1.convertBtD();
                        break;

                    case 2:
                        DecToBin conversion2 = new DecToBin();
                        conversion2.convertDtB();
                        break;

                    case 3:
                        System.out.println("Program exited. Good bye!");
                        System.exit(0);
                        break;
                }
            } else {
                System.err.println("You entered a number out of the 1-2-3 range. Please try again!");
                menu();
            }

    }
}
