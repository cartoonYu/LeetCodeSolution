import java.util.Arrays;

/**
 * Problem
 *      455.Assign Cookies
 * Grade of difficulty
 *      Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution455 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n log n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 sort two array ascending
     *     2.2 Determine if current cookie will meet the child's needs
     *     2.3 end circulation when whichever array traverse end
     * 3.About submit record
     *     3.1 20ms and 49.2MB memory in LeetCode China
     *     3.2 8ms and 40MB memory in LeetCode
     * 4.Q&A
     * @param g
     * @param s
     * @return
     */
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0,j=0;
        int l1=g.length,l2=s.length;
        while(i<l1&&j<l2){
            if(g[i]<=s[j]){
                i++;
            }
            j++;
        }
        return i;
    }
}
