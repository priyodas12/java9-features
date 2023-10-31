package io.priyotech.github;

public class CompactStrings {
    public static void main(String[] args) {
        /**
         * before Java-9: String: UTF-16,2Bytes, to store elements used char array.
         * from Java-9: String: Latin-1 1Byte, to store elements used byte array.
         * */
        /**String underline data structure will be byte array*/
        String a="abc";
        System.out.println(a.getBytes());
        int length = a.getBytes().length;
        System.out.println(length);
        a.charAt(0);
    }
}
