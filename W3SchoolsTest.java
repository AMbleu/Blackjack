import java.util.Arrays;

public class W3SchoolsTest{
  public static void main(String[] args){
    Money player1 = new Money();
    player1.setBalance(1000);
    player1.loseMoney(562);
    player1.gainMoney(2000);
    System.out.println(player1.currentBalance);
  }

 //Method used to print all the values of an array
 public static void printArray(int[] arrayToPrint){
   for(int i = 0; i < arrayToPrint.length; i++){
     System.out.println(i + ": " + arrayToPrint[i]);
   }
 }
 public static void printArray(int[] arrayToPrint, int[] arrayToPrint2){
   for(int i = 0; i < arrayToPrint.length; i++){
     System.out.println(i + ": " + arrayToPrint[i] + " | " + arrayToPrint2[i]);
   }
 }
 //Method to fill an integer array with random numbers
 public static int[] fillArray(int[] arrayToFill){
   for(int i = 0; i < arrayToFill.length; i++){
     arrayToFill[i] = (int) (Math.random() * 10);
   }
   return arrayToFill;
 }



/*/////////////////////////////////////////////////////////
int[] deck = {
  0,    //Ace of Diamonds
  1,    //Two of Diamonds
  2,    //Three of Diamonds
  3,    //Four of Diamonds
  4,    //Five of Diamonds
  5,    //Six of Diamonds
  6,    //Seven of Diamonds
  7,    //Eight of Diamonds
  8,    //Nine of Diamonds
  9,    //ten of Diamonds
  10,   //Jack of Diamonds
  11,   //Queen of Diamonds
  12,   //King of Diamonds
  100,  //Ace of Clubs
  101,  //Two of Clubs
  102,  //Three of Clubs
  103,  //Four of Clubs
  104,  //Five of Clubs
  105,  //Six of Clubs
  106,  //Seven of Clubs
  107,  //Eight of Clubs
  108,  //Nine of Clubs
  109,  //Ten of Clubs
  110,  //Jack of Clubs
  111,  //Queen of Clubs
  112,  //King of Clubs
  200,  //Ace of Hearts
  201,  //Two of Hearts
  202,  //Three of Hearts
  203,  //Four of Hearts
  204,  //Five of Hearts
  205,  //Six of Hearts
  206,  //Seven of Hearts
  207,  //Eight of Hearts
  208,  //Nine of Hearts
  209,  //Ten of Hearts
  210,  //Jack of Hearts
  211,  //Queen of Hearts
  212,  //King of Hearts
  300,  //Ace of Spades
  301,  //Two of Spades
  302,  //Three of Spades
  303,  //Four of Spades
  304,  //Five of Spades
  305,  //Six of Spades
  306,  //Seven of Spades
  307,  //Eight of Spades
  308,  //Nine of Spades
  309,  //Ten of Spades
  310,  //Jack of Spades
  311,  //Queen of Spades
  312,  //King of Spades
};
int cardNum = 0;
for(int i =0; i < deck.length; i++){
  cardNum = deck[i];
  int cardSuit = (int)(cardNum/100);
  int cardValue = cardNum%100;

 if(cardSuit > 3 || cardValue > 12){
   System.out.println("Invalid Card Inputted");
 }

 char[] suitSymbol = {'♦', '♣', '♥', '♠'};
 char[] cardNumber = {'A', '2', '3', '4', '5', '6', '7', '8', '9', '1', 'J', 'Q', 'K'};

 if(cardValue != 9){
   System.out.println("┌───┐");
   System.out.println("│" + suitSymbol[cardSuit] + "  │");
   System.out.println("│  " + cardNumber[cardValue] + "│");
   System.out.println("└───┘");
 }else{
   System.out.println("┌───┐");
   System.out.println("│" + suitSymbol[cardSuit] + "  │");
   System.out.println("│ " + cardNumber[cardValue] + "0" + "│");
   System.out.println("└───┘");
 }
}
////////////////////////////////////////////////////////////*/


}
