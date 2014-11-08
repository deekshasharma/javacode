package practice.questions;
import java.util.Scanner;


public class replaceSpaces
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the String");
        String string1 = scan.nextLine();
        replaceSpaces replace = new replaceSpaces();
        System.out.print(replace.replaceSpacesInString(string1));



    }
    private String replaceSpacesInString(String string1)
    {
           String newString = "";
           for(int i = 0; i < string1.length(); i++) {
               newString = string1.replaceAll(" " , "%20");
           }

        return newString;
    }
}
