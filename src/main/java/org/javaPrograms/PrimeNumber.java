package org.javaPrograms;

public class PrimeNumber {
    public static void main (String[] args)
    {
        int num = 5;
        int count = 0; // This checks how many factors there are for this particular number

        if(num>1)
        {
            for(int i = 1;i<=num; i++)
            {
                if(num%i ==0)
                    count++;
            }
            if(count==2)
            {
                System.out.println("Prime Number");
            }
            else
            {
                System.out.println("Not Prime Number");
            }
        }
    }
}
