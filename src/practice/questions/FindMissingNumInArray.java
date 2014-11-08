package practice.questions;

public class FindMissingNumInArray {

    public static void main(String args[]) {
        findMissing();
    }

    private static void findMissing() {
        int[] arrayOfIntegers = createArray();
        int[] newArrayOfIntegers = deleteOneInteger(arrayOfIntegers);
        for (int i = 0; i < newArrayOfIntegers.length; i++) {
            if (newArrayOfIntegers[i] != i + 1) {
                System.out.println((i + 1) + "is missing");
                break;
            }
        }


    }


    /*   This method creates an array of integers from 1-100  */
    private static int[] createArray() {
        int[] arrayOfIntegers = new int[100];
        for (int i = 0; i < 100; i++) {
            arrayOfIntegers[i] = i + 1;
        }
        return arrayOfIntegers;
    }

    /* This method deletes one of the integers from a given array*/
    private static int[] deleteOneInteger(int[] arrayOfIntegers) {
        arrayOfIntegers[99] = 10;
        return arrayOfIntegers;
    }
}

