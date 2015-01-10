package Heap;

import java.util.Arrays;

public class HeapSort {

    public static void main(String[] args) {
//        int[] arrayOfNumbers = {-1, 16, 4, 10, 14, 7, 9, 3, 2, 8, 1};
//        int[] arrayOfNumbers = {-1, 21, 4, 10, 14, 22, 9, 3, 2, 23, 1};
        int[] arrayOfNumbers = {-1, 45, 4, 10, 14, 43, 9, 3, 672, 893, 1};

        HeapSort heapSort = new HeapSort();
        heapSort.runHeapSort(arrayOfNumbers);
    }

    /*
    Implementation of Heap Sort
     */
    protected void runHeapSort(int[] unsortedArray)
    {
        int[] heap = constructHeap(unsortedArray);
        int heapSize = heap.length -1 ;
        for(int i = heap.length -1 ; i >= 2; i--)
        {
            int maxElement = heap[1];
            heap[1] = heap[i];
            heap[i] = maxElement;
            heapSize = heapSize -1;
            runHeapify(heap,1,heapSize);
        }
        System.out.println(Arrays.toString(heap));
    }

   /*
   This method constructs a max heap
    */
    protected int[] constructHeap(int[] arrayOfIntegers)
    {
        int heapSize = arrayOfIntegers.length - 1;
        for (int i = (arrayOfIntegers.length/2); i >= 1; i--)
        {
            arrayOfIntegers = runHeapify(arrayOfIntegers,i,heapSize);
            System.out.println(" at i= " + i + ", AI=" + Arrays.toString(arrayOfIntegers));
        }
        return arrayOfIntegers;
    }

    /*
    This method maintains the Max Heap property on a given node.
     */
    protected int[] runHeapify(int[] arrayOfIntegers, int index, int heapSize) {
        int leftChildIndex = (2 * index);
        int rightChildIndex = (2 * index + 1);
        int indexOfLargest;
        if (leftChildIndex <= heapSize && arrayOfIntegers[leftChildIndex] > arrayOfIntegers[index]) {
            indexOfLargest = leftChildIndex;
        } else {
            indexOfLargest = index;
        }
        if (rightChildIndex <= heapSize && arrayOfIntegers[rightChildIndex] > arrayOfIntegers[indexOfLargest]) {
            indexOfLargest = rightChildIndex;
        }
        if (indexOfLargest != index) {
            swap(arrayOfIntegers, index, indexOfLargest);
            runHeapify(arrayOfIntegers, indexOfLargest, heapSize);
        }
        return arrayOfIntegers;
    }

    /*
    This method swap the parent node with the leftChild node
     */
    private void swap(int[] arrayOfIntegers, int i, int largest) {
        int temp = arrayOfIntegers[i];
        arrayOfIntegers[i] = arrayOfIntegers[largest];
        arrayOfIntegers[largest] = temp;
    }
}
