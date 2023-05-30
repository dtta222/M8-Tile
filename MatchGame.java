//*************************************************************************
//M8-MatchGame.java
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

import java.util.Scanner;
public class MatchGame {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //loop game while true
        boolean gameOn = true;

        //loop game
        while (gameOn) {

            ////variables
            String colorText, playAgain, strColor = null;
            int pickNumber, intColor;

            //min max random values for numbers
            int minNumber = 1, maxNumber = 13;

            //min max random values for colors
            int minColor = 1, maxColor = 4;

            //create tile objects 1 - 3
            Tile tile1 = new Tile();
            Tile tile2 = new Tile();
            Tile tile3 = new Tile();


            ////create title #1
            //random number 1 - 13
            pickNumber = (int) Math.floor(Math.random() * (maxNumber - minNumber + 1) + minNumber);
            //random number 1 - 4
            intColor = (int) Math.floor(Math.random() * (maxColor - minColor + 1) + minColor);

            //assign color based on number
            switch (intColor) {
                case 1:
                    strColor = "Red";
                    break;
                case 2:
                    strColor = "Blue";
                    break;
                case 3:
                    strColor = "Yellow";
                    break;
                case 4:
                    strColor = "Green";
                    break;
            }
            //set tile 1 values
            tile1.setColor(strColor);
            tile1.setValue(pickNumber);

            ////create tile #2
            //random number 1 - 13
            pickNumber = (int) Math.floor(Math.random() * (maxNumber - minNumber + 1) + minNumber);
            //random number 1 - 4
            intColor = (int) Math.floor(Math.random() * (maxColor - minColor + 1) + minColor);

            //assign color based on number
            switch (intColor) {
                case 1:
                    strColor = "Red";
                    break;
                case 2:
                    strColor = "Blue";
                    break;
                case 3:
                    strColor = "Yellow";
                    break;
                case 4:
                    strColor = "Green";
                    break;
            }
            //set tile 2 values
            tile2.setColor(strColor);
            tile2.setValue(pickNumber);

            ////create tile #3
            //random number 1 - 13
            pickNumber = (int) Math.floor(Math.random() * (maxNumber - minNumber + 1) + minNumber);
            //random number 1 - 4
            intColor = (int) Math.floor(Math.random() * (maxColor - minColor + 1) + minColor);

            //assign color based on number
            switch (intColor) {
                case 1:
                    strColor = "Red";
                    break;
                case 2:
                    strColor = "Blue";
                    break;
                case 3:
                    strColor = "Yellow";
                    break;
                case 4:
                    strColor = "Green";
                    break;
            }
            //set tile 3 values
            tile3.setColor(strColor);
            tile3.setValue(pickNumber);

            //generate a new third tile if all three are equal
            while (tile1.equals(tile2) && tile2.equals(tile3)) {
                //create new tile #3
                pickNumber = (int) Math.floor(Math.random() * (maxNumber - minNumber + 1) + minNumber);
                intColor = (int) Math.floor(Math.random() * (maxNumber - minNumber + 1) + minNumber);

                switch (intColor) {
                    case 1:
                        strColor = "Red";
                        break;
                    case 2:
                        strColor = "Blue";
                        break;
                    case 3:
                        strColor = "Yellow";
                        break;
                    case 4:
                        strColor = "Green";
                        break;
                }
                tile3.tradeTiles(strColor, pickNumber);
            }
            //display tiles
            System.out.println("\nTile 1:\t\t" + tile1);
            System.out.println("Tile 2:\t\t" + tile2);
            System.out.println("Tile 3:\t\t" + tile3);

            //If all 3 are the same number (color doesn’t matter), tell the player they “WON” the game
            // else display "LOSS"
            if (tile1.getValue() == tile2.getValue() && tile2.getValue() == tile3.getValue()) {
                System.out.println("\nYou Won!");
            } else {
                System.out.println("\nYou Lose.");
            }

            //ask to play again
            System.out.print("\nPlay Again? yes or no?: ");

            //get input
            playAgain = scan.nextLine().toLowerCase();

            //if input is not "yes" turn game off
            if (!playAgain.equals("yes")) {
                gameOn = false;
            }
        }

        System.out.println("\nThanks For Playing! :)\n");
    }
}
