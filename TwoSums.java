// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> numbers = new HashMap<>();
        int[] solution= new int[2]; 
        int indexPos = 0;
        for( int i = 0 ; i < nums.length; i++) {
        	numbers.put(nums[i], i );
        }
        for(int i = 0 ; i < nums.length; i++){
            int difference = target - nums[i];
            if(numbers.containsKey(difference) && numbers.get(difference)!= i){
            	
                return new int []{i , numbers.get(difference)};
            }
        }
        return solution;
    }
}

