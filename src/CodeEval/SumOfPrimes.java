package CodeEval;

/*
https://www.codeeval.com/open_challenges/4/
 */

public class SumOfPrimes {

    public static void main(String[] args)
    {
        long number = 3;
        long sum = 2;
        int counter = 1;
        long divisor;

        while(counter < 1000)
        {
            if(number % 2 != 0)
            {
                divisor = 3;
                while (divisor * divisor <= number)
                {
                    if (number % 2 == 0 || number % divisor == 0)
                    {
                        number += 1;
                        divisor = 3;
                    }
                    else
                    {
                        divisor += 2;
                    }
                }
                counter += 1;
                sum += number;
                number += 1;
            }
            else{ number += 1;}
        }
        System.out.println(sum);
    }

}
