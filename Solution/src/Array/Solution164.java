package Array;

/**
 * Problem
 *     164.Maximum Gap
 *     https://leetcode.com/problems/maximum-gap/
 *     https://leetcode-cn.com/problems/maximum-gap/
 * Grade of difficulty
 *     Hard
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution164 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 this solution is base on bucket sort
     *     2.2 statistics the min and max value from array
     *     2.3 form buckets which is depend on nums.length,finally each bucket which both have a range of num
     *     2.4 put all element to bucket
     *     2.5 compare and set result depend on all not empty bucket
     * 3.About submit record
     *     3.1 3ms and 37.4MB memory in LeetCode China
     *     3.2 2ms and 36.9MB memory in LeetCode
     * 4.Q&A
     *
     * @param nums
     * @return
     */
    public int maximumGap(int[] nums) {
        if (nums == null||nums.length < 2){
            return 0;
        }
        int length=nums.length;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int num:nums){
            min=num<min?num:min;
            max=num>max?num:max;
        }
        if (max == min){
            return 0;
        }
        boolean[] flag=new boolean[length+1];
        int[] left=new int[length+1];
        int[] right=new int[length+1];
        int index;
        for (int i=0;i<length; i++) {
            index=getIndex(nums[i],length,min,max);
            left[index]=flag[index]?Math.min(left[index],nums[i]):nums[i];
            right[index]=flag[index]?Math.max(right[index],nums[i]):nums[i];
            flag[index]=true;
        }
        int res=0;
        int pre=right[0];
        for (int i=1;i<=length;i++) {
            if(flag[i]){
                res=Math.max(res,left[i]-pre);
                pre=right[i];
            }
        }
        return res;
    }

    public int getIndex(long num,long length,long min,long max) {
        return (int)((num - min) * length / (max - min));
    }
}
