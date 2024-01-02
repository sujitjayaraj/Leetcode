//Question 11 named Container With Most Water

class mostArea
{
    public static int main(int[] height){
        int max = 0, i = 0, j = height.length - 1, area = 0;
        while(i < j){
            area = Math.min(height[i], height[j]) * (j - i);
            max = area > max ? area : max;
            if(height[i] < height[j]){
                i++;
            }
            else if(height[i] > height[j]){
                j--;
            }
            else{
                i++;
                j--;
            }
        }
        return max;
    }
}