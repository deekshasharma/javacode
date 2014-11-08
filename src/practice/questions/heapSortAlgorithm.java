package practice.questions;

import java.util.Arrays;


public class heapSortAlgorithm {
    public static void main(String args[]) {
        int[] arrayOfNumbers = {16, 4, 10, 14, 7, 9, 3, 2, 8, 1};
        int[] sortedArray = buildMaxHeap(arrayOfNumbers);
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }
    }


    /* This method performs a maxHeapify recursively to maintain max heap property  */
    private static void maxHeapify(int[] arrayOfNumbers, int index) {
        int leftIndex = 2 * index;
        int rightIndex = (2 * index) + 1;
        int largest;
        if (leftIndex <= arrayOfNumbers.length && arrayOfNumbers[leftIndex] > arrayOfNumbers[index]) {
            largest = leftIndex;
        } else {
            largest = index;
        }

        if (rightIndex <= arrayOfNumbers.length && arrayOfNumbers[rightIndex] > arrayOfNumbers[largest]) {
            largest = rightIndex;
        }
        if (largest != index) {
            arrayOfNumbers[index] = arrayOfNumbers[largest];
            arrayOfNumbers[largest] = arrayOfNumbers[index];
        }

        maxHeapify(arrayOfNumbers, largest);
    }

    /* This method builds a heap from a given array */
    private static int[] buildMaxHeap(int[] arrayOfNumbers) {
        int heapSize = arrayOfNumbers.length;
        for (int i = heapSize / 2; i <= 1; i--) {
            maxHeapify(arrayOfNumbers, i);
        }
        return arrayOfNumbers;
    }

    /* This method sorts an array in descending order using heapSort algorithm */
    private static int[] heapSort(int[] arrayOfNumbers) {
        buildMaxHeap(arrayOfNumbers);
        int heapSize = arrayOfNumbers.length;
        for (int i = heapSize; i <= 2; i--) {
            arrayOfNumbers[i] = arrayOfNumbers[1];
            arrayOfNumbers[1] = arrayOfNumbers[i];
            heapSize -= 1;
            maxHeapify(arrayOfNumbers, 1);
        }
        return arrayOfNumbers;
    }


    private static void maxHeapify1(int[] randomArray, int index) {
        int left = 2 * index;
        int right = (2 * index) + 1;
        int largest;
        if (randomArray[left] > randomArray[index] && left <= randomArray.length) {
            largest = left;
        } else {
            largest = index;
        }
        if (randomArray[right] > randomArray[largest] && right <= randomArray.length) {
            largest = right;
        }
        if (largest != index) {
            randomArray[largest] = randomArray[index];
            randomArray[index] = randomArray[largest];
        }
        maxHeapify1(randomArray, largest);

    }


}
