/**
 * Problem
 *     3.Longest Substring Without Repeating Characters
 *     https://leetcode.com/problems/longest-substring-without-repeating-characters/submissions/
 *     https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/submissions/
 * Grade of difficulty
 *     Medium
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution3 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n^2)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 这个解法基于滑动窗口
     *     2.2 定义一个左边界
     *     2.3 循环遍历字符串
     *         2.3.1 循环遍历左边界到当前元素，如果发现相同元素，对比result以及更新边界
     * 3.提交记录
     *     3.1 力扣中耗时4ms,消耗37.4MB内存
     *     3.2 leetcode中耗时2ms,消耗38MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n^2)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 this solution is base on slide window
     *     2.2 define a left border
     *     2.3 circulate to go though string
     *         2.3.1 circulate left border to current index,if find a same character with current character,compare result and update left border
     * 3.About submit record
     *     3.1 4ms and 37.4MB memory in LeetCode China
     *     3.2 2ms and 38MB memory in LeetCode
     * 4.Q&A
     *
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        if(s==null||s.length()==0){
            return 0;
        }
        if(s.length()<2){
            return s.length();
        }
        int res=0,flag=0;
        char[] chars=s.toCharArray();
        for(int i=0,length=chars.length;i<length;i++){
            for(int j=flag;j<i;j++){
                if(chars[i]==chars[j]){
                    res=Math.max(res,i-flag);
                    flag=j+1;
                    break;
                }
            }
        }
        return Math.max(chars.length-flag,res);
    }
}
