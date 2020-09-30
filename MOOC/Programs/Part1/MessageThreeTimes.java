package MOOC.Programs.Part1;

import java.util.Scanner;

public class MessageThreeTimes {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in); // Create scanner tool
            System.out.println("Enter string:"); // Prompt
            String message = scanner.nextLine(); // Ask for input, put in message
            System.out.println("Output:"); // Output statement
            for (int i = 0; i < 3; i++) {
                System.out.println(message); // Print message 3 times (1 per iteration of loop)
              }
            scanner.close();
        }
}
