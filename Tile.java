//*************************************************************************
//M8-Tile.java
//Date: 03/10/2023
//Author: David Taylor
//Class: CIT 149–19Z1–78178
//Instructor: Krishna Nandanoor
//Purpose: Develop a Java application where you will create a portion of a new child’s game. In this game, each player
//will draw 3 tiles. The first person to draw 3 tiles with matching numbers
//(such as three 7s, or three 10s, etc. ) wins. Our tiles contain 104 tiles numbered from 1 to 13 in four
//different colors (red, green, yellow and blue). There are duplicates (two
//each) of these tiles.
//*************************************************************************
public class Tile {

    //private modifiers
    private String color;
    private int value;

    //default constructor
    Tile() {
        color = "NO COLOR";
        value = 0;
    }

    //constructor with 2 parameters
    Tile(String s, int i) {
        //if valid number
        if (1 <= i && i <= 13) {
            switch (s) {
                //if valid color update color and value variable
                case "Red", "Yellow", "Green", "Blue":
                    color = s;
                    value = i;
                    break;
                //if not valid color do nothing
                default:
                    color = "NO COLOR";
                    value = 0;
                    break;
            }
        }
        //if not valid number do nothing
        else {
            color = "NO COLOR";
            value = 0;
        }
    }

    //Mutator
    public void setColor(String s) {
        switch (s) {
            //if valid color update color variable
            case "Red", "Yellow", "Green", "Blue":
                color = s;
                break;
            //if not valid do nothing
            default:
                break;
        }
    }

    //Mutator
    public void setValue(int i) {
        //if valid number update value variable
        if (1 <= i && i <= 13) {
            value = i;
        }
        //if not valid do nothing
    }

    //Accessor
    public String getColor() {
        //return color of tile
        return this.color;
    }

    //Accessor
    public int getValue() {
        //return value of tile
        return this.value;
    }

    //creates a String and returns the string
    public String toString() {
        return color + " " +value;
    }

    public boolean equals(Tile checkTile){
        if (checkTile == null)
            return false;
        if ((this.color.equals(checkTile.getColor())) && (this.value == checkTile.getValue()))
            return true;
        else
            return false;
    }

    //method which simulates swapping tiles in the game. If the parameters create an invalid tile,
    // do not update the class data. Leave the tile as is
    public void tradeTiles(String s, int i) {
        //if valid number
        if (1 <= i && i <= 13) {
            switch (s) {
                //if valid color
                case "Red", "Yellow", "Green", "Blue":
                    color = s;
                    value = i;
                    break;
                //if not valid do nothing
                default:
                    break;
            }
        }
    }
}