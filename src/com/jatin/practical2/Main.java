package com.jatin.practical2;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Calculatorclass obj=new Calculatorclass ();
        obj.getFirstNo();
        obj.getSecondNo();
        Scanner in=new Scanner(System.in);
        int choice;
        do{
            System.out.println(" 1.Addition\n 2.Substaction\n 3.Multiplication\n 4.Division\n 5.Factorial");

            System.out.println("Enter the choice ");
            int ch=in.nextInt();
            switch(ch){
                case 1: System.out.println("Result is :" + obj.addition());
                    break;
                case 2: System.out.println("Result is :" + obj.subtract());
                    break;
                case 3: System.out.println("Result is :" + obj.multiply());
                    break;
                case 4: System.out.println("Result is :" + obj.division());
                    break;
                case 5:
                    System.out.println("Result is :" + obj.factorial(5));
                    break;
                default:
            }
            System.out.println("Do U want to continue 1 or 0?");
            choice=in.nextInt();
        }while(choice==1);
    }
}