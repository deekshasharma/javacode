package CodeEval;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 https://www.codeeval.com/open_challenges/20/
 */

public class Lowercase {

    public static void main(String[] args) {

        String line;
//        String filepath = "/Users/deeksha/IdeaProjects/dailypractice/input.txt";
        String filepath = args[0];

        try
        {
            BufferedReader br = new BufferedReader(new FileReader(filepath));
            while ((line = br.readLine()) != null )
            {
                System.out.println(line.toLowerCase());
            }
        } catch (IOException e)
        {
            System.out.println("Error due to IOException");
        }

    }


}
