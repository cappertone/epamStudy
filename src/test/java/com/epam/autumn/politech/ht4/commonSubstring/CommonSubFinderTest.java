package com.epam.autumn.politech.ht4.commonSubstring;

import org.junit.Test;

import static org.junit.Assert.*;

public class CommonSubFinderTest {
   private CommonSubFinder subFinder = new CommonSubFinder();

    @Test
    public void longestCS_Test_True() {
        String str1 = "wqadaxo";
        String str2 = "aaaadaxr";
        String expected = "adax";
        assertEquals(expected,subFinder.longestCS(str1,str2));
    }
    @Test
    public void longestCS_Test_Empty() {
        String str1 = "";
        String str2 = "aaaadaxr";
        String expected = "";
        assertEquals(expected,subFinder.longestCS(str1,str2));
    }
    @Test
    public void longestCS_Test_One() {
        String str1 = "wqataho";
        String str2 = "aaaadaxr";
        String expected = "";
        assertEquals(expected,subFinder.longestCS(str1,str2));
    }
    @Test
    public void longestCS_Test_null() {
        String str1 = null;
        String str2 = "aaaadaxr";
        String expected = "";
        assertEquals(expected,subFinder.longestCS(str1,str2));
    }
    @Test
    public void longestCS_Test_numbers() {
        String str1 = "246452";
        String str2 = "4582467";
        String expected = "246";
        assertEquals(expected,subFinder.longestCS(str1,str2));
    }
}