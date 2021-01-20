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


}





/*
public static void shuffle(numOfDecks){
  boolean[] chosenCards = new boolean[52];
  Arrays.fill(chosenCards, false);

  int[] shuffledDeck = new int[52 * numOfDecks];
  Arrays.fill(shuffledDeck, 0);

  while(checker < 52){
    int shuffleCheck = (int)(Math.random() * 52);

    if(chosenCards[i]){
      continue;
    }



  }
}






*/
