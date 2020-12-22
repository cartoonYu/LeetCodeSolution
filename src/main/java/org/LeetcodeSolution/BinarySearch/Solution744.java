package org.LeetcodeSolution.BinarySearch;

/**
 * Problem
 *     744.Find Smallest Letter Greater Than Target
 *     https://leetcode.com/problems/find-smallest-letter-greater-than-target/
 *     https://leetcode-cn.com/problems/find-smallest-letter-greater-than-target/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution744 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(log n)
     *   1.2 空间负责度为 O(1)
     * 2.我的解题思路
     *   2.1 这个解法基于二分查找
     *   2.2 遍历数组，有两种情况
     *        2.2.1 当前字母小于等于 target，移动左边界
     *        2.2.2 当前字母大于 target，而且左侧字母小于 target，这种情况符合题意，返回当前字母
     *        2.2.3 其余情况，移动右边界
     * 3.提交记录
     *   3.1 力扣中耗时0ms,消耗38.9MB内存
     *   3.2 leetcode中耗时0ms,消耗37.6MB内存
     * 4. Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(log n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 this solution is base on binary search
     *     2.2 circulate array,there have two condition
     *         2.2.1 current letter is smaller or equals target,move left border
     *         2.2.2 current letter is bigger than target and its left letter is smaller than target,this condition is accord with topic,return current letter
     *         2.2.3 other condition,move right border
     * 3.About submit record
     *     3.1 0ms and 38.9MB memory in LeetCode China
     *     3.2 0ms and 37.6MB memory in LeetCode
     * 4.Q&A
     *
     * @param letters
     * @param target
     * @return
     */
    public char nextGreatestLetterByBinarySearch(char[] letters, char target) {
        char res = letters[0];
        int i = 1, j = letters.length - 1, mid;
        while (i <= j) {
            mid = i + ((j - i) >> 1);
            if (letters[mid] <= target) {
                i = mid + 1;
            } else {
                if (letters[mid - 1] <= target) {
                    res = letters[mid];
                    break;
                } else {
                    j = mid - 1;
                }
            }
        }
        return res;
    }

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(n)
     *   1.2 空间负责度为 O(1)
     * 2.我的解题思路
     *   2.1 定义一个结果变量，并设值为数组的首字母
     *   2.2 遍历数组，有两个情况
     *        2.2.1 当前字母小于等于 target，跳过
     *        2.2.2 当前字母大于 target，将 2.1 变量设为当前字母并返回
     * 3.提交记录
     *   3.1 力扣中耗时0ms,消耗38.7MB内存
     *   3.2 leetcode中耗时0ms,消耗39MB内存
     * 4. Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 set a result variable with letters's first letter
     *     2.2 circulate array,with two condition
     *         2.2.1 current letter is smaller or equals to target,skip
     *         2.2.2 current letter is bigger than target,set current letter to result and return
     * 3.About submit record
     *     3.1 0ms and 38.7MB memory in LeetCode China
     *     3.2 0ms and 39MB memory in LeetCode
     * 4.Q&A
     *
     * @param letters
     * @param target
     * @return
     */
    public char nextGreatestLetterByCirculate(char[] letters, char target) {
        char res = letters[0];
        for (char temp : letters) {
            if (target < temp) {
                res = temp;
                break;
            }
        }
        return res;
    }
}
