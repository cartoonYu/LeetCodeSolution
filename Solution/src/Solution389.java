/**
 * Problem
 *      389.Find the Difference
 *      https://leetcode.com/problems/find-the-difference/
 * Grade of difficulty
 *      Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution389 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 according to topic's mean,sum of t-1=sum of s
     *     2.2 use a 0 to s.length() circulation to get t's and s's sum apart
     *     2.3 return (char)(t2-t1)
     * 3.About submit record
     *     3.1 2ms and 34.4MB memory in LeetCode China
     *     3.2 1ms and 37.3MB memory in LeetCode
     * 4.Q&A
     *
     * @param s
     * @param t
     * @return
     */
    public char findTheDifference(String s, String t) {
        int t1=0,t2=t.charAt(t.length()-1);
        for(int i=0,length=s.length();i<length;i++){
            t1+=s.charAt(i);
            t2+=t.charAt(i);
        }
        return (char)(t2-t1);
    }
}
