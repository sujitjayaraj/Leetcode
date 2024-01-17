//Question 2125 named Number of Laser Beams in a Bank

class NumberOfBeams
{
    public static int main(String[] bank){
        int count = 0, prev = 0;
        for(int i=0; i<bank.length; i++){
            int temp = 0;
            for(int j=0; j<bank[i].length(); j++){
                if(bank[i].charAt(j) == '1'){
                    temp++;
                }
            }
            if(temp != 0){
                if(prev != 0){
                    count += prev*temp;
                }
                prev = temp;
            }
        }
        return count;
    }
}