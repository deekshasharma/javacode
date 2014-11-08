package practice.questions;

import java.util.HashMap;
import java.util.Scanner;

public class findIfAllUniqueChar {
    public static void main(String args[]) {
        System.out.print("Enter the String");
        Scanner scan = new Scanner(System.in);
        String pattern = scan.nextLine();
        findIfAllUniqueChar unique = new findIfAllUniqueChar();

        if (unique.checkUnique(pattern))

        {
            System.out.print("All characters in the String are unique");
        }


    }
    // This method returns checks if the characters in given String are Unique or not.

    private boolean checkUnique(String pattern) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int value = 1;

        for (int i = 0; i < pattern.length(); i++) {
            char alphabet = pattern.charAt(i);
            if (!(map.containsKey(alphabet))) {
                map.put(alphabet, value);
            } else {
                System.out.print(alphabet + "is duplicate");
                return false;
            }
        }

        return true;

    }
}
