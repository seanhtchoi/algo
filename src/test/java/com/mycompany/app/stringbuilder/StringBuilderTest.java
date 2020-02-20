package com.mycompany.app.stringbuilder;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class StringBuilderTest {
    private StringBuilder sb = null;

    // @BeforeAll
    // public void setUp() {
    // sb = new StringBuilder();
    // }

    @Test
    public void init_defaultInit_zeroCharCountReturned() {
        sb = new StringBuilder();
        assertEquals(0, sb.charCount, "whatda....");
    }

    @Test
    public void init_initWithString_strSizedCharCountReturned() {
        String str = "asdfasdfasf";
        sb = new StringBuilder(str);
        assertEquals(str.length(), sb.charCount, "wut??????????");
    }

    @Test
    public void append_appendTwoStrings_ThreeStringSizedCharCountReturend() {
        String str1 = "asdf";
        String str2 = "qwer";
        String str3 = "zxcv";
        sb = new StringBuilder(str1);
        sb.append(str2);
        sb.append(str3);
        int expected = str1.length() + str2.length() + str3.length();
        assertEquals(expected, sb.charCount, "dude..........@_@");
    }

}