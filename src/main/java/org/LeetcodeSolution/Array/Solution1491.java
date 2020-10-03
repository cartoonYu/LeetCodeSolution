package org.LeetcodeSolution.Array;

/**
 * Problem
 *     1491.Average Salary Excluding the Minimum and Maximum Salary
 *     https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
 *     https://leetcode-cn.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution1491 {

    /**
     * 1. 关于复杂度
     *   1.1 时间复杂度为 O(n)
     *   1.2 空间负责度为 O(1)
     * 2. 我的解题思路
     *   2.1 定义三个临时变量分别存储最大值，最小值，以及累加结果
     *   2.2 循环遍历数组，对比交换最大与最小值，累加结果
     *   2.3 用累加的结果减去最大与最小值，除以数组长度 - 2并返回
     * 3. 提交记录
     *   3.1 力扣中耗时 0ms,消耗 37.1MB 内存
     *   3.2 leetcode 中耗时 0ms,消耗 38.7MB 内存
     * 4. Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 define three temp variable, which are store maximum, minimum and cumulative result
     *     2.2 circulate salary, compare and swap maximum and minimum variable, accumulate element to temp variable
     *     2.3 cumulative result subtract maximum and minimum variable, divide array's length - 2 and return
     * 3.About submit record
     *     3.1 0ms and 37.1MB memory in LeetCode China
     *     3.2 0ms and 38.7MB memory in LeetCode
     * 4.Q&A
     * @param salary
     * @return
     */
    public double average(int[] salary) {
        int max = salary[0];
        int min = salary[0];
        int res = 0;
        for(int tempSalary : salary){
            if(max < tempSalary){
                max = tempSalary;
            } else if(min > tempSalary){
                min = tempSalary;
            }
            res += tempSalary;
        }
        return (res - min - max) * 1.0 / (salary.length - 2);
    }

}
