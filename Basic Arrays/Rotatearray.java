class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        if (k == 0) return;

        int[] tmp = new int[k];
        System.arraycopy(nums, n - k, tmp, 0, k);   
        System.arraycopy(nums, 0, nums, k, n - k);  
        System.arraycopy(tmp, 0, nums, 0, k);      
    }
}
