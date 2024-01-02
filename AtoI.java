//Question 8 named String to Integer (atoi)

class AtoI
{
    public static int main(String s){
        char sign = '+';
        s = s.trim();
        StringBuilder sb = new StringBuilder();
        int flag = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if((ch == '+' || ch == '-') && sb.length() == 0 && flag == 0){
                sign = ch;
                flag++;
            }
            else if(Character.isDigit(ch)){
                sb.append(ch);
            }
            else{
                break;
            }
        }
        if(sb.length() == 0){
                return 0;
        }
        try{
            return Integer.parseInt(sb.insert(0,sign).toString());
        }
        catch(NumberFormatException e){
            if(sign == '+'){
                return (int)(Math.pow(2,31) - 1);
            }
            else
                return (int)Math.pow(-2,31);
        }
    }
}