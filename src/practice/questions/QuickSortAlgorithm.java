package practice.questions;

import java.util.ArrayList;

public class QuickSortAlgorithm {
    public static void main(String args[]) {
        QuickSortAlgorithm quickSortAlgorithm = new QuickSortAlgorithm();
        int[] arrayOfIntegers = {12, 14, 3, 1, 78, 32, 65};
        quickSortAlgorithm.sortArray(arrayOfIntegers, 0, arrayOfIntegers.length - 1);
    }

    /*
    This method  recursively sorts the array and returns the sorted array of Integers.
     */
    private void sortArray(int[] arrayOfIntegers, int start, int end) {
        start = 0;
        end = arrayOfIntegers.length - 1;
        if (start < end) {
            int midPoint = partitionArray(arrayOfIntegers, start, end);
            sortArray(arrayOfIntegers, start, midPoint - 1);
            sortArray(arrayOfIntegers, midPoint + 1, end);
        }
        System.out.println(arrayOfIntegers);
    }

     /*
    This method partitions the given array and returns the position of the pivot element
     */

    private int partitionArray(int[] arrayOfIntegers, int start, int end) {

        int pointer = start - 1;

        int pivot = arrayOfIntegers[end];
        for (int i = start; i <= end; i++) {
            if (arrayOfIntegers[i] <= pivot) {
                pointer += 1;
                int tempVariable = arrayOfIntegers[pointer];
                arrayOfIntegers[pointer] = arrayOfIntegers[i];
                arrayOfIntegers[i] = tempVariable;
            }
        }
        int tempVariable = arrayOfIntegers[pointer + 1];
        arrayOfIntegers[pointer + 1] = arrayOfIntegers[end];
        //arrayOfIntegers[end] = arrayOfIntegers[tempVariable];
        arrayOfIntegers[end] = arrayOfIntegers[tempVariable];
        return (pointer + 1);
    }


}
