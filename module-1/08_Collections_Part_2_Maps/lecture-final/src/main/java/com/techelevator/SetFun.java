package com.techelevator;

import java.util.HashSet;
import java.util.Set;

public class SetFun {
    public static void main(String[] args) {

        Set<String> names = new HashSet<>();

        names.add("mike");
        names.add("ray");
        names.add("nick");
        System.out.println("did we add the 2nd 'nick': " + names.add("nick")); ;

        System.out.println(names);

        names.remove("nick");
        System.out.println(names);

        System.out.println("is 'juno' in the set? " + names.contains("juno"));

        Set<String> moreNames = new HashSet<>();
        moreNames.add("mike");
        System.out.println("names equals moreNames? " + names.equals(moreNames));
        moreNames.add("ray");
        System.out.println("names equals moreNames? " + names.equals(moreNames));
        System.out.println("names == moreNames? " + (names == moreNames));

        names.add("MIKE");
        System.out.println(names);
    }
}
