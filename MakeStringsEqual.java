//Question 1897 Redistribute Characters to Make All Strings Equal

class MakeStringsEqual
{
    public boolean makeEqual(String[] words){
        int[] count = new int[26];

        for(int i = 0; i < words.length; i++){
            for(int j=0; j < words[i].length(); j++){
                count[words[i].charAt(j) - 97]++;
            }
        }

        for(int i: count){
            if(i % words.length != 0){
                return false;
            }
        }
        
        return true;
    }
}