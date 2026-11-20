class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;

        int count1 = 0, count2 = 0;
        int element1 = Integer.MIN_VALUE;
        int element2 = Integer.MIN_VALUE;

        // Pass 1: find up to 2 candidates
        for(int i = 0; i < n; i++) {
            if(count1 == 0  &&  nums[i] != element2) {
                element1 = nums[i];
                count1 = 1;
            }
            else if(count2 == 0  &&  nums[i] != element1) {
                element2 = nums[i];
                count2 = 1;
            }
            else if(nums[i] == element1)
                count1++;
            else if(nums[i] == element2)
                count2++;
            else {
                count1--;
                count2--;
            }
        }

        // Pass 2: verify the candidates
        count1 = 0;
        count2 = 0;

        for(int num : nums) {
            if(num == element1) count1++;
            else if(num == element2) count2++;
        }

        List<Integer> result = new ArrayList<>();

        if(count1 > n / 3) result.add(element1);
        if(count2 > n / 3) result.add(element2);

        return result;
    }
}