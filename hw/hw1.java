
public class hw1 {
    /*
    88. Merge Sorted Array

    You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

    Merge nums1 and nums2 into a single array sorted in non-decreasing order.

    The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.


    Example 1:

    Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
    Output: [1,2,2,3,5,6]
    Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
    The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

    Example 2:
    Input: nums1 = [1], m = 1, nums2 = [], n = 0
    Output: [1]
    Explanation: The arrays we are merging are [1] and [].
    The result of the merge is [1].
    */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        while(m > 0 && n > 0){
            if(nums1[m-1] <= nums2[n-1]){
                nums1[m+n-1] = nums2[n-1];
                n--;
            }
            else{
                nums1[m+n-1] = nums1[m-1];
                m--;
            }
        }
        for(int i = 0; i < n; i++) {
            nums1[i] = nums2[i];
        }
    }
    /*
    283. Move Zeroes

    Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

    Note that you must do this in-place without making a copy of the array.

    Example 1:

    Input: nums = [0,1,0,3,12]
    Output: [1,3,12,0,0]
    Example 2:

    Input: nums = [0]
    Output: [0]

     */
    public void moveZeroes(int[] nums) {
        int left = 0;
        int right = 0;
        while(left < nums.length && nums[left] != 0){
            left++;
        }
        while(left < nums.length && right < nums.length){
            if(nums[right] != 0 && right > left){
                nums[left] = nums[right];
                nums[right] = 0;
                left++;
            }
            right++;
        }
    }
}