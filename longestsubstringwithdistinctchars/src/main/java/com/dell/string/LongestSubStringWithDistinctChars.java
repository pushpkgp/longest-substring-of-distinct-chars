package com.dell.string;

public class LongestSubStringWithDistinctChars {
    private String string;

    public LongestSubStringWithDistinctChars(String string) {
        this.string = string;
    }

    public String longestSubStringWithDistinctChars() {
        int start = 0, end = string.length();
        String subString = "";
        String temp = "";

        while (start < end) {
            if (temp.length() <= subString.length()) {
                temp = subString;
            }

            char ch = string.charAt(start);

            if (!subString.contains(ch + ""))
                subString += ch + "";
            else
                subString = "";

            start++;
        }

        if (temp.length() < subString.length()) {
            return subString;
        } else {
            return temp;
        }
    }
}