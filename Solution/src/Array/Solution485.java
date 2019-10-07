package Array;

/**
 * Problem
 *      485.Max Consecutive Ones
 *      https://leetcode.com/problems/max-consecutive-ones/
 * Grade of difficulty
 *      Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution485 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 use two integer to cache number of 1
     *     2.2 circulate array
     *          2.2.1 if current element is 1,temp++
     *          2.2.2 if current element is 0,compare result to temp and set temp 0
     *     2.3 return the largest of temp and result
     * 3.About submit record
     *     3.1 5ms and 50.7MB memory in LeetCode China
     *     3.2 2ms and 38.2MB memory in LeetCode
     * 4.Q&A
     *      4.1 Q:Why this solution is faster than the another solution with similar structure?
     *          A:I think is about judging condition,cause 1 is main element,so make it to if condition can reduce judge time.
     * @param nums
     * @return
     */
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int result=0;
        int temp=0;
        for(int i:nums){
            if(i==1){
                temp++;
            }
            else{
                result=result<temp?temp:result;
                temp=0;
            }
        }
        return result<temp?temp:result;
    }

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 use two integer to cache number of 1
     *     2.2 circulate array
     *          2.2.1 if current element is 0,compare result to temp and set temp 0
     *          2.2.2 if current element is 1,temp++
     *     2.3 return the largest of temp and result
     * 3.About submit record
     *     3.1 8ms and 52.5MB memory in LeetCode China
     *     3.2 3ms and 39.6MB memory in LeetCode
     * 4.Q&A
     * @param nums
     * @return
     */
    public int anotherFindMaxConsecutiveOnes(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int result=0;
        int temp=0;
        for(int i:nums){
            if(i==0){
                result=temp>result?temp:result;
                temp=0;
                continue;
            }
            temp++;
        }
        result=temp>result?temp:result;
        return result;
    }
}
