public class Card{

  final int[] deck = {
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

  //Method to shorten the length of an array
  //Returns an array of length minus 1 of inputted array
  /*
  Reduces the length of an array by one.
  Removes the indicated index of the array eg. removeElemet(array, 0) removes the
    first element of the array.
  */
  //////////////////////////////////////////////////////////////////////////////
  public static int[] removeElemet(int[] arrayToShorten, int elementToRemove){
    int[] shortenedArray = new int[arrayToShorten.length - 1];
    for(int i = 0, k = 0; i < arrayToShorten.length; i++){
      if(i == elementToRemove){
        continue;
      }
      shortenedArray[k] = arrayToShorten[i];
      k++;
    }
    return shortenedArray;
  }
  ////////////////////////////////////////////////////////////////////////////////
  //Method to randmize an array(Shuffling)
  //Returns a randmized copy of inputted array
  /*
  Creates an array of the appropriate amount of card
  Generates a random number as an index and places that value from the array into
    a shuffled array
  Then removes the previously chosen card from array so it can not be chosen again
  When the value is passed to it with no arguemnt method shuffles one deck
  */
  //Method to shuffle x number of decks
  ////////////////////////////////////////////////////////////////////////////////
  public int[] shuffleDeck(int numOfDecks){
    Card deckPlaceholder = new Card();
    int[] preShuffled = new int[52 * numOfDecks];
    int[] shuffledDeck = new int[52 * numOfDecks];
    int chosenCard = 0;
    for(int i = 0, k = 0; k < numOfDecks; k++){
      for(int j = 0 ;j < 52; j++){
        preShuffled[i] = deckPlaceholder.deck[j];
        i++;
      }
    }
    for(int i = 0; i< shuffledDeck.length; i++){
      chosenCard = (int) (Math.random() * preShuffled.length);
      shuffledDeck[i] = preShuffled[chosenCard];
      preShuffled = removeElemet(preShuffled, chosenCard);
    }
    return shuffledDeck;
  }

  public int[] shuffleDeck(){
    Card deckPlaceholder = new Card();
    int[] preShuffled = new int[52];
    int[] shuffledDeck = new int[52];
    int chosenCard = 0;
    for(int i = 0; i < 52; i++){
      preShuffled[i] = deckPlaceholder.deck[i];
    }
    for(int i = 0; i< shuffledDeck.length; i++){
      chosenCard = (int) (Math.random() * preShuffled.length);
      shuffledDeck[i] = preShuffled[chosenCard];
      preShuffled = removeElemet(preShuffled, chosenCard);
    }
    return shuffledDeck;
  }
  ////////////////////////////////////////////////////////////////////////////////
  //Method to Display a card
  //Return void
  /*
  *************** Fix so that the amount of cards that can be displayed can be expanded *******************
  Takes in an integer value and dsiplays on command line a ASCII value of a cardNum
  Method is overloaded to be able to diplay two cards
  */
  ////////////////////////////////////////////////////////////////////////////////
  public void displayCard(int cardNum){
    int cardSuit = (int)(cardNum/100);
    int cardValue = cardNum%100;
    char[] suitSymbol = {'♦', '♣', '♥', '♠'};
    char[] cardNumber = {'A', '2', '3', '4', '5', '6', '7', '8', '9', '1', 'J', 'Q', 'K'};
    if(cardSuit > 3 || cardValue > 12){
      System.out.println("Invalid Card Inputted");
    }
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
  public void displayCard(int cardNumA, int cardNumB){
    int cardSuitA = (int)(cardNumA/100);
    int cardValueA = cardNumA%100;
    int cardSuitB = (int)(cardNumB/100);
    int cardValueB = cardNumB%100;
    char[] suitSymbol = {'♦', '♣', '♥', '♠'};
    char[] cardNumber = {'A', '2', '3', '4', '5', '6', '7', '8', '9', '1', 'J', 'Q', 'K'};
    if(cardSuitA > 3 || cardValueA > 12){
      System.out.println("Invalid Card Inputted");
    }
    if((cardValueA != 9) && (cardValueB != 9)){
      System.out.println("┌───┐" + " " +"┌───┐");
      System.out.println("│" + suitSymbol[cardSuitA] + "  │" + " " + "│" + suitSymbol[cardSuitB] + "  │");
      System.out.println("│  " + cardNumber[cardValueA] + "│" + " " + "│  " + cardNumber[cardValueB] + "│");
      System.out.println("└───┘" + " " + "└───┘");
    }else if(cardValueA == 9){
     System.out.println("┌───┐" + " " + "┌───┐");
     System.out.println("│" + suitSymbol[cardSuitA] + "  │" + " " + "│" + suitSymbol[cardSuitB] + "  │");
     System.out.println("│ " + cardNumber[cardValueA] + "0" + "│" + " " + "│  " + cardNumber[cardValueB] + "│");
     System.out.println("└───┘" + " " + "└───┘");
    }else if(cardValueB == 9){
     System.out.println("┌───┐" + " " + "┌───┐");
     System.out.println("│" + suitSymbol[cardSuitA] + "  │" + " " + "│" + suitSymbol[cardSuitB] + "  │");
     System.out.println("│  " + cardNumber[cardValueA] + "│" + " " + "│ " + cardNumber[cardValueB] + "0" + "│");
     System.out.println("└───┘" + " " + "└───┘");
    }else{
      System.out.println("┌───┐" + " " + "┌───┐");
      System.out.println("│" + suitSymbol[cardSuitA] + "  │" + " " + "│" + suitSymbol[cardSuitB] + "  │");
      System.out.println("│ " + cardNumber[cardValueA] + "0" + "│" + " " + "│ " + cardNumber[cardValueB] + "0" + "│");
      System.out.println("└───┘" + " " + "└───┘");
    }
  }
  ////////////////////////////////////////////////////////////////////////////////
  public int cardValue(int card){
    return card%100;
  }
  public String cardSuit(int card){
    int cardSuite = card/100;
    String suit = " ";
    switch(cardSuite){
      case 0:
        suit = "Diamond";
        break;
      case 1:
        suit = "Club";
        break;
      case 2:
        suit = "Heart";
        break;
      case 3:
        suit = "Spade";
        break;
    }
    return suit;
  }

}
