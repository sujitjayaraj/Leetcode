//Question 1235 named Maximum Profit in Job Scheduling

import java.util.Arrays;

class JobScheduling
{
    public static int main(int[] startTime, int[] endTime, int[] profit){
        Job[] jobs = new Job[profit.length];
        for(int i=0; i<profit.length; i++){
            jobs[i] = new Job(startTime[i], endTime[i], profit[i]);
        }
        
        Arrays.sort(jobs);
        
        int[] dp = new int[jobs.length];
        dp[0] = jobs[0].profit;
        
        for(int i=1; i<jobs.length; i++){
            int profits = jobs[i].profit;
            int nonOverlap = -1;
            for(int j=i-1; j>=0; j--){
                if(jobs[j].endTime <= jobs[i].startTime){
                    nonOverlap = j;
                    break;
                }
            }
            if(nonOverlap != -1){
                profits += dp[nonOverlap];
            }
            dp[i] = Math.max(profits, dp[i-1]);
        }
        return dp[jobs.length-1];
    }
}

class Job implements Comparable<Job>
{
    int startTime, endTime, profit;
    Job(int startTime, int endTime, int profit){
        this.startTime = startTime;
        this.endTime = endTime;
        this.profit = profit;
    }
    
    @Override
    public int compareTo(Job other){
        return this.endTime - other.endTime;
    }
}