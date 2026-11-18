class Solution {

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private int findFirstOccurance(int[] nums, int val) {
        int n = nums.length;
        int index = n;

        for(int i=0;i<n;i++) {
            if(nums[i] == val) {
                index = i;
                break;
            }
        }

        return index;
    }

    public int removeElement(int[] nums, int val) {
        int n = nums.length;

        if(n == 1  &&  val == nums[0])
            return 0;

        int i = findFirstOccurance(nums, val);
        int j = i + 1;

        while(j < n) {
            if(nums[j] != val) {
                swap(nums, i, j);
                i += 1;
            }

            j += 1;
        }

        return i;
    }
}