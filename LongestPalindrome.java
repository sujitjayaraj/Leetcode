//Question 5 named Longest Palindromic Substring

class LongestPalindrome
{
    public String longestPalindrome(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        if(s.length() == 0 || s.equals(rev)){
            return s;
        }

        String s1 = longestPalindrome(s.substring(1, s.length()));
        String s2 = longestPalindrome(s.substring(0, s.length()-1));

        if(s1.length() > s2.length()){
            return s1;
        }
        return s2;
    }
}