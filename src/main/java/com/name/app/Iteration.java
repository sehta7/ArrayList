package com.name.app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Ola Podorska
 */
class Iteration {
    public static void main(String[] argv) {

        List<String> toIterate = new ArrayList<>();

        toIterate.add("       **");
        toIterate.add("  *   ****  *");
        toIterate.add("    ********");
        toIterate.add("*  ***********  *");
        toIterate.add("    ********");
        toIterate.add("  *   ****  *");
        toIterate.add("       **");
        //for
        for (int i = 0; i < toIterate.size(); i++) {
            System.out.println(toIterate.get(i));
        }
        //foreach
        for (String temp : toIterate) {
            System.out.println(temp);
        }
        //iterator
        Iterator<String> iterator = toIterate.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        //while
        int i = 0;
        while (i < toIterate.size()) {
            System.out.println(toIterate.get(i));
            i++;
        }
        //lambda
        toIterate.forEach(System.out::println);
    }
}
