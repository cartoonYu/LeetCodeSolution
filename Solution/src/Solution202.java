/**
 * Problem
 *      202.Happy Number
 * Grade of difficulty
 *      Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution202 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 use two integer to cache process result
     *     2.2 use double circulate to calculate,there have two condition
     *             2.2.1 temp2==1,it is happy number,return true
     *             2.2.2 temp2==4,there have no method to be happy number,return false
     * 3.About submit record
     *     3.1 3ms and 33.6MB memory in LeetCode China
     *     3.2 1ms and 32.3MB memory in LeetCode
     * 4.Q&A
     * @param n
     * @return
     */
    public boolean isHappy(int n) {
        while(true){
            int temp1=n;
            int temp2=0;
            while(temp1!=0){
                temp2+=(temp1%10)*(temp1%10);
                temp1/=10;
            }
            if(temp2==1){
                return true;
            }
            if(temp2==4){
                return false;
            }
            n=temp2;
        }
    }
}
