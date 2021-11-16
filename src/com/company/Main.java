package com.company;

public class Main {

    public static void main(String[] args) {
        //1
        String s1 = "ABC";
        String s2 = "Abc";
        System.out.println(s1.compareTo(s2));

        //2
        char c1 = "\u263B".toCharArray()[0];
        System.out.println(c1);
        char c2 = "\u263A".toCharArray()[0];
        System.out.println(c2);
        char c3 = "\uAF64".toCharArray()[0];
        System.out.println(c3);

        //3
        String newString = "java best language";
        System.out.println(newString.substring(1, newString.length() - 1));
    }
}
