package com.jatin.practical2;

import java.util.Scanner;
class Calculatorclass {
    private double first_no;
    private double second_no;
    public void getFirstNo(){
        System.out.println("Enter the first number ");
        Scanner in=new Scanner(System.in);
        first_no=in.nextDouble();
    }
    public void getSecondNo(){
        System.out.println("Enter the second number ");
        Scanner in=new Scanner(System.in);
        second_no=in.nextDouble();
    }
    public double addition(){
        return(first_no+second_no);
    }
    public double subtract(){
        return(first_no-second_no);
    }
    public double multiply(){
        return(first_no*second_no);
    }
    public double division(){
        return(first_no/second_no);
    }
    public int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++)
        fact=fact*i;
        return fact;
    }
}