import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an Integer: ");

        // Read the input integer from the user
        int input = scanner.nextInt();

        // Call the reverse method to reverse the integer
        int reversed = reverse(input);

        // Display the reversed integer
        System.out.println("Reversed Integer: " + reversed);
    }
    public static int reverse(int x) {
        // Initialize the variable to store the reversed integer
        int result = 0;

        // Iterate through the digits of the input integer
        while (x != 0) {
            // Extract the last digit of the current value of the input integer
            int lastDigit = x % 10;

            // Check for overflow condition
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && lastDigit > 7)) {
                // If overflow is detected, return 0
                return 0;
            }

            // Check for underflow condition
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && lastDigit < -8)) {
                // If underflow is detected, return 0
                return 0;
            }

            // Update the reversed result by multiplying it by 10 and adding the last digit
            result = result * 10 + lastDigit;

            // Remove the last digit from the input integer
            x /= 10;
        }

        // Return the reversed result
        return result;
    }


}
