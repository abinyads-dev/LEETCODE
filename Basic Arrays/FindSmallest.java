class Solution {
    public int findSmallest(int[] nums) {
        int smallest=nums[0];
        for(int i=1;i<nums.length;i++)
{
if(nums[i]<smallest)
{
smallest=nums[i];
}
 

}
return smallest;
    }
}
