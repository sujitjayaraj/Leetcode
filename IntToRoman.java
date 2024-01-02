//Question 12 named Integer to Roman

class IntToRoman
{
    public static String main(int num){
        int[] values = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] romanLiterals = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        StringBuilder result = new StringBuilder();
        
        for(int i=values.length - 1; i >= 0; i--){
            while(num >= values[i]){
                result.append(romanLiterals[i]);
                num -= values[i];
            }
        }
        
        return result.toString();
    }
}