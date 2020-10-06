package MOOC.Programs.Part1;

import java.util.Scanner;

public class integerinput {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Give a number:");
            int numberOne = Integer.valueOf(scanner.nextLine());
            System.out.println("You gave the number " + numberOne);
            scanner.close();

        }
}
