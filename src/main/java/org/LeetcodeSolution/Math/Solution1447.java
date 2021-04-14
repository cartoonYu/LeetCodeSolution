package org.LeetcodeSolution.Math;

import java.util.LinkedList;
import java.util.List;

/**
 * Problem
 *     1447.Simplified Fractions
 *     https://leetcode.com/problems/simplified-fractions/
 *     https://leetcode-cn.com/problems/simplified-fractions/
 *     https://github.com/cartoonYu/LeetCodeSolution/blob/solution/src/main/java/org/LeetcodeSolution/Math/Solution1447.java
 * Grade of difficulty
 *     Medium
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution1447 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(n^2)
     *   1.2 空间负责度为 O(1)
     * 2.我的解题思路
     *   2.1 外层循环 1 到 n-1，内层循环 1 到 n，利用分母取余分子不断减小分母的值，若减小到最后分母为 1，添加到结果集后返回
     * 3.提交记录
     *   3.1 力扣中耗时 28ms,消耗 39.2MB 内存
     *   3.2 leetcode 中耗时 19ms,消耗 39.5MB 内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n^2)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 circulate 1 to n - 1 and inner circulate 1 to n, subtract denominator by remind molecular，if subtract is 1, add and return
     * 3.About submit record
     *     3.1 28ms and 39.2MB memory in LeetCode China
     *     3.2 19ms and 39.5MB memory in LeetCode
     * 4.Q&A
     * @param n
     * @return
     */
    public List<String> simplifiedFractions(int n) {
        List<String> res = new LinkedList<>();
        for(int index1 = 1; index1 < n; index1++){
            for(int index2 = index1 + 1; index2 <= n; index2++){
                if(subtract(index1, index2) == 1){
                    res.add(index1 + "/" + index2);
                }
            }
        }
        return res;
    }

    private int subtract(int num1, int num2){
        if(num2 == 0){
            return num1;
        }
        return subtract(num2, num1 % num2);
    }

}
