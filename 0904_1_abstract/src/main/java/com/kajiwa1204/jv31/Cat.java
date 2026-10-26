package com.kajiwa1204.jv31;

public class Cat extends Animal {
    @Override
    public void naku() {
        System.out.println("meow");
    }

    @Override
    protected void eatImple() {
        System.out.println("パクパク");
    }
}
