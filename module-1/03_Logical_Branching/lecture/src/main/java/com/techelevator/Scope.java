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
                int result2 = add(100, 100);
                System.out.println(add(1,2));

        }

        public static int add(int a, int b) {
                int c = a + b;
                return c;
        }

}
