package com.dell.stringtest;

import com.dell.string.LongestSubStringWithDistinctChars;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LongestSubStringWithDistinctCharsTest {
    private String emptyString;
    private String numeralOnlyString;
    private String charsOnlyString;
    private String uniqueCharSequenceString;
    private String nonUniqueCharSequenceString;
    private String allCharsSameString;

    private LongestSubStringWithDistinctChars longestSubStringWithDistinctChars;

    @Before
    public void setUp() {
        this.emptyString = "";
        this.numeralOnlyString = "123";
        this.charsOnlyString = "abc";
        this.uniqueCharSequenceString = "abc123";
        this.nonUniqueCharSequenceString = "abcdeef127890jkl";
        this.allCharsSameString = "aaaaaaaa";
    }

    @Test
    public void testForEmptyString() {
        this.longestSubStringWithDistinctChars = new LongestSubStringWithDistinctChars(this.emptyString);
        String subString = longestSubStringWithDistinctChars.longestSubStringWithDistinctChars();
        Assert.assertTrue(subString.length() == this.emptyString.length());
    }

    @Test
    public void testForNumeralOnlyString() {
        this.longestSubStringWithDistinctChars = new LongestSubStringWithDistinctChars(this.numeralOnlyString);
        String subString = longestSubStringWithDistinctChars.longestSubStringWithDistinctChars();
        Assert.assertTrue(subString.length() == this.numeralOnlyString.length());
    }

    @Test
    public void testForCharsOnlyString() {
        this.longestSubStringWithDistinctChars = new LongestSubStringWithDistinctChars(this.charsOnlyString);
        String subString = longestSubStringWithDistinctChars.longestSubStringWithDistinctChars();
        Assert.assertTrue(subString.length() == this.charsOnlyString.length());
    }

    @Test
    public void testForUniqueCharSequenceString() {
        this.longestSubStringWithDistinctChars = new LongestSubStringWithDistinctChars(this.uniqueCharSequenceString);
        String subString = longestSubStringWithDistinctChars.longestSubStringWithDistinctChars();
        Assert.assertTrue(subString.length() == this.uniqueCharSequenceString.length());
    }


    @Test
    public void testForNonUniqueCharSequenceString() {
        this.longestSubStringWithDistinctChars = new LongestSubStringWithDistinctChars(this.nonUniqueCharSequenceString);
        String subString = longestSubStringWithDistinctChars.longestSubStringWithDistinctChars();
        Assert.assertTrue(subString.length() == "f127890jkl".length());
    }

    @Test
    public void testForAllCharsSameString() {
        this.longestSubStringWithDistinctChars = new LongestSubStringWithDistinctChars(this.allCharsSameString);
        String subString = longestSubStringWithDistinctChars.longestSubStringWithDistinctChars();
        Assert.assertTrue(subString.length() == 1);
    }
}