package com.playtika.gitPractice;

public class Random {
    public static void main(String[] args) {
        int x = 10;
        if(x==0){
            System.out.println("x is zero");
        }else{
            System.out.println("x is not zero");
        }
        for (int y=0;y<10;y++){
            System.out.println(y);
        }


        //random

        double random = Math.random();
        random = random * 50;

        int randomInt = (int) random;
        System.out.println(randomInt);

        for (int v = 100; v<=200; v++){
            System.out.println("value of x is " + v);
        }
        int c = 100;
        while(c<=200){
            System.out.println("value of c is " + c);
            c++;
        }
        int r = 100;
        do {
            System.out.println("value of r is "+ r);
            r++;
        } while (r<=200);

    }
}
