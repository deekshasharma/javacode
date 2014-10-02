package CodeEval;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


/*
https://www.codeeval.com/open_challenges/24/
 */
public class SumOfIntegersFromFile {
    public static void main(String[] args)
    {
        String path = args[0];
//        String path = "/Users/deeksha/IdeaProjects/dailypractice/input.txt";
        String line;
        int sum = 0;
        try
        {
            BufferedReader br = new BufferedReader(new FileReader(path));
            while( (line = br.readLine()) != null)
            {
                    sum += Integer.parseInt(line);
            }
            System.out.println(sum);
        }catch (IOException e)
        {
            System.out.println("Error due to IOException");
        }
    }
}
