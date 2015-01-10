package Heap;

public class Heapify {


    /*
    This method maintains the Max Heap property on a given node.
     */
    protected int[] runHeapify(int[] arrayOfIntegers, int index, int heapSize) {
        int leftChildIndex = (2 * index);         // off by one to support 0 indexing
        int rightChildIndex = (2 * index + 1);    // // off by one to support 0 indexing
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

