import java.util.Scanner;
import java.util.Arrays;
/**
 * Solution.
 */
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * { Main Method }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input;
        final int thousand = 1000;
        String[] array;
        int i = 0;
        Insertion insertion;
        MergeSort merge;
        while (scan.hasNext()) {
            array = new String[thousand];
            input = scan.nextLine().split(",");
            for (i = 0; i < input.length; i++) {
                array[i] = input[i];
            }
            array = Arrays.copyOf(array, i);
            merge = new MergeSort(array);
            array = merge.mergesort();
            System.out.println(Arrays.toString(array));
            System.out.println();
        }
    }
}
