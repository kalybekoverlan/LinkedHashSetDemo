package com.erik;

import java.util.LinkedHashSet;

public class Main {

    public static void main(String[] args) {
        LinkedHashSet<String> names=new LinkedHashSet<String>();
        names.add("Erik");
        names.add("Jack");
        names.add("Alice");
        names.add("Bob");
        System.out.println("LinkedHashSet : "+names);
    }
}
