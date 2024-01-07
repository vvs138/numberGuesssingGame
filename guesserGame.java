package Assignments.Project;

import java.util.Scanner;

public class guesserGame {
    public static void main(String[] args) {
        System.out.println("******Game start*********");

        
        umpire u = new umpire();
        u.collectGuessNum();
        u.collectPlayerNum();
        u.compare();

        
        
        System.out.println("*********Game over*********");
    }

    
}

class guesser{
    int  guessNum;

    public int guess(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number");
        guessNum= sc.nextInt();

        return guessNum;

    } 
}

class player{
    int player;

    public int play(){
        Scanner sc = new Scanner(System.in);
        // System.out.println("Hey player");
        player=sc.nextInt();
        return player;
    }
}

class umpire{
    int guessNum1;
    int player1;
    int player2;
    int player3;
    public void collectGuessNum(){
       guesser g = new guesser();
       guessNum1=g.guess();
       }

    public void collectPlayerNum(){
        System.out.println("Enter num player 1");
        player p1 = new player();
        player1=p1.play();
       
        System.out.println("Enter num player 2");
        player p2 = new player();
        player2=p2.play();
        
        System.out.println("Enter num player 3");
        player p3 = new player();
        player3=p3.play();
    }

    public void compare(){

        if(guessNum1==player1){
            if((guessNum1==player2)&&(guessNum1==player3)){
                System.out.println("All player won the game");
            }
            else if(guessNum1==player2){
                System.out.println("Player1 and player2 won the game");
            }
            else if(guessNum1==player3){
                System.out.println("Player1 and player3 won the game");
            }
            else{
                System.out.println("Player1 won the game");
            }
        }
        
       else if(guessNum1==player2){
            if(guessNum1==player3){
                System.out.println("Player2 and player3 has won the game");
            }
            else{
                System.out.println("player2 won the game");
            }
        }
       
        else if(guessNum1==player3){
            System.out.println("player3 has won the game");
        }

        else{
            System.out.println("All player loose the game");
        }

    }
    }

