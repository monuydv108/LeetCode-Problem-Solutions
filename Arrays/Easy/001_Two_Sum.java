// Question :  001_Two_Sum

// ================  Problem Statement  ===================================
/* Given an array of integers nums and an integer target,
return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution,
and you may not use the same element twice.

You can return the answer in any order.
*/


// ===================== Example ===============================
/* Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]
*/


// ======================  Logic Process  ============================
/*  
1. We need to check pairs of numbers in the array.
2. We need for loop from i=0 to n and second loop j=i+1 to n 
3. We check if nums[i]+nums[j]==target, then return {i, j}.
 */



// ====================  Solution  ========================
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(nums[i]+nums[j]==target){
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }
}


// ====================  Time & Space Complexity  ========================
/*
Time Complexity: O(n^2)
    - Because we use two nested loops to check all pairs.
Space Complexity: O(1)
    - No extra space is used apart from a few variables.
*/
