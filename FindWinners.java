//Question 2225 named Find Players With Zero or One Losses

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Collections;

class FindWinners
{
    public static List<List<Integer>> main(int[][] matches){
        HashSet<Integer> winners = new HashSet<Integer>();
        HashMap<Integer, Integer> losers = new HashMap<Integer, Integer>();
        for(int i=0; i<matches.length; i++){
            winners.add(matches[i][0]);
            losers.put(matches[i][1], losers.getOrDefault(matches[i][1], 0)+1);
        }
        winners.removeAll(losers.keySet());
        List<Integer> loser = new ArrayList<Integer>();
        for(Map.Entry<Integer, Integer> i: losers.entrySet()){
            if(i.getValue() == 1){
                loser.add(i.getKey());
            }
        }
        List<Integer> winner = new ArrayList<Integer>(winners);
        Collections.sort(winner);
        Collections.sort(loser);
        List<List<Integer>> result = new ArrayList<>(2);
        result.add(winner);
        result.add(loser);
        return result;
    }
}