package Basic_problems;

import java.util.HashSet;

//using hashset example

public class Hashset{
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10); // Duplicate, won't be added

        System.out.println(numbers); // Output: [10, 20]

    }
}
