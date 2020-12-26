package org.LeetcodeSolution.String;

/**
 * Problem
 *     1684.Count the Number of Consistent Strings
 *     https://leetcode.com/problems/count-the-number-of-consistent-strings/submissions/
 *     https://leetcode-cn.com/problems/count-the-number-of-consistent-strings/submissions/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution1684 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(n)
     *   1.2 空间负责度为 O(1)
     * 2.我的解题思路
     *   2.1 遍历 allowed 数组标记出现的字符
     *   2.2 遍历 words 数组， 遍历 words 元素中每一个字符，若当前字符不在 allowed 数组中，标记当前字符串不一致
     * 3.提交记录
     *   3.1 力扣中耗时 9ms,消耗 39MB 内存
     *   3.2 leetcode 中耗时 7ms,消耗 40.1MB 内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 circulate allowed array and sign character appearance
     *     2.2 circulate words array, circulate every character in each word, if current character is not in allowed array, sign this word is inconsistent
     * 3.About submit record
     *     3.1 9ms and 39MB memory in LeetCode China
     *     3.2 7ms and 40.1MB memory in LeetCode
     * 4.Q&A
     * @param allowed
     * @param words
     * @return
     */
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] chars = new boolean[26];
        for(Character ch : allowed.toCharArray()){
            chars[ch - 'a'] = true;
        }
        int cnt = 0;
        boolean flag;
        for(String word : words){
            flag = true;
            for(Character ch : word.toCharArray()){
                if(!chars[ch - 'a']){
                    flag = false;
                    break;
                }
            }
            if(flag){
                cnt += 1;
            }
        }
        return cnt;
    }
}
