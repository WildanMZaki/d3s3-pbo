import java.util.Scanner;

public class Numbers {
    // -----------------------------------------------------------------
    // Reads in an array of integers, sorts them using insertionSort,
    // then prints them in sorted order.
    // Uses Integer[] instead of int[] so elements implement Comparable.
    // -----------------------------------------------------------------
    public static void main(String[] args) {
        Integer[] intList;
        int size;

        Scanner scan = new Scanner(System.in);

        System.out.print("\nHow many integers do you want to sort? ");
        size = scan.nextInt();
        intList = new Integer[size];

        System.out.println("\nEnter the numbers...");
        for (int i = 0; i < size; i++) {
            intList[i] = scan.nextInt();
        }

        // Changed to insertionSort as requested
        Sorting.insertionSort(intList);

        System.out.println("\nYour numbers in sorted order...");
        for (int i = 0; i < size; i++) {
            System.out.print(intList[i] + " ");
        }
        System.out.println();
    }
}
