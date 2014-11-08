package practice.questions;

import java.util.Scanner;
import java.util.HashMap;

public class TwoStringAnagrams
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter String1");
        String string1 = scan.nextLine();
        System.out.print("Enter String2");
        String string2 = scan.nextLine();
        if (string1.length() == string2.length())
        {

            TwoStringAnagrams anagrams = new TwoStringAnagrams();
            if (anagrams.checkIfAnagram(string1,string2))
            {
                System.out.print("The two Strings are anagrams");
            }
            else
            {
                System.out.print("The strings are not anagrams");
            }
        }
        else
        {
            System.out.print("The length of both Strings is different so they are not anagrams");
        }


    }

    /* This method checks if the two strings given by the user are anagrams or they are the permutation of each other.
    * */
    private boolean checkIfAnagram(String string1, String string2)
    {
        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
        int value = 1;

         for(int i = 0; i < string1.length(); i++)
         {
             if (!(map1.containsKey(string1.charAt(i))))
             {
                 map1.put(string1.charAt(i), value);
             }
             else
             {
                 map1.put(string1.charAt(i), map1.get(string1.charAt(i))+1);
             }
         }

        for (int j = 0; j< string2.length(); j++)
        {
            if(map1.containsKey(string2.charAt(j)))
            {
                map1.put(string2.charAt(j), map1.get(string2.charAt(j))-1);
            }
            else
            {
                System.out.print(string2.charAt(j) + " "+  "is a new character" + " ");
                return false;
            }
        }

        for(Integer frequency: map1.values())
        {
            if(frequency < 0 )
            {
                return false;
            }
            else
            {
                return true;
            }
         }
        return true;

    }
}

