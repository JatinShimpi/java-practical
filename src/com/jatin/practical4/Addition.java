package com.jatin.practical4;

class Addition
{
    double num1, num2, num3;

    Addition(double a, double b, double c)
    {
        num1 = a;
        num2 = b;
        num3 = c;
    }
    Addition(double a, double b)
    {
        num1 = a;
        num2 = b;
    }
    Addition()
    {
        num1=num2=num3 = 0;
    }

    Addition(double value)
    {
        num1=num2=num3= value;
    }

    double add()
    {
        return num1+num2+num3;
    }
    double add(double num1,double num2)
    {
        return num1+num2;
    }
    public static void main(String args[])
    {
        Addition sum1 = new Addition(10,20,50);
        Addition sum2 = new Addition();
        Addition sum3 = new Addition(7);
        Addition sum4 = new Addition(7,101);

        double total;

        total = sum1.add();
        System.out.println(" Addition is : " + total);

        total = sum2.add();
        System.out.println("Addition is : " + total);

        total = sum3.add();
        System.out.println("Addition is : " + total);
        total = sum4.add();
        System.out.println("Addition is : " + total);
    }
}