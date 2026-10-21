class Solution {
    public int removeDuplicates(int[] nums) {
        int nextUnique = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[nextUnique]) {
                nextUnique++;
                nums[nextUnique] = nums[i];
            }
        }

        return nextUnique + 1;
    }
}
