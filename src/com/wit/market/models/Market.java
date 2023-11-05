package com.wit.market.models;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Market {
    public static String getInput(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    private static boolean checkItemsInList(List<String> marketList, String element) {
        if (marketList.contains(element)){
        System.out.println("Already Exist!");
        }
        return marketList.contains(element);
    }

    private static boolean checkNull(String control){
        if ( !control.isEmpty()) {
            return true;
        } else {
            System.out.println("It is a null value!");
            return false;
        }
    }

    // [melon, cherry, , lemon, PeACh,banana,strawberry , avocado]
    public static void addItems(List<String> marketList) {
        System.out.println("Give me your wishes: ");
        String input = getInput().toLowerCase().trim(); // Bu şekilde tanımlamak En Temizi :)
        if (input.contains(",")) {
            String[] elements = input.split(",");
            for (String product : elements) {
                if (checkNull(product) &&
                        !checkItemsInList(marketList, product)) {
                    marketList.add(product.toLowerCase().trim());
                }
            }
        } else {
            if (checkNull(input) &&
                    !checkItemsInList(marketList, input)) {
                marketList.add(input);
            }
        }
        productSorted(marketList);
    }
    public static void removeItems(List<String> marketList) {
        System.out.println("Release your wishes : ");
        String input = getInput().toLowerCase().trim(); // Bu şekilde tanımlamak En Temizi :)
        if(input.contains(",")) {
            String[] elements = input.split(",");
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
            if (!input.isEmpty() &&
                    checkItemsInList(marketList, input)) {
                marketList.remove(input);
            }
        }
        productSorted(marketList);
    }

    public static void productSorted (List<String> myList) {
        if (myList.isEmpty()){
            System.out.println("Your cart is Empty!");
        } else{
            Collections.sort(myList);
            System.out.println(myList);
        }
    }
}

/**
 *   public static void productSorted (Collection<String> myList) {
        Collections.sort(myList);
        System.out.println(myList);
    }  => List tipinde beklerken Collection tipinde veremezsin

 *   public static void productSorted (Collection<String> myList) {
        Collections.sort((List)myList);
        System.out.println(myList);
    }  => yazabilirsin. bir yanlışlıkla buraya List dışında bir collection verirsek : ClassCastException hatası alırım. aynı hiyerarik yapıyı List'e çevirmeye çalışıyor çünkü burda(öyle anladım yani)

 */
