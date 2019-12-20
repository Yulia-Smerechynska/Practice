package com.playtika.gitPractice;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class ObjectMethods{

    public static void main(String[] args) throws CloneNotSupportedException {
        Person1 tom = new Person1("Tom");
        System.out.println(tom.toString());
        System.out.println(tom.hashCode());

        System.out.println(tom.getClass());
        Person1 bob = new Person1("Bob");
        System.out.println(tom.equals(bob));

        Person1 tom2 = new Person1("Tom");
        System.out.println(tom.equals(tom2));

        //Person1 tom3 = tom2.clone();

        Queue<Integer> arr = new LinkedList<Integer>(); ///CTRL+B

    }
}

class Person1 implements Cloneable {

    private String name;

    public Person1(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person " +
                name;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Person1)) return false;
        Person1 person1 = (Person1) o;
        return this.name.equals(person1.name);
    }

    @Override
    public int hashCode() {
        return 10 * name.hashCode() + 20456;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
}


