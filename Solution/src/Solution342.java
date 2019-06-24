/**
 * Problem
 *      342. Power of Four
 *      https://leetcode.com/problems/power-of-four/
 * Grade of difficulty
 *      Easy
 * Related topics
 *      326. Power of Three
 * @author cartoon
 * @version 1.0
 */
public class Solution342 {

    /**
     * use mod and divide number in recursion to solve
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 exclude n<=1 manually
     *     2.2 recurse n to judge result
     *         2.2.1 if n%4!=0,it declare no possibility to return true
     * 3.About submit record
     *     3.1 6ms and 33MB memory in LeetCode China
     *     3.2 1ms and 32.2MB memory in LeetCode
     * 4.Q&A
     * @param num
     * @return
     */
    public boolean isPowerOfFour(int num) {
        if(num==0){
            return false;
        }
        if(num==1){
            return true;
        }
        if(num==2){
            return false;
        }
        if(num %4!=0){
            return false;
        }
        return isPowerOfFour(num/4);
    }

    /**
     *  use mod and divide number in circulation to solve
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 exclude n<=1 manually
     *     2.2 circulate n to judge result
     *          2.2.1 if n%4!=0,it declare no possibility to return true
     * 3.About submit record
     *     3.1 6ms and 33.2MB memory in LeetCode China
     *     3.2 1ms and 32.2MB memory in LeetCode
     * 4.Q&A
     *      None
     * @param num
     * @return
     */
    public boolean circulation(int num) {
        if(num==1){
            return true;
        }
        if(num<4){
            return false;
        }
        while(num>1){
            if(num%4!=0){
                return false;
            }
            num/=4;
        }
        return true;
    }
}
