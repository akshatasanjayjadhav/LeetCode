class Solution {
    public int majorityElement(int[] nums) {
    //     int n=nums.length;
    //     int res=0;
    //     for(int i=0;i<n;i++){
    //         int count=1;
    //         for(int j=i+1;j<n;j++){
    //             if(nums[j]==nums[i]){
    //                 count++;
    //             }
    //         }
    //          if(count > n/2){
    //             res=nums[i];
    //          }
    //     }
    //      return res;
        
    
    Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
    }
}