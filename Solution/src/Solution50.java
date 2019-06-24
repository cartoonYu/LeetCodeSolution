/**
 * Problem
 *      50.Pow(x, n)
 *      https://leetcode.com/problems/powx-n/
 * Grade of difficulty
 *      Medium
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution50 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(log n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 the solution is base on binary search
     *     2.2 use a circulate n to n to solve
     * 3.About submit record
     *     3.1 3ms and 43.85MB memory in LeetCode China
     *     3.2 0ms and 32.7MB memory in LeetCode
     * 4.Q&A
     * @param x
     * @param n
     * @return
     */
    public double myPow(double x, int n) {
        if(n==0){
            return 1;
        }
        double res=1;
        for(int i=n;i!=0;i=i/2){
            if(i%2!=0){
                res*=x;
            }
            x*=x;
        }
        return n<0?1/res:res;
    }
}
