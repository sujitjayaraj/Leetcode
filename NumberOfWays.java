//Question 2147 named Number of Ways to Divide a Long Corridor

class NumberOfWays
{
    public int numberOfWays(String corridor){
        int seatCount = 0, plantCount = 0, start = 0, end = corridor.length()-1; 
        long sum = 1;
        while(start < corridor.length() && corridor.charAt(start) == 'P'){
            start++;
        }
        while(end >= 0 && corridor.charAt(end) == 'P'){
            end--;
        }

        for(int i=start; i<end; i++){
            if(corridor.charAt(i) == 'S'){
                seatCount++;
                if(seatCount % 2 != 0){
                    sum = (sum * (plantCount + 1)) % 1_000_000_007;
                }
                plantCount = 0;
            }
            else if(corridor.charAt(i) == 'P'){
                plantCount++;
            }
        }
        
        if(seatCount % 2 == 0){
            return 0;
        }

        return (int)sum;
    }
}