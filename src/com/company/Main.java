package com.company;

import java.lang.Object;
import java.util.Date;


public class Main {

    static void printTile(Tile tile) {
        System.out.println(tile);
    }

    static void printDate(Date date){
        System.out.println(date);
    }

    public static void main(String[] args) {
        Date birthday = new Date(2002, 6,6);
        Date date2 = new Date(2021, 9, 30);

        Tile tile1 = new Tile(10, 'c');
        printTile(tile1);

        Tile tile2 = new Tile(10, 'c');

        Tile tile3 = new Tile(5, 'z');

        System.out.println("tile1 equals tile 2: " + tile1.equals(tile2));
        System.out.println("tile1 equals tile 3: " + tile1.equals(tile3));

        char letter = tile3.getLetter();
        tile3.setLetter('w');

        printDate(date2);
        printDate(birthday);

    }
}