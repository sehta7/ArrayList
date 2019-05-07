package com.name.app;

import java.util.Comparator;

/**
 * @author Ola Podorska
 */
class CrazyComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String firstWord = (String) o1;
        String secondWord = (String) o2;
        if (firstWord.startsWith("o")){
            return -1;
        } else if(secondWord.startsWith("o")) {
            return 1;
        }
        return 0;
    }
}
