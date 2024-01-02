//Question 9 named Palindrome Number

class Palindrome
{
    public static boolean main(int x){
        String num = String.valueOf(x);
        int flag = 0;
        for(int i = 0; i<num.length(); i++){
            if(num.charAt(i) != num.charAt(num.length()-i-1)){
                flag++;
                break;
            }
        }
        if(flag == 0){
            return true;
        }
        return false;
    }
}