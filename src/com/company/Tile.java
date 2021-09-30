package com.company;

public class Tile {
    private int value;
    private char letter;

    // creating the class Tile.

    Tile(int value, char letter) {
        this.value = value;
        this.letter = letter;
    }
    // creating the constructor method that takes the parameter value and letter.

    public int getValue() {
        return value;
    }
    // using the getValue method to store the value of the value parameter.

    public void getValue(int value) {
        this.value = value;
    }
    // taking the value and store it in this.value

    public char getLetter() {
        return letter;
    }
    // using the getLetter method to declare we have to return letter.

    public void setLetter(char letter) {
        this.letter = letter;
    }
    // here we set the letter to a parameter defined in the main method.

    public String toString() {
        return "Tile: " + value + " Letter: " + letter;
    }
    // Here we use the toString method to make sure we get the value and not the placement in the memory.

    public boolean equals(Tile that) {
        return value == that.value && letter == that.letter;
    }
    // here we defined the equals' method, so we can compare a string with an int.
}
