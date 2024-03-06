//Question 948 named Bag of Tokens

import java.util.Arrays;

class BagOfTokens
{
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int left = 0, right = tokens.length - 1, score = 0, maxScore = 0;

        while(left <= right){
            if(tokens[left] <= power){
                power -= tokens[left];
                left++;
                score++;
                maxScore = score > maxScore ? score : maxScore;
            }
            else if(score >= 1){
                power += tokens[right];
                right--;
                score--;
            }
            else{
                break;
            }
        }

        return maxScore;
    }
}