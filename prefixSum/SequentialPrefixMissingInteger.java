import java.util.*;

public class SequentialPrefixMissingInteger {

    public static int missingInteger(int[] nums){

        int sum = nums[0];

        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i - 1] + 1){
                sum += nums[i];
            }
        }

        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        while(set.contains(sum)){
            sum++;
        }

        return sum;
    }

    public static void main(String[] args) {
        
        int arr[] = {1, 2, 3, 2, 5};
        System.out.println(missingInteger(arr));
    }

}
