//Question 1578 named Minimum Time to Make Rope Colorful

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

class MinCostRope
{
   public static int main(String colors, int[] neededTime){
       int sum = 0;
       for(int i=0; i < neededTime.length - 1; i++){
           if(colors.charAt(i) == colors.charAt(i+1)){
               if(neededTime[i] <= neededTime[i+1]){
                   sum += neededTime[i];
               }
               else{
                   sum += neededTime[i+1];
                   neededTime[i+1] = neededTime[i];
               }
           }
       }
       return sum;
   }
}