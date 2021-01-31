/**************************************************
Blackjack
Author: Alejandro Martinez
Date Started: January 4, 2021
Date of V1: -- -- ----
Project Number: 0010
Purpose:
The purpose of this code is to emulate the card game blackjac in the command line. The reason I am coding this is because i do not know java and this is a way to learn that is not completely mind numbing.
*****************************************************/


public class Blackjack{


 public void game(){
   boolean gameStarted = true;
   Card cards = new Card();
   MyFunctions func = new MyFunctions();
   int i = 0;
   //Creates and shuffles a new deck for the round
   int[] dealerDeck = new int[156];
   dealerDeck = cards.shuffleDeck(3);
   int currentCard = 0;
   //Stores the cards of each player
   int[] playerCards = new int[21];
   int[] dealerCards = new int[21];
   playerCards = func.resetArray(playerCards);
   dealerCards = func.resetArray(dealerCards);
   //Game Started
   while(gameStarted){
     int currentPlayerCard = 0;
     playerCards[currentPlayerCard] = dealerDeck[currentCard];
     currentCard++;
     currentPlayerCard++;
     playerCards[currentPlayerCard] = dealerDeck[currentCard];
     currentCard++;
     currentPlayerCard++;
     System.out.println(i + " - 1: " + playerCards[0] + " " + " 2: " + playerCards[1]);
     if((func.addArray(playerCards)%100) > 10){
       System.out.println("Player Cards Exceeded 10");
     }



     if(i>10){break;}
     i++;

   }
 }


}
