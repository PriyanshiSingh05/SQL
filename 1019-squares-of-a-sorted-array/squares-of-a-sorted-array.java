class Solution {
    public int[] sortedSquares(int[] nums) {
          int n = nums.length;
        int[] result = new int[n];

        int start = 0, end = n - 1;
        int k = end;

        while(start <= end){

            int s = nums[start] * nums[start];
            int e = nums[end] * nums[end];

            if(s < e){
                result[k] = e;
                end--;
            } else {
                result[k] = s;
                start++;
            }

            k--;
        }

        return result;
        
    }
}