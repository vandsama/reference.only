package com.techelevator;

public class Scope {
    public static void main(String[] args) {

        int x = 0;
        System.out.println(x);

        int y = 1;
        int z = 0;
        {
            System.out.println(y);
            System.out.println(x);
            System.out.println(z);
        }

        System.out.println(y);

        int result = add(41, 1);
        int result2 = add(100,100);
        int argA = 1;
        System.out.println(add(argA,2));

        if (false);
            System.out.println("this may run");
            System.out.println("this will always run");

        
    }

    public static int add(int a, int b) {
        int c = a + b;
        return c;
    }

}
