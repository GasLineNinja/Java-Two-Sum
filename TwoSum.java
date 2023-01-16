import java.util.*;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,2,4};
		int target = 6;
		
		twoSum(nums, target);
	}
	
	public static int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        
        for(int i=0; i<nums.length; i++) {
            for(int j=0; j<nums.length; j++) {
            	if((nums[i] + nums[j]) == target) {
            		answer[0] = i;
            		answer[1] = j;
            		break;
            	}
            }
            
        }
        
        return answer;
    }

}
