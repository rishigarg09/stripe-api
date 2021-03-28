package com.MyRestApi.MyRestApi.util;

import java.util.Random;

public class Base62Util {

    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    public static String generateId() {
        String uniqueId = "";
        for (int i = 0; i < 6; i++) {
            Random rand = new Random();
            int index = rand.nextInt(62);
            uniqueId += ALPHABET.charAt(index);
        }
        return uniqueId;
    }

}