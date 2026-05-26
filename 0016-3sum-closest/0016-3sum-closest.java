class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int result = 0;
        int r = 100000;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++){
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right){
                int sum = nums[i] + nums[left] + nums[right];

                int displacement = target - sum;
                displacement = Math.abs(displacement);
                
                if(displacement < r)
                {
                    result = sum;
                    r = displacement;
                }

                if(sum == target){
                    break;
                }
                else if(sum < target){
                    left++;
                }
                else if(sum > target){
                    right--;
                }
            }
        }
        return result;
    }
}