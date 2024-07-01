package Medium;

// Reveal Cards In Increasing Order
// https://leetcode.com/problems/reveal-cards-in-increasing-order/

import java.util.Arrays;
import java.util.LinkedList;

public class _950_ {
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