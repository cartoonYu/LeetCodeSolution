package org.LeetcodeSolution.Array;

/**
 * Problem
 *     1550.Three Consecutive Odds
 *     https://leetcode.com/problems/three-consecutive-odds/
 *     https://leetcode-cn.com/problems/three-consecutive-odds/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution1550 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(n)
     *   1.2 空间负责度为 O(1)
     * 2.我的解题思路
     *   2.1 循环遍历数组，存在两种情况
     *       2.1.1 当前元素为奇数，循环遍历包括当前的三个元素，若三个元素都为奇数，返回 true
     *       2.1.2 当前元素为偶数，继续往下遍历
     * 3.提交记录
     *   3.1 力扣中耗时 0ms,消耗 38.2MB 内存
     *   3.2 leetcode 中耗时 0ms,消耗 38.6MB 内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 circulate array, there have two condition
     *         2.1.1 current element is odd number, circulate current next three elements, if both threes is odd number, return true
     *         2.1.2 current element is even number, keep circulate
     * 3.About submit record
     *     3.1 0ms and 38.2MB memory in LeetCode China
     *     3.2 0ms and 38.6MB memory in LeetCode
     * 4.Q&A
     * @param arr
     * @return
     */
    public boolean threeConsecutiveOdds(int[] arr) {
        int length = arr.length;
        if(length < 3){
            return false;
        }
        int board, cnt;
        for(int index = 0; index < length;){
            if(arr[index] % 2 == 0){
                index++;
            } else if(index > length - 3){
                break;
            } else{
                cnt = 0;
                board = index + 3;
                while(index < board && index < length){
                    if(arr[index] % 2 == 0){
                        break;
                    } else{
                        cnt++;
                        index++;
                    }
                }
                if(cnt == 3){
                    return true;
                }
            }
        }
        return false;
    }
}
