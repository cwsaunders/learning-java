package MOOC.Programs.Part1;

import java.util.Scanner;

public class doubleinput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        Double numberOne = Double.valueOf(scanner.nextLine());
        System.out.println("You gave the number " + numberOne);
        scanner.close();

    }
}
