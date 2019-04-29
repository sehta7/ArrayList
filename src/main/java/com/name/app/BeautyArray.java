package com.name.app;

import java.util.Arrays;
import java.util.List;

/**
 * @author Ola Podorska
 */
class BeautyArray {

    public static void main(String[] args) {
        List<String> lookBeautiful = Arrays.asList("jakiz", "piekny", "dzis", "dzionek");
        //List<String> lookBeautiful = List.of("jakiz", "piekny", "dzis", "dzionek");

        StringBuilder builder = new StringBuilder();
        for (String value : lookBeautiful) {
            builder.append(" ");
            builder.append(value);
        }
        System.out.println(builder.toString());
    }
}
