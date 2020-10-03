package org.LeetcodeSolution.Math;

/**
 * Problem
 *     423.Reconstruct Original Digits from English
 *     https://leetcode.com/problems/reconstruct-original-digits-from-english/
 *     https://leetcode-cn.com/problems/reconstruct-original-digits-from-english/
 * Grade of difficulty
 *     Medium
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution423 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(n)
     *   1.2 空间负责度为 O(n)
     * 2.我的解题思路
     *   2.1 定义两个数组存储计算过程中产生的结果
     *   2.2 循环遍历传入字符串，统计每个字符出现的次数
     *   2.3 通过统计每个数字含有的特征字符次数统计数字出现的次数
     *       2.3.1 使用 z 的出现次数代表 0 的出现次数，使用 nums[0] 标记
     *       2.3.2 使用 o 的出现次数代表 1 的出现次数，使用 nums['o'] - res[2] - res[4] 标记
     *       2.3.3 使用 w 的出现次数代表 2 的出现次数，使用 nums['w'] 标记
     *       2.3.4 使用 h 的出现次数代表 3的出现次数，使用 nums['h'] - res[8] 标记
     *       2.3.5 使用 u 的出现次数代表 4 的出现次数，使用 nums['u'] 标记
     *       2.3.6 使用 f 的出现次数代表 5 的出现次数，使用 nums['f'] - res[4] 标记
     *       2.3.7 使用 x 的出现次数代表 6 的出现次数，使用 nums['x'] 标记
     *       2.3.8 使用 v 的出现次数代表 7 的出现次数，使用 nums['v'] - res[5] 标记
     *       2.3.9 使用 g 的出现次数代表 8 的出现次数，使用 nums['g'] 标记
     *       2.3.10 使用 i 的出现次数代表 9 的出现次数，使用 nums['i'] - res[5] - res[6] - res[8] 标记
     * 3.提交记录
     *   3.1 力扣中耗时 4ms,消耗 40.6MB 内存
     *   3.2 leetcode 中耗时 3ms,消耗 39.7MB 内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 define two array to store calculate result
     *     2.2 circulate string, statistic character count and put to count array
     *     2.3 statistic number appearance by characteristics of the characters
     *         2.3.1 zero count with characteristics of 'z', mark appearance with nums[0]
     *         2.3.2 one count with characteristics of 'o', mark appearance with nums['o'] - res[2] - res[4]
     *         2.3.3 two count with characteristics of 'w', mark appearance with nums['w']
     *         2.3.4 three count with characteristics of 'h', mark appearance with nums['h'] - res[8]
     *         2.3.5 four count with characteristics of 'u', mark appearance with nums['u']
     *         2.3.6 five count with characteristics of 'f', mark appearance with nums['f'] - res[4]
     *         2.3.7 six count with characteristics of 'x', mark appearance with nums['x']
     *         2.3.8 seven count with characteristics of 'v', mark appearance with nums['v'] - res[5]
     *         2.3.9 eight count with characteristics of 'g', mark appearance with nums['g']
     *         2.3.10 nine count with characteristics of 'i', mark appearance with nums['i'] - res[5] - res[6] - res[8]
     *     2.4 circulate appearance array, append index and return
     * 3.About submit record
     *     3.1 4ms and 40.6MB memory in LeetCode China
     *     3.2 3ms and 39.7MB memory in LeetCode
     * 4.Q&A
     * @param s
     * @return
     */
    public String originalDigits(String s) {
        int[] nums = new int[123];
        for(char ch : s.toCharArray()){
            nums[ch]++;
        }
        int[] res = new int[10];
        res[0] = nums[122];
        res[2] = nums[119];
        res[4] = nums[117];
        res[6] = nums[120];
        res[8] = nums[103];
        res[1] = nums[111] - res[0] - res[2] - res[4];
        res[3] = nums[104] - res[8];
        res[5] = nums[102] - res[4];
        res[7] = nums[118] - res[5];
        res[9] = nums[105] - res[5] - res[6] - res[8];
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < res[i]; j++){
                builder.append(i);
            }
        }
        return builder.toString();
    }
}
