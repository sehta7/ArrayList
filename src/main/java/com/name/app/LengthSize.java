package com.name.app;

import java.util.Arrays;
import java.util.List;

/**
 * @author Ola Podorska
 */
class LengthSize {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4};
        List<Integer> list = Arrays.asList(array);
        System.out.println("size: " + list.size());
        System.out.println("length: " + array.length);
    }
}
