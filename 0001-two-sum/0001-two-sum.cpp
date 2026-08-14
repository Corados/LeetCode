class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        int nums_length = nums.size();
        int i, j;

        for(i = 0; i < nums_length; i++){
            j = i + 1;
            while(j < nums_length){
                if(nums[i] + nums[j] == target){
                    return {i,j};
                }
                j++;
            }
        }
        return {};
    }
};