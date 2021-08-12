package com.company.string;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Function Description
 * <p>
 * Complete the isAnagram function in the editor.
 * <p>
 * isAnagram has the following parameters:
 * <p>
 * string a: the first string
 * string b: the second string
 * Returns
 * <p>
 * boolean: If a and b are case-insensitive anagrams, return true. Otherwise, return false.
 * Input Format
 * <p>
 * The first line contains a string a.
 * The second line contains a string b.
 * <p>
 * Constraints
 * <p>
 * 1 <= length(a), length(b), <= 50
 * Strings a and b consist of English alphabetic characters.
 * The comparison should NOT be case sensitive.
 *
 * @author Aram_Davidyan
 */

public class SecondTask {


    public static void anagram() {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first word : ");
        String a = input.nextLine().toUpperCase();
        System.out.println("Please enter the second word : ");
        String b = input.nextLine().toUpperCase();
        char[] array = a.toCharArray();
        char[] array2 = b.toCharArray();

        Arrays.sort(array);
        Arrays.sort(array2);

        System.out.println(Arrays.equals(array,array2));




    }
}
