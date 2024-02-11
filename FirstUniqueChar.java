//Question 387 named First Unique Character in a String

import java.util.HashSet;
class FirstUniqueChar
{
    public int firstUniqChar(String s) {
        int pos = -1;
        HashSet<Character> set = new HashSet<Character>();
        for(int i=0; i<s.length(); i++){
            Character ch = new Character(s.charAt(i));
            if(s.indexOf(ch, i+1) == -1 && !set.contains(ch)){
                pos = i;
                break;
            }
            set.add(ch);
        }
        return pos;
    }
}