package com.jatin.practical1;

import java.util.*;
import java.lang.*;

public class Main
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the choice : \n 1.factorial \n 2.prime \n 3.sum avg \n");
        int n=in.nextInt();

        if(n==1){
            System.out.println("Enter the number : ");
            float m=in.nextFloat();
            System.out.println("the factorial of given number is " + factorial(m));
        }
        else if(n==2){
            System.out.println("Enter the number : ");
            float m=in.nextFloat();
            System.out.println("the given number " + (isPrime(m)?"isprime":"is not prime"));
        }
        else if(n==3){
            sumAvg();
        }
    }

    public static int factorial(float n){
        int fact=1;
        for(int i=1;i<=n;i++)
            fact=fact*i;
        System.out.println("Result is :" + fact);

        return fact;
    }

    public static boolean isPrime(float n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void sumAvg(){
        Scanner in = new Scanner(System.in);

        double no,sum =0, avg;
        int n;

        System.out.print("How many numbers you want to enter");
        n = in.nextInt();

        for( int i = 1; i<= n; ++i)
        {
            System.out.print("Enter the No: ");
            no = in.nextDouble();

            sum += no;
        }

        avg = sum/n;

        System.out.println("Avg of " + n + "number is "+ avg);
    }
}