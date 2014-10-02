package CodeEval;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
https://www.codeeval.com/open_challenges/21/
 */
public class SumOfDigits {
    public static void main(String[] args)  {
//        String filePath = "/Users/deeksha/IdeaProjects/dailypractice/input.txt";
        String filePath = args[0];

        try {

                BufferedReader br = new BufferedReader(new FileReader(filePath));
                String line;
                while ((line = br.readLine()) != null)
                {
                    int sum = 0;
                    for (int i = 0; i < line.length(); i++)
                    {
                        sum +=  Character.getNumericValue(line.charAt(i));
                    }
                        System.out.println(sum);
                }
                br.close();
        }catch (IOException e)
        {
            System.out.println("Error due to IOException");
        }

    }
}
