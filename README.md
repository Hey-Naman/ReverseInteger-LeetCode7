# Reverse Integer LeetCode-7

This Java program allows the user to input an integer and then reverses it. It employs a method called `reverse` to perform the reversal. The program also includes checks for integer overflow and underflow to handle edge cases.

## How to Use

1. **Clone the repository to your local machine:**

    ```bash
    git clone https://github.com/Hey-Naman/ReverseInteger-LeetCode7
    ```

2. **Compile the Java program:**

    ```bash
    javac ReverseInteger.java
    ```

3. **Run the compiled program:**

    ```bash
    java ReverseInteger
    ```

4. **Follow the on-screen instructions to input an integer.**

## Program Overview

The main class, `ReverseInteger`, contains the following key components:

### `main` Method

- Initializes a `Scanner` object for user input.
- Prompts the user to enter an integer.
- Reads the input integer from the user.
- Calls the `reverse` method to reverse the integer.
- Displays the reversed integer.

### `reverse` Method

- Initializes a variable to store the reversed integer.
- Iterates through the digits of the input integer.
- Checks for overflow and underflow conditions.
- Updates the reversed result by multiplying it by 10 and adding the last digit.
- Removes the last digit from the input integer.
- Returns the reversed result.

## Important Notes

- Ensure that Java is installed on your machine.
- Handle potential exceptions, such as invalid input (non-integer input).
- The program includes checks to prevent integer overflow and underflow, ensuring the reliability of the reversal process.

Feel free to explore and modify the code as needed for your use case. If you encounter any issues or have suggestions for improvement, please open an issue or submit a pull request. Happy coding!
