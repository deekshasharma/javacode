package Heap;

import java.util.Arrays;

public class BuildMaxHeap {

    protected int[] constructHeap(int[] arrayOfIntegers)
    {
        Heapify heapify = new Heapify();
        int heapSize = arrayOfIntegers.length - 1;
        for (int i = (arrayOfIntegers.length/2); i >= 1; i--)
        {
            arrayOfIntegers = heapify.runHeapify(arrayOfIntegers,i,heapSize);
            System.out.println(" at i= " + i + ", AI=" + Arrays.toString(arrayOfIntegers));
        }
        return arrayOfIntegers;
    }
}
