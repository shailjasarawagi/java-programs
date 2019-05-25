package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
        System.out.println(" enter the size");
        int size = scanner.nextInt();
        String[] cities = readCities(size);
        printCities(cities);
        printList(cities);



    }

    private static void printList(String[] cities) {
        List<String> list = Arrays.asList(cities);
        System.out.println("array in list:: " +list );
    }

    private static void printCities(String[] cities) {
        for( int i = 0 ; i<cities.length ; i++) {
            if (i > 0) {
                System.out.print(",");
            }
            System.out.print(cities[i]);
        }
            //System.out.println(Arrays.toString(cities));


        }


    private static String[] readCities(int size) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter the name of the cities::");
        String[] cities = new String[size];
        for( int i = 0; i< cities.length; i++){
            System.out.println("cities["+i+"] : :");
            cities[i] = scanner.next();

        }

        return cities;
    }
}
