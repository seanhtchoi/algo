package com.mycompany.app.arraylist;

import java.util.Arrays;

public class ArrayList {
    private Object[] myStore;
    private int actSize = 0;
    float threshold = 0.8f;

    public ArrayList() {
        this.myStore = new Object[10];
    }

    public Object get(int index) {
        if (index < actSize) {
            return myStore[index];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public void add(Object obj) {
        myStore[actSize] = obj;

        if (actSize >= myStore.length * threshold) {
            increaseListSize();
        }

        actSize++;
    }

    public void remove(int index) {
        if (index < actSize) {
            myStore[index] = null;
            int tmp = index + 1;
            while (tmp < actSize) {
                myStore[tmp - 1] = myStore[tmp];
                tmp++;
            }
            actSize--;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public int size() {
        return actSize;
    }

    private void increaseListSize() {
        myStore = Arrays.copyOf(myStore, myStore.length * 2);
    }

}
