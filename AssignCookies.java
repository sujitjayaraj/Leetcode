//Question 455 named Assign Cookies

import java.util.Arrays;

class AssignCookies
{
    public static int main(int[] g, int[] s)
    {
        int count = 0, i=g.length-1, j=s.length-1;
        Arrays.sort(g);
        Arrays.sort(s);

        while(i>=0 && j>=0){
            if(s[j]>=g[i]){
                count++;
                j--;
            }
            i--;
        }
        return count;
    }
}