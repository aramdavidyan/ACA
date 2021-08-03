package com.company.string;

import java.util.Scanner;

/**
 * Given two strings of lowercase English letters, A and B, perform the following operations:
 * <p>
 * 1. Sum the lengths of A and B.
 * 2. Determine if A is lexicographically larger than B (i.e.: does  come before  in the dictionary?).
 * 3. Capitalize the first letter in A and B and print them on a single line, separated by a space.
 * <p>
 * The first line contains a string A. The second line contains another string B.
 * The strings are comprised of only lowercase English letters.
 * <p>
 * <p>
 * There are three lines of output:
 * For the first line, sum the lengths of A and B.
 * For the second line, write Yes if A is lexicographically greater than B otherwise print No instead.
 * For the third line, capitalize the first letter in both A and B and print them on a single line,
 * separated by a space.
 *
 * @author Aram_Davidyan
 */

public class FirstTask {

    public static void sumOfLengths() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the words: ");
        String first = sc.nextLine();
        String second = sc.nextLine();

        System.out.println("The sum of lengths: " + (first.length() + second.length()));

        if (first.compareTo(second) < 0) {
            System.out.println(first + " is lexicographically greater than " + second);
        } else {
            System.out.println(second + " is lexicographically greater than " + first);
        }

        first = first.substring(0,1).toUpperCase() + first.substring(1);
        second = second.substring(0,1).toUpperCase() + second.substring(1);

        System.out.println(first + " " + second);


    }

}
