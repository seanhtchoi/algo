package com.mycompany.app.stringbuilder;

public class StringBuilderSkeleton {
    private static final int BUFFER_MULTIPLIER = 2;
    private static final int DEFAULT_BUFFER_SIZE = 16;

    private char[] str;
    private int size;

    private int charCount;

    public StringBuilderSkeleton() {

    }

    public StringBuilderSkeleton(int size) {

    }

    public StringBuilderSkeleton(char[] str) {

    }

    public StringBuilderSkeleton(String str) {

    }

    public StringBuilderSkeleton append(Object item) {
        return null;
    }

    public StringBuilderSkeleton append(String str) {
        return null;
    }

    public StringBuilderSkeleton append(char[] str) {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }

    private void resizeBuffer() {

    }

    private boolean resizeRequired(char[] newInput) {
        return false;
    }

    private void addString(char[] str) {

    }

    private void updateCount(int charCount) {

    }

}
