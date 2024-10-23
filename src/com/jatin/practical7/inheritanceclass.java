package com.jatin.practical7;

import java.util.Scanner;
class Player{
    String name;
    int age;
    String gameName;
    int noOfGamesPlayed;
    String address;
    String type;
    Scanner in=new Scanner(System.in);
    void getDetails(){
        System.out.println("Enter the details Name , Age, Address, Name of Game ,No of Games Played and Type");

        name=in.nextLine();
        age=in.nextInt();
        in.nextLine();
        address=in.nextLine();
        gameName=in.nextLine();
        noOfGamesPlayed=in.nextInt();
        in.nextLine();
        type=in.nextLine();
    }
    void display(){
        System.out.println("Name : "+ name+" Age: " + age+" Game Name: "+ gameName + " Total Matches: "+noOfGamesPlayed + "Address: "+ address+" International or National : "+type );
    }
}

class Cricket_Player extends Player{
    int totalRuns;
    int totalWickets;
    void getDetails(){
        super.getDetails();
        System.out.println("Enter the Total Runs and Wickets: ");

        totalRuns=in.nextInt();
        totalWickets=in.nextInt();
    }
    void display(){
        super.display();
        System.out.println("Total Runs: " +totalRuns +" Total Wickets :"+totalWickets);
    }
}
class FootBall_Player extends Player
{
    int noOfGoals;
    void getDetails(){
        super.getDetails();
        System.out.println("Enter the total no of Goals");

        noOfGoals=in.nextInt();
    }
    void display(){
        super.display();

        System.out.println("Total Goals: " +noOfGoals);
    }
}
class Hockey_Player extends Player
{
    int noOfGoals;
    void getDetails(){
        super.getDetails();
        System.out.println("Enter the total no of Goals");

        noOfGoals=in.nextInt();
    }
    void display(){
        super.display();
        System.out.println("Total Goals: " +noOfGoals);
    }
}
public class inheritanceclass {
    public static void main(String[] args) {
        Cricket_Player cp=new Cricket_Player();
        cp.getDetails();
        cp.display();
        FootBall_Player fp=new FootBall_Player();
        fp.getDetails();
        fp.display();

        Hockey_Player hp=new Hockey_Player();
        hp.getDetails();
        hp.display();
    }
}