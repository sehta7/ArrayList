package com.name.app;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ola Podorska
 */
class SubList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        List<Integer> oneElement = list.subList(1, 2);
        System.out.println(oneElement);
        System.out.println(list);

        oneElement.add(6);
        System.out.println(oneElement);
        System.out.println(list);
    }
}
