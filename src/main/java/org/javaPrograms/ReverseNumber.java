package org.javaPrograms;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Number:- ");
        int num = sc.nextInt();

        // Logic Using Algorithm
        /*

        int rev = 0;
        while(num!=0)
        {
            rev=rev*10 + num%10;
            num=num /10;
        }

        */

        // Logic Using StringBuffer Class
        
        StringBuffer sb = new StringBuffer(String.valueOf(num));
        StringBuffer rev=sb.reverse();

        // Logic Using StringBuilder Class
        /*

        StringBuilder sbl = new StringBuilder();
        sbl.append(num);
        StringBuilder rev = sbl.reverse();

        */

        System.out.println("Revers Number is: "+ rev);

    }

}
