import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {
	
	
	 public List<Integer> findDuplicates(int[] nums) {
		 int i = 0;
		 
		 while (i< nums.length) {
			 int correct = nums[i] - 1;
			 if(nums[i]!= nums[correct]) {
				 swap(nums,i,correct);
			 }
			 else {
				 i++;			 }
		 }
		 List<Integer> ans = new ArrayList<>();
			for(int index =0;index < nums.length;index++) {
				if(nums[index]!= index +1) {
				ans.add(nums[i]);
				}
			}
	        return ans;
	    }
	 
	 static void swap(int[] arr,int first ,int second) {
			int temp = arr[first];
			arr[first]=arr[second];
			arr[second]=temp;
			
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
