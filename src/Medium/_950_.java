package Medium;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * <a href="https://leetcode.com/problems/reveal-cards-in-increasing-order/">
 * Reveal Cards In Increasing Order</a>
 */
public class _950_ {
    /**
     * Calculates the ordering of the deck that would reveal the cards in increasing order.
     * 
     * @param deck An integer array representing a deck of cards where the i<sup>th</sup> card is deck[i].
     * @return An integer array representing the ordering of the deck that would reveal the cards in increasing order.
     */
    public int[] deckRevealedIncreasing(int[] deck) {
        int[] output = new int[deck.length];
        LinkedList<Integer> index = new LinkedList<Integer>();
        Arrays.sort(deck);

        for(int i=0; i<deck.length; i++){
            index.offer(i);
        }

        int pos = 0;

        for (int j : deck) {
            pos %= index.size();
            output[index.remove(pos++)] = j;
        }

        return output;
    }
}