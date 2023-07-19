package io.priyotech.github;

public class CompactStrings {
    public static void main(String[] args) {
        /**String underline data structure will be byte array*/
        String a="abc";
        int length = a.getBytes().length;
        System.out.println(length);
    }
}
