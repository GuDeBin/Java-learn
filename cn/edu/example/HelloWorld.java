package cn.edu.example;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
        // start coding here
        Scanner first = new Scanner(System.in);
        String java = first.next();
        Scanner second = new Scanner(System.in);
        String programming = second.next();
        Scanner third = new Scanner(System.in);
        String language = third.next();
        System.out.println(language);
        System.out.println(programming);
        System.out.println(java);
    }
}