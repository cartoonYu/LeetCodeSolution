/**
 * Problem
 *      278.First Bad Version
 * Grade of difficulty
 *      Easy
 * Related topics
 *      34.Find First and Last Position of Element in Sorted Array
 * @author cartoon
 * @version 1.0
 */
public class Solution278 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(log n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 this solution is base on binary search
     *     2.2 use function bad version to confirm bad version's index
     * 3.About submit record
     *     3.1 17ms and 32.4MB memory in LeetCode China
     *     3.2 10ms and 34.4MB memory in LeetCode
     * 4.Q&A
     *
     * @param n
     * @return
     */
    public int firstBadVersion(int n) {
        int i=1;
        int j=n;
        while(i<j){
            int mid=i+((j-i)>>1);
            if(isBadVersion(mid)){
                j=mid;
            }
            else{
                i=mid+1;
            }
        }
        return i;
    }

    /**
     * this function is replace leetcode's method,please use leetcode's return value to run your solution
     * @param mid
     * @return
     */
    private boolean isBadVersion(int mid){
        return true;
    }
}
