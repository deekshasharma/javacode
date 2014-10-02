package Chapter1;

/*
Write code to reverse a C-Style String. (C-String means that “abcd” is represented as
five characters, including the null character.)

 */
public class Question2 {

    public static void main(String[] args)
    {
        System.out.println(reverseString("deeksha"));

    }

    public static String reverseString(String text)
    {
        StringBuffer reversed = new StringBuffer();
        for(int i = text.length() - 1; i >= 0; i--)
        {
            reversed.append(text.charAt(i));
        }
        return reversed.toString();

    }
}
