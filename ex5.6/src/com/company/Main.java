/*Modify the previous exercise so that two of the overloaded methods have
two arguments (of two different types), but in reversed order relative to each other. Verify
that this works. */
package com.company;

public class Main {

    public static void main(String[] args) {
        Dog d = new Dog();
        char c = 'c';
        byte b = 0;
        short s = 0;
        d.bark();
        d.bark((char)c);
        d.bark((byte)b);
        d.bark((short)s);
        d.bark(1);
        d.bark(1L);
        d.bark(1.0f);
        d.bark(1.0);
        d.bark(c, 1);
        d.bark(1, c);
    }
}
