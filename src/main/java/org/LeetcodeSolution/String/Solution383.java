package org.LeetcodeSolution.String;

/**
 * Problem
 *      383.Ransom Note
 *      https://leetcode.com/problems/ransom-note/
 *      https://leetcode-cn.com/problems/ransom-note/
 * Grade of difficulty
 *      Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution383 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(n)
     *   1.2 空间负责度为 O(n)
     * 2.我的解题思路
     *   2.1 定义长度为 26 位的数组存储杂志字符串含有的字符
     *   2.2 循环遍历杂志字符串填充 2.1 数组
     *   2.3 遍历赎金信字符串
     *       2.3.1 计算并检查当前字符个数是否为 0 并自减出现的次数
     * 3.提交记录
     *   3.1 力扣中耗时 6ms,消耗 45.2MB 内存
     *   3.2 leetcode 中耗时 2ms,消耗 38.2MB 内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 define an array of length 26 to cache magazine's character and its corresponding appearance time
     *     2.2 circulate magazine to put appearance time to array
     *     2.3 circulate ransomNote
     *              2.3.1 calculate index of array
     *              2.3.2 check array's value whether it equals 0
     *              2.3.3 subtract corresponding appearance time
     * 3.About submit record
     *     3.1 6ms and 45.2MB memory in LeetCode China
     *     3.2 2ms and 38.2MB memory in LeetCode
     * 4.Q&A
     *     4.1 Q:Why array3 solution's time Complexity is smaller than array1'solution?
     *         A:I think the difference is reflected in the second circulation,array3's only calculate index one time,but array1's calculate two time
     * @param ransomNote
     * @param magazine
     * @return
     */
    public boolean canConstructByArray3(String ransomNote, String magazine) {
        if (ransomNote == null) {
            return true;
        }
        if (magazine == null) {
            return false;
        }
        int[] nums = new int[26];
        for (char temp : magazine.toCharArray()) {
            nums[temp - 'a']++;
        }
        for (char temp : ransomNote.toCharArray()) {
            int index = temp - 'a';
            if (nums[index] == 0) {
                return false;
            } else {
                nums[index]--;
            }
        }
        return true;
    }
}
