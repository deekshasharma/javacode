package CodeEval;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


/*
https://www.codeeval.com/open_challenges/8/
 */
public class ReverseWords {

    public static void main(String[] args)
    {
        String line;
        String filepath = args[0];

        try
        {
            BufferedReader br = new BufferedReader(new FileReader(filepath));
            while((line = br.readLine()) != null)
            {
                if(line.trim().length() > 0 )
                {
                    String[] words = line.split(" ");
                    displayReverseWords(words);
                }

            }
        }catch (IOException e)
        {
            System.out.println("Error due to IOEXception");
        }

    }

    private static void displayReverseWords(String[] words)
    {
        StringBuilder invertedLine = new StringBuilder();
        for(int i = words.length - 1; i >= 0; i--)
        {
            invertedLine.append(" ").append(words[i]);
        }
        System.out.println(invertedLine);
    }
}
