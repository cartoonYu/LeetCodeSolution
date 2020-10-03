package org.LeetcodeSolution.Array;

/**
 * Problem
 *     1299. Replace Elements with Greatest Element on Right Side
 *     https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/submissions/
 *     https://leetcode-cn.com/problems/replace-elements-with-greatest-element-on-right-side/submissions/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution1299 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(n)
     *   1.2 空间负责度为 O(1)
     * 2.我的解题思路
     *   2.1 定义两个临时变量存储当前最大值以及当前元素
     *   2.2 倒序循环数组用最大值替换当前元素
     * 3.提交记录
     *   3.1 力扣中耗时 1ms,消耗 41MB 内存
     *   3.2 leetcode 中耗时 1ms,消耗 40.8MB 内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 define a temp variable to store current maximum element
     *     2.2 define a temp variable to store current element
     *     2.3 inverted order circulate and replace current element with maximum element
     * 3.About submit record
     *     3.1 1ms and 41MB memory in LeetCode China
     *     3.2 1ms and 40.8MB memory in LeetCode
     * 4.Q&A
     * @param arr
     * @return
     */
    public int[] replaceElements(int[] arr) {
        if(arr == null || arr.length == 0){
            return arr;
        }
        int max = -1;
        int temp;
        for(int i = arr.length - 1; i >= 0; i--){
            temp = arr[i];
            arr[i] = max;
            if(max < temp){
                max = temp;
            }
        }
        return arr;
    }
}
