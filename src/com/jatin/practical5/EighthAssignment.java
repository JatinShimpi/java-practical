package com.jatin.practical5;

import java.util.Scanner;

class Sort {

    void sortInterger(int a[]) {

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

    }

    void sortString(String str[]) {

        String temp;
        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].compareTo(str[j]) > 0) {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }

            }
        }

    }

}

public class EighthAssignment {

    public static void main(String[] args) {

        Sort obj = new Sort();
        Scanner in = new Scanner(System.in);
        int choice;
        do {
            System.out.println(" 1.Sort Integer\n 2.Sort String");
            System.out.println("Enter the choice");
            int ch = in.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter the size of Array ");
                    int n = in.nextInt();

                    System.out.println("Enter the Numbers :");
                    int arr[] = new int[n];
                    for (int i = 0; i < n; i++)
                        arr[i] = in.nextInt();
                    obj.sortInterger(arr);
                    // Arrays.sort(arr);
                    System.out.println("Sorted Numbers :");

                    for (int i = 0; i < n; i++)
                        System.out.print(arr[i] + " ");
                    break;

                case 2:
                    String names[] = {"ram", "shyam", "seeta", "geeta", "reeta"};
                    obj.sortString(names);
                    for (int i = 0; i < names.length; i++)
                        System.out.print(names[i] + " ");
                    break;

            }
            System.out.println("\nDo U want to continue 1 or 0?");
            choice = in.nextInt();
        } while (choice == 1);
    }
}