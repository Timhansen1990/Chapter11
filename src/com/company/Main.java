package com.company;

import java.lang.Object;
import java.util.Date;


public class Main {

    static void printTile(Tile tile) {
        System.out.println(tile);
    }
    // creating a method with the Tile parameter there is defined in the Tile.java file, and print the tile parameter.

    static void printDate(Date date){
        System.out.println(date);
    }
    // creating PrintDate method and taking the parameter date and prints the date parameter.

    public static void main(String[] args) {
        Date birthday = new Date(2002, 6,6);
        Date date2 = new Date(2021, 9, 30);
        // defined the birthday and date2 with values.

        Tile tile1 = new Tile(10, 'c');
        printTile(tile1);
        // creating the tile1 and use the parameters required.

        Tile tile2 = new Tile(10, 'c');
        // creating the tile2 and use the parameters required.

        Tile tile3 = new Tile(5, 'z');
        // creating the tile3 and use the parameters required.
        System.out.println("tile1 equals tile 2: " + tile1.equals(tile2));
        System.out.println("tile1 equals tile 3: " + tile1.equals(tile3));
        // printing the boolean expression if tile1 is equal to 2 and if tile1 is equal to 3.
        char letter = tile3.getLetter();
        tile3.setLetter('w');
        // creating the char letter and get and set letter to a value

        printDate(date2);
        printDate(birthday);
        // printing date2 and birthday.
    }
}