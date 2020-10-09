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
        String[] a2 = {"one", "two"}; // String array
        int[] oneTo10 = IntStream.rangeClosed(1,10).toArray(); // Fill oneTo10 with numbers 1-10

        for(int x: oneTo10) System.out.println(x); // Enhanced for loop -- print all values within oneTo10

        System.out.println(Arrays.binarySearch(oneTo10, 9)); // Search for '9' in oneTo10
        

        int a3[][] = new int[2][2]; // Create multi-dimensional array
        String[][] a4 = {{"00","10"},{"01","11"}}; // multi-dimensional string array
        
        System.out.println(a4[1][1]); 

        int a6[] = {1,2,3}; // 1D array assigned 1,2,3
        int a7[] = Arrays.copyOf(a6,3); // Copy a6
        System.out.println(Arrays.equals(a6,a7)); // check equals of a6 && a7
        int a8[] = {3,2,1};
        Arrays.sort(a8); // sort a8
        System.out.println(Arrays.toString(a8)); // typecast a8 to string




    }
}
