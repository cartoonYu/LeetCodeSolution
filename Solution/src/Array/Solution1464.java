package Array;

/**
 * Problem
 *     1464.Maximum Product of Two Elements in an Array
 *     https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
 *     https://leetcode-cn.com/problems/maximum-product-of-two-elements-in-an-array/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution1464 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(n)
     *   1.2 空间负责度为 O(1)
     * 2.我的解题思路
     *   2.1 因为传入数组所有元素都大于 0，所以我们找出最大的两个元素并相乘就是结果
     * 3.提交记录
     *   3.1 力扣中耗时 0ms,消耗 39.8MB 内存
     *   3.2 leetcode 中耗时 0ms,消耗 39.5MB 内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 cause all element are bigger than zero, so we can find out two maximum element and multipart them and this is result
     * 3.About submit record
     *     3.1 0ms and 39.8MB memory in LeetCode China
     *     3.2 0ms and 39.5MB memory in LeetCode
     * 4.Q&A
     *
     * @param nums
     * @return
     */
    public int maxProduct(int[] nums) {
        int num1 = 0, num2 = 0;
        for(int num : nums){
            if(num > num1){
                num2 = num1;
                num1 = num;
            } else if(num > num2){
                num2 = num;
            }
        }
        return (num1 - 1) * (num2 - 1);
    }

}
