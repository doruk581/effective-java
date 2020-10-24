package com.doruk.tutorials.construction.singleton;
/*
*
* Static utility classes and singletons are inappropriate for classes whose behaviour is parameterized
* by underlyig resource
*
* */
public class Singleton {

    public static final Singleton INSTANCE  = new Singleton();

    private Singleton(){

    }

    public static Singleton getInstance(){
        return INSTANCE;
    }
}
