package String;

/**
 * Problem
 *     1528. Shuffle String
 *     https://leetcode.com/problems/shuffle-string/
 *     https://leetcode-cn.com/problems/shuffle-string/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution1528 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(n)
     *   1.2 空间负责度为 O(n)
     * 2.我的解题思路
     *   2.1 循环遍历源字符串与索引数组
     *   2.2 基于索引数组，将字符放入到临时数组中
     *   2.3 构建一个新数组并返回
     * 3.提交记录
     *   3.1 力扣中耗时 1ms,消耗 39.6MB 内存
     *   3.2 leetcode 中耗时 1ms,消耗 39.9MB 内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 circulate every character and index array
     *     2.2 base on index array, put character to temp array
     *     2.3 construct a new string and return
     * 3.About submit record
     *     3.1 1ms and 39.6MB memory in LeetCode China
     *     3.2 1ms and 39.9MB memory in LeetCode
     * 4.Q&A
     * @param s
     * @param indices
     * @return
     */
    public String restoreString(String s, int[] indices) {
        if(null == s || s.length() == 0){
            return "";
        }
        char[] chars = new char[s.length()];
        char[] source = s.toCharArray();
        for(int i = 0, length = s.length(); i < length; i++){
            chars[indices[i]] = source[i];
        }
        return new String(chars);
    }
}
