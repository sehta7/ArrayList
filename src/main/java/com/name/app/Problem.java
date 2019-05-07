package com.name.app;

/**
 * @author Ola Podorska
 */
class Problem {

    int howMuch;

    public Problem(int howMuch) {
        this.howMuch = howMuch;
    }

    @Override
    public String toString() {
        return "howMuch=" + howMuch;
    }
}
