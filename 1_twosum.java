import java.util.*;



//using sorting o(nlogn)
class 1_twosum {
    public int[] twoSum(int[] nums, int target) {

        int n = nums.length;

        int[][] arr = new int[n][2];

        for(int i = 0; i < n; i++){
            arr[i][0] = nums[i];   // value
            arr[i][1] = i;         // original index
        }

        Arrays.sort(arr, (a,b) -> a[0] - b[0]);

        int start = 0;
        int end = n - 1;

        while(start < end){

            int sum = arr[start][0] + arr[end][0];

            if(sum == target){
                return new int[]{arr[start][1], arr[end][1]};
            }
            else if(sum < target){
                start++;
            }
            else{
                end--;
            }

        }

        return new int[]{-1,-1};
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