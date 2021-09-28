package com.company;
import java.util.Scanner;
import java.util.List;
public class Main {

    public static void main(String[] args) {
    String[] pyramid = {"","","","",""};
    Scanner input = new Scanner(System.in);
    System.out.println("how big would you like the pyramid to be?: ");
    int size = input.nextInt();

    for (int i = 0; i<size; i++) {
        String iString = String.valueOf(i);
        pyramid[i] = iString;
        System.out.println(pyramid[i]);
    }

    System.out.println(size);

    for (int i = size; i<=0; i--) {
        String iString = String.valueOf(i);
        pyramid[i] = iString;
        System.out.println(pyramid[i]);
    }

    }
}


