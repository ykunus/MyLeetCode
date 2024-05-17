// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

class Solution {
    public boolean containsDuplicate(int[] nums) {
		HashSet<Integer> noDupNums = new HashSet<>();
		for(int i = 0; i< nums.length; i ++) {
			noDupNums.add(nums[i]);
		}	
		if(noDupNums.size() == nums.length){
			return false;
		}else {
			return true;
		}
	}
}
