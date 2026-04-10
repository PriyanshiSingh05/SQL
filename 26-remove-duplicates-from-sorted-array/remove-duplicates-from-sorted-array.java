class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int left = 0 ;
        int right = 1;
        int ans= 1;

        if(n==0) return 0;

        while(right < n){
            if(nums[right] != nums[right - 1]){
                nums[left+1] = nums[right];
                left++;
                ans += 1;
                right++;
            }
            else{
                right++;
            }
        }return ans;
        
    }
}