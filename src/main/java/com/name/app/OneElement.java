package com.name.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Ola Podorska
 */
class OneElement {

    public static void main(String[] args) {

        List<Integer> integerSingletonList = Collections.singletonList(5);
        List<String> stringSingletonList = Collections.singletonList("ola");

        //integerSingletonList.add(3);
        //stringSingletonList.add("jest super");

        System.out.println(integerSingletonList);
        System.out.println(stringSingletonList);

        List<Integer> integerModifiableList = new ArrayList<>();
        integerSingletonList.add(7);

        List<Integer> integerUnmodifiableList = Collections.unmodifiableList(integerModifiableList);
        //integerUnmodifiableList.add(13);


    }
}
