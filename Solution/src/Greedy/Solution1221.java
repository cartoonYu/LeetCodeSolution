package Greedy;

/**
 * Problem
 *     1221.Split a String in Balanced Strings
 *     https://leetcode.com/problems/split-a-string-in-balanced-strings/
 *     https://leetcode-cn.com/problems/split-a-string-in-balanced-strings/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution1221 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(n)
     *   1.2 空间负责度为 O(1)
     * 2.我的解题思路
     *   2.1 根据规则，当 R 的数量与 L 的数量相等，平衡字符串的数量一定等于 R 或 L 的数量
     *   2.2 循环遍历字符串，当前元素为 R，temp 自减，否则 temp 自增，当 temp 为 0，res自增
     * 3.提交记录
     *   3.1 力扣中耗时 0ms,消耗 37.3MB 内存
     *   3.2 leetcode 中耗时 0ms,消耗 38.9MB 内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 according to rule, when number of 'R' and number of 'L' are equals, number of balance string must be equals to number of R
     *     2.2 circulate source string, when current character is 'R', subtract temp, otherwise plus temp, when temp is 0, plus res
     * 3.About submit record
     *     3.1 0ms and 37.3MB memory in LeetCode China
     *     3.2 0ms and 38.9MB memory in LeetCode
     * 4.Q&A
     *
     * @param s
     * @return
     */
    public int balancedStringSplit(String s) {
        int temp = 0, res = 0;
        for(char ch : s.toCharArray()){
            if(ch == 'L'){
                temp--;
            } else{
                temp++;
            }
            if(temp == 0){
                res++;
            }
        }
        return res;
    }

}
