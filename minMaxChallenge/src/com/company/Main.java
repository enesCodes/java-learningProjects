package com.company;

import com.sun.jdi.IntegerValue;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


       Point firstOne = new Point(5,4);
       Point secondOne = new Point (3,2);

        System.out.println(firstOne.distance());
        System.out.println(secondOne.distance());
        System.out.println(firstOne.distance(secondOne));





    }



}



