package Array;

/**
 * Problem
 *     1351. Count Negative Numbers in a Sorted Matrix
 *     https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
 *     https://leetcode-cn.com/problems/count-negative-numbers-in-a-sorted-matrix/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution1351 {

    /**
     * 1. 关于复杂度
     *   1.1 时间复杂度为 O(mlog(n))
     *   1.2 空间负责度为 O(1)
     * 2. 我的解题思路
     *   2.1 逐行遍历矩阵
     *   2.2 如果当前行第一个元素为负数，直接将该行的长度添加到结果中
     *   2.3 二分查找每一行，会有三个情况
     *       2.3.1 中间元素为正数，移动左边界
     *       2.3.2 中间元素为负数
     *             2.3.2.1 前一元素为正数，添加结果
     *             2.3.2.2 前一元素为负数，移动右边界
     * 3. 提交记录
     *   3.1 力扣中耗时 0 ms,消耗 39.9MB 内存
     *   3.2 leetcode中耗时 0 ms,消耗 40.3MB 内存
     * 4. Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(mlog(n))
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 circulate matrix by row
     *     2.2 if first element is negative, add length to result and circulate next row
     *     2.3 binary search each row, there have three condition
     *         2.3.1 middle element is positive, move left border
     *         2.3.2 middle element is negative,
     *               2.3.2.1 previous element is positive, add to result
     *               2.3.2.2 previous element is negative, move right border
     * 3.About submit record
     *     3.1 0ms and 39.9MB memory in LeetCode China
     *     3.2 0ms and 40.3MB memory in LeetCode
     * 4.Q&A
     *
     * @param grid
     * @return
     */
    public int countNegatives(int[][] grid) {
        if(grid == null || grid.length == 0){
            return 0;
        }
        int res = 0;
        int mid;
        int left;
        int right;
        for(int i = 0, length = grid.length; i < length; i++){
            int[] tempArr = grid[i];
            if(tempArr[0] < 0){
                res += tempArr.length;
                continue;
            }
            left = 0;
            right = tempArr.length;
            while(left < right){
                mid = left + ((right - left) >> 1);
                if(tempArr[mid] >= 0){
                    left = mid + 1;
                } else{
                    if(mid > 0 && tempArr[mid - 1] >= 0){
                        res += tempArr.length - mid;
                        break;
                    }
                    right = mid;
                }
            }
        }
        return res;
    }

}
