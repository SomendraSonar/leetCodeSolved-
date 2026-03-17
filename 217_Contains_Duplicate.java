import java.util.Arrays;
import java.util.HashSet;

//using soring o(nlogn)
class 217_Contains_Duplicate {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;

            }
        }
        return false;

    }
}




//by using HashSet o(n);
class 217_Contains_Duplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> duplicate = new HashSet<>();

        for (int num : nums) {

            if (duplicate.contains(num)) {
                return true;
            }
            duplicate.add(num);

        }
        return false;

    }
}