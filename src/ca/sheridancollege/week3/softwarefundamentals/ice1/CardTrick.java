/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
    NAME - ARPITA
STUDENT ID - 991613160
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Sivagama 
 * 
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
       // Scanner input = new Scanner(System.in);
        for (int i=0; i<magicHand.length; i++)
        {
            Card LuckyCard = new Card();
            LuckyCard.setValue(9);
            LuckyCard.setsuit(Card.SUITS[6]);
            
            Card c = new Card();
            //int z = (int)Math.floor((Math.random()*13)+1);
           
            c.setValue((int)Math.floor((Math.random()*13)+1));
           // c.setSuit(Card.SUITS[3*(int)Math.random()]);
         // c.setValue(c.randomValue());
           // c.setSuit
            
            int y = (int)Math.floor((Math.random()*3)+1);
            c.setSuit(Card.SUITS[y]);
            magicHand[i]=c;
            System.out.println(c.getSuit()+" "+c.getValue());
            
            
            }
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the value of card from 1 to 13");
        int value=input.nextInt();
        System.out.println("Choose your suit Press 1 for hearts, 2 for Diamonds,3 for spades, 4 for clubs");
        String suit = input.next();
        boolean x= false;
        for (Card magicHand1 : magicHand) {
            if (value == magicHand1.getValue() && suit.equals(magicHand1.getSuit())) {
                 x=false;}
                if(true==x)
                    break;
            
        }
        if(x==true)
        {
        System.out.println("Card is not available.");
       }
        else
        {
        System.out.println("Card is matching");
        }
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }    
    }    

