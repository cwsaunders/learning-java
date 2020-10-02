package MOOC.Programs.Part1;

import java.util.Scanner;

public class conversation {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Greetings! How are you doing?");
            String mood = scanner.nextLine();
            System.out.println("Oh how interesting. Tell me more!");
            String details = scanner.nextLine();
            System.out.println("Thanks for sharing!");
            System.out.println(mood + " " + details);
            scanner.close();
        }
}
