// Question :  162_Find_Peak_Element

// ================  Problem Statement  ===================================
/* A peak element is an element that is strictly greater than its neighbors.

Given a 0-indexed integer array nums, find a peak element, and return its index. 
If the array contains multiple peaks, return the index to any of the peaks.

You may imagine that nums[-1] = nums[n] = -∞. 
In other words, an element is always considered to be strictly greater 
than a neighbor that is outside the array.

You must write an algorithm that runs in O(log n) time.
*/


// ===================== Example ===============================
/* Example 1:
Input: nums = [1,2,3,1]
Output: 2
Explanation: 3 is a peak element and function should return index 2.

Example 2:
Input: nums = [1,2,1,3,5,6,4]
Output: 5
Explanation: Function can return index 1 (value=2) or index 5 (value=6),
             since both are peak elements.
*/


// ======================  Logic Process  ============================
/*
1. The problem requires O(log n) → this hints Binary Search.
2. Use mid = (low + high) / 2 to divide the search space.
3. If nums[mid] < nums[mid+1], then peak lies on the right side → move low = mid+1.
4. Else, peak lies on the left side (including mid) → move high = mid.
5. When low == high, we found the peak index.
*/


// ====================  Solution  ========================
class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] < nums[mid + 1]) {
                // Peak lies on the right
                low = mid + 1;
            } else {
                // Peak lies on the left or at mid
                high = mid;
            }
        }
        return low; // low == high → peak index
    }
}


// ====================  Time & Space Complexity  ========================
/*
Time Complexity: O(log n)
    - Because we reduce the search space by half each time using Binary Search.
Space Complexity: O(1)
    - Only a few variables are used, no extra data structure.
*/
