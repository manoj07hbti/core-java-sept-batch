package practice_makes_perfect;

import java.sql.SQLOutput;

public class EvenAndOddUsingArray {
    public static void main(String[] args) {

        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        System.out.println("ODD NUMBERS:");
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {

                 System.out.println(a[i]);}}
        System.out.println("EVEN NUMBERS:");
            for (int i = 0; i < a.length; i++) {
                if (i % 2 != 0) {

                    System.out.println(a[i]);}
                }
            }
        }
