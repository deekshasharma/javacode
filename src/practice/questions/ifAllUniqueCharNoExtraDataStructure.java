package practice.questions;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: deeksha
 * Date: 1/25/2014
 * Time: 4:07 PM
 * Implement an algorithm to determine if a string has all unique characters without using
 additional data structures?
 */
public class ifAllUniqueCharNoExtraDataStructure
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the String");
        String string1 = scan.nextLine();

        ifAllUniqueCharNoExtraDataStructure noExtra = new ifAllUniqueCharNoExtraDataStructure();
        if(noExtra.checkUnique(string1))
        {
           System.out.print("All characters in this string are unique");
        }

    }

    // This method returns false if there are duplicate characters in the given string.

    private boolean checkUnique(String string1)
    {
        for(int i = 0; i < string1.length(); i++)
        {
            for (int j = i+1; j < string1.length(); j++)
            {
                //System.out.print(string1.charAt(j)+"j");
                //System.out.print(string1.charAt(i) + "i");
                if (string1.charAt(i) == string1.charAt(j))
                {

                    System.out.print("This string has duplicates");
                    return false;
                }
            }
        }
        return true;

    }
}
