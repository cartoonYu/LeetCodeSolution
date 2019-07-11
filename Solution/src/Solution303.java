/**
 * Problem
 *     303.Range Sum Query - Immutable
 *     https://leetcode.com/problems/range-sum-query-immutable/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution303 {

    private int[] nums;

    private int[] sum;

    public Solution303(int[] nums) {
        this.nums=nums;
        initSum();
    }

    private void initSum(){
        if(nums.length==0){
            return;
        }
        sum=new int[nums.length];
        sum[0]=nums[0];
        for(int i=1,length=nums.length;i<length;i++){
            sum[i]=sum[i-1]+nums[i];
        }
    }

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 calculate within the scope of element ahead
     *     2.2 return sum range directly when call the function
     * 3.About submit record
     *     3.1 110ms and 44.3MB memory in LeetCode China
     *     3.2 50ms and 42.1MB memory in LeetCode
     * 4.Q&A
     * @param i
     * @param j
     * @return
     */
    public int sumRange(int i, int j) {
        if(i>=j){
            return nums[i];
        }
        if(i==0){
            return sum[j];
        }
        return sum[j]-sum[i-1];
    }
}
