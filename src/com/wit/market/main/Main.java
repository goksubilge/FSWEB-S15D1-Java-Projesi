package com.wit.market.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    }

    public static void enterMarket(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("write a number:");
                int process = scanner.nextInt();
                if (process < 0 || process > 2 ) {
                    System.out.println("process must be between 0-2");
                }
                if (process == 0  ) {
                    System.out.println(0);
                }
                if (process == 1 ) {
                    // addItems();
                }
                if (process < 2 ) {
                    //removeItems();
                }
                } catch (Exception ex) {
                    System.out.println("Invalid process: " + ex.getMessage());
                    break;
                }
        }

    }
}