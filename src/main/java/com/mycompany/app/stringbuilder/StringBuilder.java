package com.mycompany.app.stringbuilder;

public class StringBuilder {
    private static final int BUFFER_MULTIPLIER = 2;
    private static final int DEFAULT_BUFFER_SIZE = 16;

    public char[] str;
    public int size;

    public int charCount;

    public StringBuilder() {
        this.size = DEFAULT_BUFFER_SIZE;
        this.str = new char[this.size];
        this.charCount = 0;
    }

    public StringBuilder(int size) {
        this.size = size;
        this.str = new char[size];
        this.charCount = 0;
    }

    public StringBuilder(char[] str) {
        this();
        append(str);
    }

    public StringBuilder(String str) {
        this();
        append(str);
    }

    public StringBuilder append(Object item) {
        char[] newStr = item.toString().toCharArray();
        return processAppend(newStr);
    }

    public StringBuilder append(String str) {
        char[] newStr = str.toCharArray();
        return processAppend(newStr);
    }

    public StringBuilder append(char[] str) {
        return processAppend(str);
    }

    private StringBuilder processAppend(char[] newStr) {
        while (resizeRequired(newStr)) {
            resizeBuffer();
        }
        addString(newStr);
        updateCount(newStr.length);
        return this;
    }

    @Override
    public String toString() {
        return String.valueOf(str);
    }

    private void resizeBuffer() {
        this.size *= BUFFER_MULTIPLIER;
        char[] newStr = new char[this.size];
        System.out.println(this.charCount);
        System.arraycopy(this.str, 0, newStr, 0, this.charCount);
        this.str = newStr;
    }

    private boolean resizeRequired(char[] newInput) {
        if (this.charCount + newInput.length > this.size) {
            return true;
        }
        return false;
    }

    private void addString(char[] str) {
        // System.arraycopy(src, srcPos, dest, destPos, length);
        System.arraycopy(str, 0, this.str, this.charCount, str.length);
    }

    private void updateCount(int charCount) {
        this.charCount += charCount;
    }

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("helllloooooo");
        str.append("hellold".toCharArray());
        str.append("heoworld");
        str.append("helloworld");
        str.append("hey you".toCharArray());
        str.append(new Integer(11111));
        System.out.println(str);
    }

}
