// Programmer: James Chen & Nam Le
// Date: 10/09/22
// Class: CS 145
// Lab 4 Deck Of Cards
// Purpose: Create BlackJack
// Extra Credit: Switch/Case, User interface thats crash resistant,
//               Enum, 

public class DeckOfCardsTest {
    public static void main (String[] args) {
        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle();
        myDeckOfCards.shuffleStack();
        PlayGame playGame = new PlayGame();
    
        playGame.startGame();
    
    } // End of Main Method
} // end of class