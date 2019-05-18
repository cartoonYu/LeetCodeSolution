/**
 * Problem
 *      326. Power of Three
 * Grade of difficulty
 *      Easy
 * Related topics
 *      342. Power of Four
 * @author cartoon
 * @version 1.0
 */
public class Solution326 {

    /**
     *  use mod and divide number in circulation to solve
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 exclude n<=1 manually
     *     2.2 circulate n to judge result
     *          2.2.1 if n%3!=0,it declare no possibility to return true
     * 3.About submit record
     *     3.1 87ms and 40.4MB memory in LeetCode China
     *     3.2 10ms and 35.8MB memory in LeetCode
     * 4.Q&A
     *      None
     * @param n
     * @return
     */
    public boolean isPowerOfThree(int n) {
        if(n<=0){
            return false;
        }
        if(n==1){
            return true;
        }
        while(n>1){
            if(n%3!=0){
                return false;
            }
            n=n/3;
        }
        return true;
    }

    /**
     * use mod and divide number in recursion to solve
     * 1.About Complexity
     *    1.1 Time Complexity is O(n)
     *    1.2 Space Complexity is O(n)
     * 2.how I solve
     *      2.1 exclude n<=1 manually
     *      2.2 recurse n to judge result
     *          2.2.1 if n%3!=0,it declare no possibility to return true
     * 3.About submit record
     *     3.1 85ms and 39.5MB memory in LeetCode China
     *     3.2 no record in LeetCode
     * 4.Q&A
     * @param n
     * @return
     */
    public boolean recursion(int n) {
        if(n==1){
            return true;
        }
        if(n<3){
            return false;
        }
        if(n%3!=0){
            return false;
        }
        return recursion(n/3);
    }


}
