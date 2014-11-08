package CodeEval;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
https://www.codeeval.com/open_challenges/29/
 */
public class Main {

    public static void main(String[] args)
    {
        String line;
        String filepath = "/Users/deeksha/IdeaProjects/dailypractice/input.txt";
//        String filepath = args[0];

        try
        {
            BufferedReader br = new BufferedReader(new FileReader(filepath));
            while((line = br.readLine()) != null)
            {
                if(line.trim().length() > 0)
                {
                    String[] lineArray = line.split(",");
                    List<Integer>  uniqueList = removeDuplicates(lineArray);
                    displayContents(uniqueList);
                }

            }

        }catch (IOException e)
        {
            System.out.println("Error due to IOException");
        }
    }


    /*
    This method returns the list of unique sorted elements
     */
    private static List<Integer> removeDuplicates(String[] lineArray)
    {
        List<Integer> uniqueList = new ArrayList<Integer>();
        for(int i = 0; i < lineArray.length - 1; i++)
        {
             if(!(uniqueList.contains(Integer.parseInt(lineArray[i]))))
             {
                   uniqueList.add(Integer.parseInt(lineArray[i]));
             }
        }
        return uniqueList;
    }

    private static void displayContents(List<Integer> uniqueList)
    {
        StringBuilder display = new StringBuilder();
        for (int eachNumber = 0; eachNumber < uniqueList.size(); eachNumber++)
        {
            if(eachNumber == uniqueList.size() - 1)
            {
                display.append(uniqueList.get(eachNumber));
            } else
            {
                display.append(uniqueList.get(eachNumber)).append(",");
            }
        }
        System.out.println(display);
    }

}
