package com.ekta;

/**
 * Hello world!
 *
 */
public class App 
{
    public static int modulo(int a, int b){
        return a%b;
    }

    public static int hcf(int a, int b) {
        if (a % b == 0){
            return b;
        }

        return hcf(b, a%b);
    }

    public static int add(int a, int b) {
        return a+b;
    }
}
