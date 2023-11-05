package com.wit.market.models;

import java.util.List;
import java.util.Scanner;

public class Market {
    public static String getInput(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    private static boolean checkItemsInList(List<String> marketList, String element) {
        return marketList.contains(element);
    }
    // [melon, cherry, , lemon, PeACh,banana,strawberry , avocado]
    public static void addItems(List<String> marketList) {
        String input = getInput().toLowerCase().trim(); // Bu şekilde tanımlamak En Temizi :)
        System.out.println("Give me your wishes: ");
        if (getInput().contains(",")) {
            String[] elements = getInput().split(",");
            for (String product : elements) {
                if (product != null &&
                        !product.trim().isEmpty() &&
                        !checkItemsInList(marketList, product)) {
                    marketList.add(product.toLowerCase().trim());
                } else {
                    System.out.println("Already Exist!");
                }
            }
        } else {
            if (getInput() != null &&
                    !getInput().trim().isEmpty() &&
                    !checkItemsInList(marketList, getInput())) {
                marketList.add(getInput().toLowerCase().trim());
            }
        }
    }
        public static void removeItems(List<String> marketList) {
            System.out.println("Release your wishes : ");
            if(getInput().contains(",")) {
                String[] elements = getInput().split(",");
                for (String product : elements) {
                    if (product != null &&
                            !product.trim().isEmpty() &&
                            checkItemsInList(marketList,product)) {
                        marketList.remove(product.toLowerCase().trim());
                    } else {
                        System.out.println("Wishes are not Exist!");
                    }
                }
            } else {
                if (getInput() != null &&
                        !getInput().trim().isEmpty() &&
                        checkItemsInList(marketList, getInput())) {
                    marketList.remove(getInput().toLowerCase().trim());
                }
            }
    }

}
