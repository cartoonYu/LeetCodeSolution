package org.LeetcodeSolution.String;

/**
 * Problem
 *     1422.Maximum Score After Splitting a String
 *     https://leetcode.com/problems/maximum-score-after-splitting-a-string/
 *     https://leetcode-cn.com/problems/maximum-score-after-splitting-a-string/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution1422 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(n)
     *   1.2 空间负责度为 O(1)
     * 2.我的解题思路
     *   2.1 循环遍历数组，获取字符串中 1 的数量
     *   2.2 从 0 到 length - 1 遍历数组，若当前元素为 0，temp 自增，否则 temp 自减，对比交换 temp 以及 result
     * 3.提交记录
     *   3.1 力扣中耗时 1ms,消耗 37.8MB 内存
     *   3.2 leetcode 中耗时 0ms,消耗 37.3MB 内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 circulate array, get number of 1
     *     2.2 circulate array in 1 to length - 1, if current character is 0, plus temp, otherwise subtract temp, compare temp and result
     * 3.About submit record
     *     3.1 1ms and 37.8MB memory in LeetCode China
     *     3.2 0ms and 37.3MB memory in LeetCode
     * 4.Q&A
     * @param s
     * @return
     */
    public int maxScore(String s) {
        char[] chars = s.toCharArray();
        int oneCount = 0, length = s.length();
        for(int i = 0; i < length; i++){
            if(chars[i] == '1'){
                oneCount++;
            }
        }
        int res = 0, temp = oneCount;
        for(int i = 0; i < length - 1; i++){
            if(chars[i] == '0'){
                temp++;
            } else{
                temp--;
            }
            if(temp > res){
                res = temp;
            }
        }
        return res;
    }
}
