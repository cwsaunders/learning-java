package MOOC.Programs.Part1;

import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        scanner.close();
        System.out.println("Hi " + name);
    }
}
