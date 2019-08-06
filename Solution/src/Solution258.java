/**
 * Problem
 *     258.Add Digits
 *     https://leetcode.com/problems/add-digits/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution258 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 circulate when num>=10
     *          2.1.1 calculate tens digit and units digit,plus them to num
     *     2.2 return num
     * 3.About submit record
     *     3.1 2ms and 33.6MB memory in LeetCode China
     *     3.2 0ms and 32.3MB memory in LeetCode
     * 4.Q&A
     * @param num
     * @return
     */
    public int addDigits(int num) {
        while(num>=10){
            int ten=num/10;
            int digit=num-ten*10;
            num=ten+digit;
        }
        return num;
    }
}
