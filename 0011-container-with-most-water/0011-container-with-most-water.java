import static java.lang.Math.*;

class Solution {
    public int maxArea(int[] height) {
        int Area = 0;
        for(int i = 0; i < height.length; i++)
        {
            int left = height[i];
            for(int j = height.length - 1; j >= i; j--)
            {
                int right = height[j];
                int width = j - i;
                int length = Math.min(left, right);


                if (Area < width * length){
                    Area = width * length;
                }
                
                if (right > left) break;
            }
        }
        return Area;
    }
}