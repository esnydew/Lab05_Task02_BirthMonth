import java.util.Scanner;

/** This is a program that takes input for a user's birth month as an integer. If the integer is within a valid range, it echoes the input. If it is not in range, it outputs an error message.
 */

// Pseudocode begins on next line
/*
class BirthMonth
    main()
        // Declarations
            num birthMonth
        // IPO
        output "Please enter your birth month as a number (1 through 12 inclusive)>> "
        input birthMonth
        if birthMonth <= 12 AND >= 1 then
            output "Your birth month is ", birthMonth, "."
        else
            output "You have entered an invalid month. You must enter an integer in the range 1 to 12."
        endif
    return
endClass
*/

public class BirthMonth {
    static void main() {
        // Declarations
            Scanner input = new Scanner(System.in);
            int birthMonth;
        // IPO
        System.out.print("Please enter your birth month as a number (1 through 12 inclusive)>> ");
        birthMonth = input.nextInt();
        if (birthMonth <= 12 && birthMonth >= 1) {
            System.out.printf("Your birth month is: %d.%n", birthMonth);
        } else {
            System.out.print("You have entered an invalid month. You must enter an integer in the range of 1 to 12.");
        }
    }
}
