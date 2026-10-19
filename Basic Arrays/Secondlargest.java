class Solution {
    public int findSecondLargest(int[] nums) {
int largest = nums[0];
int secondLargest = -1;

for (int i = 0; i < nums.length; i++) {
    if (nums[i] > largest) {
        secondLargest = largest;
        largest = nums[i];
    }
  else if (nums[i] > secondLargest && nums[i] < largest) {
    secondLargest = nums[i];
}
}

return secondLargest;
    }
}
