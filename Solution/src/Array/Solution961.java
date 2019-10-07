package Array;

import java.util.HashSet;
import java.util.Set;

/**
 * Problem
 *      961.N-Repeated Element in Size 2N Array
 *      https://leetcode.com/problems/n-repeated-element-in-size-2n-array/
 * Grade of difficulty
 *      Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution961 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 cause topic's mean is a array has 2N element and N element are the same,so there only have a one element repetitive appearance
     *     2.2 use a hashSet to cache unique element,if it have repetitive element,return it
     * 3.About submit record
     *     3.1 2ms and 48.8MB memory in LeetCode China
     *     3.2 1ms and 37.5MB memory in LeetCode
     * 4.Q&A
     * @param A
     * @return
     */
    public int repeatedNTimes(int[] A) {
        Set<Integer> set=new HashSet<>();
        for(int temp:A){
            if(set.contains(temp)){
                return temp;
            }
            else{
                set.add(temp);
            }
        }
        return 0;
    }
}
