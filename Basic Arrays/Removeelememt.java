class Solution {
    public int removeElement(int[] nums, int val) {
        int leave=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                nums[leave]=nums[i];
                leave++;
            }
        }
        return leave;
    }
}
