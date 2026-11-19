class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();

        for(int i=0;i<n;i++)
            set.add(nums[i]);

        int max = 0;

        for(int num : set) {
            if(set.contains(num - 1))
                continue;

            int current = num;
            int count = 0;

            while(set.contains(current)) {
                count++;
                current++;
            }

            max = Math.max(max, count);
        }

        return max;
    }
}
