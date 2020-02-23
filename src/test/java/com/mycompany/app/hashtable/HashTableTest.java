package com.mycompany.app.hashtable;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HashTableTest {

    Map<String, Integer> map = null;

    @BeforeEach
    void setUp() {
        map = new Map<String, Integer>();
    }

    @Test
    void checkEmpty_emptyMap_trueReturned() {
        boolean expected = true;
        boolean actual = map.isEmpty();
        assertEquals(expected, actual, "Yes!!!");
    }

    @Test
    void get_getFromEmptyMap_nullReturned() {
        Integer expected = null;
        Integer actual = map.get("whatapps");
        assertEquals(expected, actual, "what???");
    }

    @Test
    void get_putOneNode_valueReturned() {
        map.add("hello", 123);
        Integer actual = map.get("hello");
        Integer expected = 123;
        assertEquals(expected, actual, "wow");
    }

}