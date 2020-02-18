package com.mycompany.app.arraylist;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ArrayListTest {
    private ArrayList array = new ArrayList();;

    @Test
    public void get() {
        array.add(1);
        int result = (Integer) array.get(0);
        assertEquals(1, result);

    }

    @Test
    public void add_addObj_ontObjReturned() {
        array.add(1);
        assertEquals(array.get(0), 1);
    }

    @Test
    public void remove_twoValueRemovedOne_sizeOneReturned() {
        array.add(123);
        array.add(123123);
        array.remove(0);
        int result = array.size();
        assertEquals(1, result);
    }

    @Test
    public void size_fourValues_sizeFourReturned() {
        array.add(123);
        array.add("asdfasdf");
        array.add(123);
        array.add(123123);
        int result = array.size();
        assertEquals(4, result);
    }

}