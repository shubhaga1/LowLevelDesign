package com.shubhaga.algo.arrays;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String originalString = "hello";
        char[] ans = new char[originalString.length()];
        int j = 0;
        for (int i = originalString.length() - 1; i >= 0; i--) {
            ans[j++] = originalString.charAt(i);
        }
        // print array
        System.out.println(Arrays.toString(ans));
    }
}
