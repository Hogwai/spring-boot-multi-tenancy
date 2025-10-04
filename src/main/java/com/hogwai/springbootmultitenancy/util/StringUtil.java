package com.hogwai.springbootmultitenancy.util;

import java.util.Random;

public class StringUtil {
    private static final Random random = new Random();
    public static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final int ALPHABET_LENGTH = ALPHABET.length();

    private StringUtil() {
    }

    public static String generateRandomString() {
        StringBuilder sb = new StringBuilder();
        int length = 7;

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(ALPHABET_LENGTH);
            char randomChar = ALPHABET.charAt(index);
            sb.append(randomChar);
        }
        return sb.toString();
    }
}
