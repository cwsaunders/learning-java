package MOOC.Programs.Part1;

import java.util.Scanner;

public class message {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String message = scanner.nextLine();
        System.out.println("Output: " + message);
        scanner.close();
    }
}
