package Math;

/**
 * Problem
 *      367. Valid Perfect Square
 *      https://leetcode.com/problems/valid-perfect-square/
 * Grade of difficulty
 *      Easy
 * Related topics
 *      153.Find Minimum in Rotated Sorted Array
 *      154.Find Minimum in Rotated Sorted Array II
 *      167.Two Sum II - Input array is sorted
 *      374.Guess Number Higher or Lower
 * @author cartoon
 * @version 1.0
 */
public class Solution367 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(log n)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 这个解法基于二分查找思想，而采用二分的原因是如果一个数字是完全平方数，他的开方必然小于等于他的一半
     *     2.2 使用二分查找去试探获得平方数
     *         2.2.1 计算中位数
     *         2.2.2 用原数对比中位数*中位数
     * 3.提交记录
     *     3.1 力扣中耗时1ms,消耗33.1MB内存
     *     3.2 leetcode中耗时0ms,消耗32MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(log n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 this solution is base on binary search,because if the num has square,the square must smaller than num/2
     *     2.2 define two pointer left and right where index in 0 and num
     *     2.2 use a binary search to get square
     *          2.2.1 cal the mid
     *          2.2.2 compare the mid*mid to num
     * 3.About submit record
     *     3.1 1ms and 33.1MB memory in LeetCode China
     *     3.2 0ms and 32MB memory in LeetCode
     * 4.Q&A
     *
     * @param num
     * @return
     */
    public boolean isPerfectSquare(int num) {
        if(num==1){
            return true;
        }
        if(num<4){
            return false;
        }
        long left=1;
        long right=num;
        while(left<=right){
            long mid= left+((right-left)>>1);
            long temp=mid*mid;
            if(temp<num){
                left=mid+1;
                continue;
            }
            if(temp==num){
                return true;
            }
            if(temp>num){
                right=mid-1;
            }
        }
        return false;
    }
}
