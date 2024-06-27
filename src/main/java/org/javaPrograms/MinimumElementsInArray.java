package org.javaPrograms;

public class MinimumElementsInArray {
    public static void main(String[] args) {
        int a[] = {50, 20, 5, 40, 100};
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Minimum Element is array:" + min);
    }
}
