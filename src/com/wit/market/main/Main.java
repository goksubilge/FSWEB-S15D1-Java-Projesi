package com.wit.market.main;

import com.wit.market.models.Market;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> markett = new LinkedList<>();
        enterMarket(markett);
    }

    public static void enterMarket(List<String> shoppingList) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("write a number:");
                int process = scanner.nextInt();
                if (process < 0 || process > 2 ) {
                    System.out.println("process must be between 0-2");
                }
                if (process == 0  ) {
                    System.exit(0);
                }
                if (process == 1 ) {
                    Market.addItems(shoppingList);
                }
                if (process == 2 ) {
                    Market.removeItems(shoppingList);
                }
                } catch (Exception ex) {
                    System.out.println("Invalid process: " + ex.getMessage());
                    break;
                }
        }

    }
}