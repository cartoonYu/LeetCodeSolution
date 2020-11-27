package org.LeetcodeSolution.String;

/**
 * Problem
 *     748.Shortest Completing Word
 *     https://leetcode.com/problems/shortest-completing-word/
 *     https://leetcode-cn.com/problems/shortest-completing-word/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution748 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(n)
     *   1.2 空间负责度为 O(n)
     * 2.我的解题思路
     *   2.1 过滤出 licensePlate 包含的字母以及统计字母出现的次数
     *   2.2 循环遍历 words 数组，统计字母出现的次数，对比 2.1 的统计数组，如果当前统计数组中元素都小于 2.1 统计数组，标记当前字符串为当前最短补全词
     * 3.提交记录
     *   3.1 力扣中耗时 3ms,消耗 39MB 内存
     *   3.2 leetcode 中耗时 2ms,消耗 39.9MB 内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 filter letters in strings and count the number of letters
     *     2.2 circulate word array, count the number of letters, compare with 2.1 count array,
     *          if current count array elements are all smaller than 2.1 count array, mark current word and current word length and res
     * 3.About submit record
     *     3.1 3ms and 39MB memory in LeetCode China
     *     3.2 2ms and 39.9MB memory in LeetCode
     * 4.Q&A
     * @param licensePlate
     * @param words
     * @return
     */
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] counts = new int[26];
        for(char ch : licensePlate.toCharArray()){
            if(ch >= 'A' && ch <= 'Z'){
                ch += 32;
            }
            if(ch >= 'a' && ch <= 'z'){
                counts[ch - 'a'] += 1;
            }
        }
        int wordsLength = words.length;
        String minWord = null;
        int minWordLength = Integer.MAX_VALUE;
        boolean flag;
        for(int i = 0; i < wordsLength; i++){
            flag = true;
            int[] chars = new int[26];
            for(char ch : words[i].toCharArray()){
                chars[ch - 'a'] += 1;
            }
            for(int j = 0, size = 26; j < size; j++){
                if(counts[j] > chars[j]){
                    flag = false;
                    break;
                }
            }
            if(flag && minWordLength > words[i].length()){
                minWord = words[i];
                minWordLength = words[i].length();
            }
        }
        return minWord;
    }
}
