package com.sayhiai.example.javaagent.app;

import java.util.HashMap;

public class MainRun {
    public static void main(String[] args) {
        hello("world");
    }

    private static void hello(String name) {
        System.out.println("hello " + name + new HashMap<>() + new java.lang.String("fixme").replace("i","a"));
    }
}
