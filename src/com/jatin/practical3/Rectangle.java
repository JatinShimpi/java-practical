package com.jatin.practical3;

import java.util.*;
public class Rectangle {
    double length,width,area;
    String color;
    Scanner s=new Scanner(System.in);
    void get_length()
    {
        System.out.println("Enter length ");
        length=s.nextDouble();
    }
    void get_width()
    {
        System.out.println("Enter width ");
        width=s.nextDouble();
    }
    double find_area()
    {
        area=length*width;
        return(area);
    }
    String get_colour()
    {
        System.out.println("Enter color ");
        color=s.next();
        return(color);
    }
    public static void main(String[]args)
    {
        Rectangle R1=new Rectangle();
        Rectangle R2=new Rectangle();
        System.out.println("Enter the details for 1st rectangle ");
        R1.get_length();
        R1.get_width();
        String str1=R1.get_colour();
        System.out.println("Enter the details for 2nd rectangle ");
        R2.get_length();
        R2.get_width();
        String str2=R2.get_colour();
        if(R1.find_area()==R2.find_area() && (str1.equals(str2))){
        System.out.println("Matching Rectangle ");
    }
else
        {
            System.out.println("Not matching Rectangles ");

        }
    }
}