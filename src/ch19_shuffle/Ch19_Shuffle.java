
package ch19_shuffle;

import java.util.ArrayList;
import java.util.Random;

/**
 * Project: Shuffle an ArrayList
 * @author Justin Mangan
 * Tasks: Creates and shuffles an ArrayList
 * Date: 26 March 2018
 */
public class Ch19_Shuffle {

    public static void main(String[] args) {
        
        // Creates and initializes ArrayList
        ArrayList<Integer> deck = new ArrayList<>();

        for (int i = 0; i < 52; i++) {
            deck.add(i + 1);
        }
        
        // Method calls
        displayDeck(deck, "Brand New Deck:\n");       
        shuffle(deck);
        displayDeck(deck, "\nDeck Shuffled:\n");
        
    }
    
    // Shuffles the ArrayList using Random()
    public static <E> void shuffle(ArrayList<E> deck) {
        
        Random random = new Random();
        
        for (int i = 0; i < deck.size(); i++) {
            int value = random.nextInt(deck.size());
            E temp = deck.get(value);
            deck.set(value, deck.get(i));
            deck.set(i, temp);
        }
    }
    
    // Prints and formats ArrayList
    public static <E> void displayDeck(ArrayList<E> deck, String msg){
        System.out.println("\n" + msg);
        int i = 0;
        for(E card : deck){
            System.out.print(i > 0 && i % 13 == 0 ? "\n" + card + ", " : card + 
                    (i == 52 ? "" : ", "));
            i++;
        }
        System.out.print("\n");
    }
    
}
