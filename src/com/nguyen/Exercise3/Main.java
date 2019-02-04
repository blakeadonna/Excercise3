package com.nguyen.Exercise3;
import java.util.Scanner;

public class Main {

    public static int fahTemp (int i){
        int temp = 9/5 * (i -32);
        return temp ;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit");
        int ask = input.nextInt();
        int celTemp = fahTemp(ask);
        System.out.println("The temperature in Celsius is " + celTemp + ".");
    }
}

