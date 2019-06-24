/**
 * Problem
 *      1.Two Sum
 *      https://leetcode.com/problems/two-sum/
 * Grade of difficulty
 *      Easy
 * Related topics
 *      None
 * @author cartoon
 * @version 1.0
 */
public class Solution1 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n^2)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 circle twice to add two num in the array
     * 3.About submit record
     *     3.1 27ms and 38.5MB memory in LeetCode China
     *     3.2 27ms and 38.5MB memory in LeetCode
     * 4.Q&A
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        int[] a=new int[2];
        int temp;
        for(int i=0;i<nums.length;i++){
            temp=nums[i];
            for(int j=i+1;j<nums.length;j++){
                if((nums[j]+temp)==target){
                    a[0]=i;
                    a[1]=j;
                    break;
                }
            }
            if(a[0]!=0||a[1]!=0){
                break;
            }
        }
        return a;
    }
}
