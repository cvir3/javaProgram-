package org.javaPrograms;

public class SwapWords {

    public static void main(String[] args) {
        String sentence = "Hello World";
        String[] words = sentence.split(" ");

        String temp = words[0];
        words[0] = words[1];
        words[1] = temp;

        /* There are 4 way to execute swap word*/
        /* Swap the words without using a temporary variable */
        //words[0] = words[0] + " " + words[1];
        //words[1] = words[0].substring(0,words[0].length() - words[1].length()-1);
        //words[0] = words[0].substring(words[1].length()+1);

        /* Swap the words using concatenation and substring */
        //words[0] = words[0] + words[1];
        //words[1] = words[0].substring(0,words[0].length() - words[1].length());
        //words[0] = words[0].substring(words[1].length());

        /* Swap the words using inline reassignment */
        //words[0] = words[0] + " " + words[1];
        //words[1] = words[0].substring(0, words[0].indexOf(' '));
        //words[0] = words[0].substring(words[0].indexOf(' ') + 1);

        String swappedSenetence = String.join(" ", words);
        System.out.println(swappedSenetence);

    }
}
