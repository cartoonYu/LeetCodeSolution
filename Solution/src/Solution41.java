/**
 * Problem
 *    41.First Missing Positive
 * Grade of difficulty
 *    Hard
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution41 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 this solution reference bucket sort's mind
     *     2.2 circulate to put nums[i] to index nums[i]-1
     *     2.3 circulate to check nums[i]-1!=i
     * 3.About submit record
     *     3.1 1ms and 34.7MB memory in LeetCode China
     *     3.2 0ms and 34.7MB memory in LeetCode
     * 4.Q&A
     * @param nums
     * @return
     */
    public int firstMissingPositive(int[] nums) {
        if(nums==null||nums.length==0){
            return 1;
        }
        int length=nums.length;
        for(int i=0;i<length;i++){
            while(nums[i]>0&&nums[i]<=length&&nums[nums[i]-1]!=nums[i]){
                int temp=nums[nums[i]-1];
                nums[nums[i]-1]=nums[i];
                nums[i]=temp;
            }
        }
        for(int i=0;i<length;i++){
            if(nums[i]-1!=i){
                return i+1;
            }
        }
        return length+1;
    }
}
