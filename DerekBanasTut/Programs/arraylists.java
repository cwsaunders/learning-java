package DerekBanasTut.Programs;

import java.util.*;
import java.util.stream.IntStream;

import javax.sound.midi.Soundbank;

public class arraylists {
    public static void main(String[] args) {
        // Array list allows for resizing and easy creation/deletion

        ArrayList<String> aL1 = new ArrayList<String>(20); // Create aL1 string arraylist
        aL1.add("sue"); // Add sue to aL1 ArrayList
        ArrayList<Integer> aL2 = new ArrayList<>(Arrays.asList(1,2,3,4)); // Generate aL2 integer arraylist with 1,2,3, and 4 as values
        for(Integer x: aL2) System.out.println(x); // Enhanced for loop to print all values of aL2
        System.out.println(aL2.get(1)); // print second value of the index
        aL2.set(1,5); // Replace value at 1 index (5)
        aL2.remove(3); // Remove value at 3 index

        // aL3.clear(); // this clears aL2

        Iterator it = aL2.iterator(); // create iterator

        while(it.hasNext()) { // Call for each individual value within array (.hasNext())
            System.out.println(it.next()); // As long as aL2 has a value to output the array will continue to loop

        }

    }
}
