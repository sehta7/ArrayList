package com.name.app;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ola Podorska
 */
class Cloning {

    public static void main(String[] args) {
        ArrayList<String> toClone = new ArrayList<>();
        toClone.add("wszystcy");
        Object clone = toClone.clone();
        System.out.println("rodzic: " + toClone);
        System.out.println("klonowanko: " + clone);

        ArrayList<String> cloned = (ArrayList<String>) clone;
        cloned.add("tylko klon");
        toClone.add("tylko oryginał");
        System.out.println("rodzic po zmianie: " + toClone);
        System.out.println("klon po zmianie: " + clone);
        System.out.println("klonowa lista po zmianie: " + cloned);

        List<String> newCloned = new ArrayList<>(cloned);
        System.out.println("w nowej" + newCloned);
        newCloned.add("the end");
        System.out.println("Na koniec:");
        System.out.println("rodzic: " + toClone);
        System.out.println("klon: " + clone);
        System.out.println("lista klon: " + cloned);
        System.out.println("nowa: " + newCloned);

        //rzutowanie, bo metoda clone() zwraca Object
        /*List<String> needCast = new ArrayList<>();
        ((ArrayList<String>) needCast).clone();*/

        //płytkie klonowanie
        /*ArrayList<Problem> problems = new ArrayList<>();
        problems.add(new Problem(1));
        Object isThatProblem = problems.clone();
        System.out.println("Klonowanko:");
        System.out.println(problems);
        System.out.println(isThatProblem);
        problems.add(new Problem(1));
        System.out.println("Dodanie tylko rodzicowi");
        System.out.println(problems);
        System.out.println(isThatProblem);
        Problem what = problems.get(0);
        what.howMuch = 2;
        System.out.println("Zmaiana w rodzicu");
        System.out.println(problems);
        System.out.println(isThatProblem);*/
    }
}
