/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author --Oluwadamilola Moosun--
 * @studend_id: 991682396
 */
public class CardTrick {
    
    public static void main(String[] args)
           
    {
        



        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {   
            Random rand = new Random();
            Card c = new Card();
            int randomNumber = rand.nextInt(13) + 1;
            int randomNumberSuit = rand.nextInt(3) + 1;
            c.setValue(randomNumber);
            c.setSuit(Card.SUITS[randomNumberSuit]);
            magicHand[i] = c;
            
            

        }
        

        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Card Value");
        int cardValue = input.nextInt();
        
         System.out.println("Enter Card Suit \n 1: Hearts \n 2: Diamonds \n 3: Spades \n 4: Clubs"); 
         int cardSuit = input.nextInt();
         
         
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        
        
    }
    
}
