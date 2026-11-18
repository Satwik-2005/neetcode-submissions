class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int element = 0;

        for(int ele : nums) {
            if(count == 0) {
                count += 1;
                element = ele;
            }

            if(ele == element)
                count += 1;

            else
                count -= 1;
        }

        return element;
    }
}