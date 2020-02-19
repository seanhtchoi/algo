package com.mycompany.app.stringbuilder;

public class StringBuilder {
    private static final int BUFFER_MULTIPLIER = 2;
    private static final int DEFAULT_BUFFER_SIZE = 16;

    private char[] str;
    private int size;

    private int charCount;

    public StringBuilder() {
        this.size = DEFAULT_BUFFER_SIZE;
        str = new char[this.size];
        charCount = 0;
    }

    public StringBuilder(int size) {
        this.size = size;
        this.str = new char[size];
        charCount = 0;
    }

    public StringBuilder(char[] str) {
        this.size = str.length;
        this.str = str;
        charCount = this.size;
    }

    public StringBuilder(String str) {
        this.size = str.length();
        this.str = str.toCharArray();
        charCount = this.size;
    }

    public StringBuilder append(Object item) {

        return null;
    }

    public StringBuilder append(String str) {
        return null;
    }

    public StringBuilder append(char[] str) {
        while (resizeRequired(str)) {
            resizeBuffer(str);
        }
        // System.arraycopy(src, srcPos, dest, destPos, length);
        System.arraycopy(str, 0, this.str, charCount, str.length);
        updateCount(str.length);

        return this;
    }

    @Override
    public String toString() {
        return String.valueOf(str);
    }

    private void resizeBuffer(String newInput) {

    }

    private void resizeBuffer(char[] newInput) {
        this.size *= BUFFER_MULTIPLIER;
        char[] newStr = new char[this.size];
        System.arraycopy(this.str, 0, newStr, 0, this.charCount);
        this.str = newStr;
    }

    private boolean resizeRequired(String newInput) {
        return false;
    }

    private boolean resizeRequired(char[] newInput) {
        if (this.charCount + newInput.length > this.size) {
            return true;
        }
        return false;
    }

    private void addString(String str) {

    }

    private void addString(char[] str) {

    }

    private void updateCount(int charCount) {
        this.charCount += charCount;
    }

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder(10);
        str.append("helloworld".toCharArray());
        str.append("helloworld".toCharArray());
        str.append("helloworld".toCharArray());
        str.append("hey you".toCharArray());
        str.append("have a good day".toCharArray());
        System.out.println(str);
    }

}
