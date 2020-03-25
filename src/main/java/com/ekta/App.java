package com.ekta;

/**
 * Hello world!
 *
 */
public class App 
{
    public int modulo(int a, int b){
        return a%b;
    }

    public int hcf(int a, int b){
        if (a % b == 0){
            return b;
        }

        return hcf(b, a%b);
    }
}
