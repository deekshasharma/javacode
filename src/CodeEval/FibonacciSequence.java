package CodeEval;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/*
https://www.codeeval.com/open_challenges/22/
Change the className to main before submitting
 */

public class FibonacciSequence {

    private static Map<BigInteger, BigInteger> memoize = new HashMap<BigInteger, BigInteger>();

    public static void main(String[] args) {
        String path = args[0];

        String line;
        BigInteger number;
        try
        {

            BufferedReader br = new BufferedReader(new FileReader(path));
            while((line = br.readLine()) != null)
            {
                number = new BigInteger(line);
                System.out.println(fibonacci(number));
            }
            br.close();
        }catch(IOException e)
        {
            System.out.println("Error due to IOException");
        }

    }


    /*
    This method returns the fibonacci for a given number
     */
    private static BigInteger fibonacci(BigInteger number)
    {
        BigInteger fib;
        if(number.compareTo(new BigInteger("0")) == 0 )
        {
            return new BigInteger("0");
        }
        if(memoize.containsKey(number))
        {
            return memoize.get(number);
        }
        if(number.compareTo(new BigInteger("1")) == 0 || (number.compareTo(new BigInteger("2")) == 0))
        {
            return new BigInteger("1");
        }else
        {
              fib =  fibonacci(number.subtract(new BigInteger("1"))).add(fibonacci(number.subtract(new BigInteger("2"))));
              memoize.put(number,fib);
        }
        return fib;
    }
}