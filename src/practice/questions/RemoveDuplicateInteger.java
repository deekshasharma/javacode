package practice.questions;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: deeksha
 * Date: 1/4/2014
 * Time: 6:56 PM
 * The following program removes the duplicate elements from the list and returns the list with non duplicate values
 * without changing the sequence of the list elements
 */
public class RemoveDuplicateInteger {

    public static void main (String args[])
    {
        RemoveDuplicateInteger duplicateInteger = new RemoveDuplicateInteger();
        System.out.println(duplicateInteger.removeDuplicates());
    }

    private ArrayList<Integer> removeDuplicates()
    {
        ArrayList<Integer> oldList = new ArrayList<Integer>(Arrays.asList(5,3,4,4,5,10,3,10,12,87,0,35));
        ArrayList<Integer> newList = new ArrayList<Integer>();
        for (int i =0 ; i< oldList.size(); i++) {
            if (!(newList.contains(oldList.get(i))))
            {
                newList.add(oldList.get(i));
            }
        }

        return(newList);
    }
}
