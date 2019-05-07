package com.name.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Ola Podorska
 */
class Sorting {

    public static void main(String[] args) {
        List<String> pets = new ArrayList<>(Arrays.asList("Kot","Pies","Wiewiór", "Lis"));
        Collections.sort(pets);
        System.out.println(pets);

        List<String> things = new ArrayList<>(Arrays.asList("kubek", "motylek", "otrzeźwieć", "abrakadabra", "obezwładnić"));
        things.sort(new CrazyComparator());
        System.out.println(things);
    }
}
