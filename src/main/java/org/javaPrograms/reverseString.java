package org.javaPrograms;

public class reverseString {

    public static void main(String[] args) {

        // Using String Buffer Class

        String str = "VIREN";
        StringBuffer sbr = new StringBuffer(str);
        sbr.reverse();
        System.out.println("Revered string is:- " + sbr);

        // Using + (String Concatenation) operator
        /*

        String str = "VIREN";
        String rev = " ";
        int len = str.length();
        for(int i = len - 1
            ; i>0; i--){
            rev = rev +  str.charAt(i);
        }
        System.out.println("Revered string is:- " + rev);
         */

        // Using Character array
        /*
        String str = "VIREN";
        String rev = " ";
        char a[] = str.toCharArray();
        int len = a.length;
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + a[i];
        }
        System.out.println("Revered string is:- " + rev);
         */
    }
}
