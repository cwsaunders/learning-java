package DerekBanasTut.Programs;

import java.util.*;
import java.util.stream.IntStream;

public class javatut {
    static Scanner sc = new Scanner(System.in);

    final Double SHORTPI = 3.14159;

    public static void main(String[] args) {
        System.out.println("First line");

        int var1 = 100;
        int v2, v3;
        int[] a1 = new int[10]; // create new array
        a1[0] = 1; // assign 1 to array in [0]
        Arrays.fill(a1,2);
        System.out.println(a1[0]);
        System.out.println(a1.length);
        String[] a2 = {"one", "two"};
        int[] oneTo10 = IntStream.rangeClosed(1,10).toArray();

        for(int x: oneTo10) System.out.println(x);

    }
}
