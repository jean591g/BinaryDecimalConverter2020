import java.util.Scanner;

public class BinToDec {

    public void convertBtD() {

        Scanner input = new Scanner(System.in);
        System.out.println("\nPlease, enter your binary number:");
        String binNumber = input.nextLine();

        // byte[] bytes = ByteStreams.toByteArray(in);
        char[] chr = binNumber.toCharArray();

        // Check if number is binary
        // First loop through the whole input to check for any illegal entry (i.e. non digits)
        for(char digit : chr){
            if(!Character.isDigit(digit)){ // Catch any non-digit
                System.err.println("Invalid input. Please, try again!"); // Inform user and go back to menu
                convertBtD();
            }
            if(digit!='0' && digit!='1'){ // Check if it's not 1 and not 0
                System.err.println("Your input was not a binary number (only 1's and 0's). Please, try again!"); // Inform user and go back to menu
                convertBtD();
            }
        }

        // System.out.println(chr);
        // System.out.println(chr.length);

        int power = 0;
        int numBit;
        int numTotal = 0;

        for (int i = chr.length -1; i >= 0; i--) {
            int j = Character.getNumericValue(chr[i]);
            numBit = (int)(Math.pow(2, power))*j;
            numTotal = numTotal + numBit;
            power++;
            }

        System.out.println("Your binary number " + new String(chr) + " converted to decimal is: " + numTotal);
        Main.menu();
    }
}
