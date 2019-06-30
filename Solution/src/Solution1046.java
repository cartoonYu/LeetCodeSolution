import java.util.Arrays;

/**
 * Problem
 *     1046.Last Stone Weight
 *     https://leetcode.com/problems/last-stone-weight/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution1046 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n^2)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 use two integer to record stones.length and calculate result
     *     2.2 circulate 1 to length,sort array,and calculate the last two element subtract value
     *     2.3 according to topic to operate last two element
     * 3.About submit record
     *     3.1 2ms and 35.1MB memory in LeetCode China
     *     3.2 1ms and 34.2MB memory in LeetCode
     * 4.Q&A
     * @param stones
     * @return
     */
    public int lastStoneWeight(int[] stones) {
        if(stones==null||stones.length==0){
            return 0;
        }
        if(stones.length==1){
            return stones[0];
        }
        int length=stones.length,temp;
        for(int i=0;i<length;i++){
            Arrays.sort(stones);
            temp=stones[length-1]-stones[length-2];
            stones[length-2]=0;
            stones[length-1]=temp;
        }
        return stones[stones.length-1];
    }
}
