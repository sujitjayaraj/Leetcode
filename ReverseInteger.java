//Question 7 named Reverse Integer

import java.math.BigInteger;

class ReverseInteger
{
    public static int main(int x){
        StringBuilder sb = new StringBuilder(String.valueOf((int)Math.abs(x)));
        sb = sb.reverse();
        sb = x<0 ? sb.insert(0, '-') : sb;
        String res = sb.toString();
        try{
            return Integer.parseInt(res);
        }
        catch(NumberFormatException e){
            return 0;
        }
    }
}