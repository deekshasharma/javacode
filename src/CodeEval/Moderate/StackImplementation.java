package CodeEval.Moderate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
https://www.codeeval.com/open_challenges/9/
 */
public class StackImplementation {

    private static List<Integer> stack = new ArrayList<Integer>();

    public static void main(String[] args) {

        String line;
//        String filepath = "/Users/deeksha/IdeaProjects/dailypractice/input.txt";
        String filepath = args[0];
        try {
            BufferedReader br = new BufferedReader(new FileReader(filepath));
            while ((line = br.readLine()) != null) {
                String[] numbers = line.split(" ");
                push(numbers);
                pop();

            }
        } catch (IOException e) {
            System.out.println("Error due to IOException");
        }

    }

    private static void push(String[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            stack.add(Integer.parseInt(numbers[i]));
        }
    }

    private static void pop() {
        StringBuilder display = new StringBuilder();

        if (stack.size() % 2 == 0) {
            for (int i = stack.size() - 1; i >= 0; i--) {
                if ((i % 2) != 0) {
                    display.append(" ").append(stack.get(i));
                    stack.remove(i);
                } else {
                    stack.remove(i);
                }
            }
            System.out.println(display);
        } else {
            for (int j = stack.size() - 1; j >= 0; j--)
            {
                if ((j % 2) == 0) {
                    display.append(" ").append(stack.get(j));
                    stack.remove(j);
                } else {
                    stack.remove(j);
                }
            }
            System.out.println(display);
        }
    }
}
