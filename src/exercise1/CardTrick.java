package exercise1;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author Amber Do
 * @author Amber Do Feb 1, 2022
 */
import java.util.Random; 
import java.util.Scanner;

public class CardTrick {
    private static final Random randomNumbers = new Random(); 
    
    
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        
        Card card = new Card();

        for (int i = 0; i < hand.length; i++) {
            
            
            //card.setValue(insert call to random number generator here)
            card.setValue((int)Math.random() * 1 + 4) ; 
            card.setSuit(String.valueOf(randomNumbers.nextInt(0,3)));
            //card.setSuit(Card.SUITS(int)(3)); 
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
          
        }
        
        Scanner input = new Scanner(System.in);
        System.out.print("You value: " ); 
        int ask2 = input.nextInt(); 
        
        System.out.println("your suit is: ");
        String ask = input.next();
       
        for (int k = 0; k < hand.length; k++){
            if(ask2 == card.getValue()|| (ask.equals(card.getSuit()))){
                printInfo(); 
            }else{
                System.out.print("Please try again: "); 
            }
        }

        
        }
        
  
    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
        private static void printInfo() {
    
            System.out.println("Congratulations, you guessed right!");
            System.out.println();

            System.out.println("My name is Anh, but you can call me Amber");
            System.out.println();

            System.out.println("My career ambitions: Front end web developer");
            System.out.println("-- I love dancing");
            System.out.println("-- Have a fun semester with friends and making new connections!");
            System.out.println();	

            System.out.println("My hobbies:");
            System.out.println("-- Dancing");
            System.out.println("-- Cooking");
            System.out.println("-- Watching TV");
            System.out.println("-- Practise Coding");

            System.out.println();

    
        }

    } 
