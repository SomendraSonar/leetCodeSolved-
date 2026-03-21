import java.util.*;



//using sorting o(nlogn)
class 1_twosum {
     public static int[] twoSum(int[] A, int target) {
       // Your code here
       Arrays.sort(A);
       int left = 0;
       int right = A.length-1;
       int ans[] = {-1,-1};

       while(left<right){
        int sum = A[left]+A[right];

        if(sum== target){
            ans[0] = left+1;
            ans[1] = right+1;
            return ans;
        }
        else if(sum<target) left++;
        else right++;
       }
       return ans;
}
}


//using hashmapo(n)
class 1_twosum {
   public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>map = new HashMap<>();

        for(int i = 0;i<nums.length;i++){
            int compliment = target -nums[i];

            if(map.containsKey(compliment)){
                return new int[]{map.get(compliment),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
        
        
    }
}