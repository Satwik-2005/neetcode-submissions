class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;

        int left = 0;
        int right = n - 1;
        int max = 0;

        while(left < right) {
            int width = right - left;
            int he = Math.min(heights[left], heights[right]);

            max = Math.max(max, width * he);

            if(heights[left] < heights[right])
                left += 1;

            else
                right -= 1;
        }

        return max;
    }
}
