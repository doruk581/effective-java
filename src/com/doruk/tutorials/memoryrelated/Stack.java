package com.doruk.tutorials.memoryrelated;

import java.util.Arrays;
import java.util.EmptyStackException;

/*
* @Author: Doruk Sü
*
* Well known data structure :)
* */
public class Stack {

    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e){
       ensureCapacity();
       elements[size++] = e;
    }

    // Memory leak point, when only size decreased there will be no dereferencing
    public Object pop(){
        if (size == 0)
            throw new EmptyStackException();

        /*
        return elements[--size];
            Instead ..
         */

        Object result = elements[--size];
        elements[size] = null; // Eliminate obsolete reference

        return result;
    }

    private void ensureCapacity(){
        if (elements.length == size)
            elements = Arrays.copyOf(elements,2 * size + 1);
    }
}
