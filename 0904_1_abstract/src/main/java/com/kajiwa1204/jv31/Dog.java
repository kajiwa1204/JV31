package com.kajiwa1204.jv31;

public class Dog extends Animal {
    @Override
    public void naku() {
        System.out.println("bow");
    }

    @Override
    protected void eatImple() {
        System.out.println("バクバク");
    }
}
