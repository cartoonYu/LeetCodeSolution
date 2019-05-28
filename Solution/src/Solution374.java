/**
 * Problem
 *      374.Guess Number Higher or Lower
 * Grade of difficulty
 *      Easy
 * Related topics
 *      367. Valid Perfect Square
 * @author cartoon
 * @version 1.0
 */
public class Solution374 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(log n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 this solution is base on binary search
     *     2.2 define two pointer left and right where index in 0 and n
     *     2.3 use a binary search to get square
     *               2.3.1 cal the mid
     *               2.3.2 compare the mid to result from function guess return value
     * 3.About submit record
     *     3.1 1ms and 34.8MB memory in LeetCode China
     *     3.2 0ms and 34.3MB memory in LeetCode
     * 4.Q&A
     * @param n
     * @return
     */
    public int guessNumber(int n) {
        /*int i=1;
        int j=n;
        while(i<=j){
            int mid=i+((j-i)>>1);
            if(guess(mid)==0){
                return mid;
            }
            if(guess(mid)==1){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return -1;*/
        return 0;
    }
}
