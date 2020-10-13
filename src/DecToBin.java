import java.util.Scanner;

public class DecToBin {

    public void convertDtB() {

        Scanner input = new Scanner(System.in);
        System.out.println("\nPlease, enter your decimal number:");

        // check if number is an integer before next line:
        int decNumberUser;
        String str = "";
        int binNumber;
        int counter = 0;

        if (input.hasNextInt()) {
                int decNumber = input.nextInt();
                decNumberUser = decNumber;
                while (decNumber > 0){
                    binNumber = decNumber%2;
                    decNumber = decNumber/2;
                    str = binNumber + str;
                    counter++;
                }
                System.out.println("Your decimal number " + decNumberUser + " converted to binary is: " + str);
                Main.menu();
        } else {
                System.err.println("Your input was not a decimal number. Please, try again!");
                convertDtB();
               }
    }
}