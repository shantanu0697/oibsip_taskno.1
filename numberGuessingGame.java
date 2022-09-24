package com.company;
import java.util.Random;
import java.util.Scanner;

class numGame{
    public int input;
    public int number;
    public int noOfGuesses = 0;

    public int getGuesses() {
        return noOfGuesses;
    }

    public void setGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }


    numGame(){
        Random ran = new Random();
        this.number = ran.nextInt(100);
    }
    void userInput(){
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();

    }

    public void guessingNumber(){
        noOfGuesses++;
        if (input==number){
            System.out.format("You guess the correct number \n");
            switch (noOfGuesses){

                case 1:
                    System.out.println("Your score is 100");
                    break;
                case 2:
                    System.out.println("Your score is 90");
                    break;
                case 3:
                    System.out.println("Your score is 80");
                    break;
                case 4:
                    System.out.println("Your score is 70");
                    break;
                case 5:
                    System.out.println("Your score is 60");
                    break;
                case 6:
                    System.out.println("Your score is 50");
                    break;
                case 7:
                    System.out.println("Your score is 40");
                    break;
                case 8:
                    System.out.println("Your score is 30");
                    break;

                case 9:
                    System.out.println("Your score is 20");
                    break;
                case 10:
                    System.out.println("Your score is 10");
                    break;
            }
        }
        else if(input<number){
            System.out.println("Too low...");
        }
        else if(input>number){
            System.out.println("Too high...");
        }
    }
    }

public class numberGuessingGame {
    public static void main(String[] args) {

        numGame g = new numGame();
        boolean b = false;
        while (!b) {
            g.userInput();
            g.guessingNumber();
        }
    }
}
