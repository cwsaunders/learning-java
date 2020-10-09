package DerekBanasTut.Programs;

import java.util.*;
import java.util.stream.IntStream;

public class linkedlists {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        LinkedList<Integer> iL1 = new LinkedList<Integer>(); // create integer linkedlist
        iL1.add(1); iL1.add(2); iL1.add(3); // add 1, then 2, then 3
        iL1.addAll(Arrays.asList(1,2,3,4)); // add array to the linkedlist
        iL1.addFirst(0); // Add '0' to beginning of the array
        System.out.println(iL1.contains(4)); // check whether LinkedList contains the value 4
        System.out.println(iL1.indexOf(4)); // retrieve index of the value '4'
        iL1.set(0,2); // replace values
        System.out.println(iL1.get(0)); // get whats in 0 index

    







    }
}
