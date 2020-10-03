package org.LeetcodeSolution.SQL;

/**
 * Problem
 *     176.Second Highest Salary
 *     https://leetcode.com/problems/second-highest-salary/submissions/
 *     https://leetcode-cn.com/problems/second-highest-salary/submissions/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution176 {

    /**
     * 1. 关于复杂度
     *   1.1 时间复杂度为N/A
     *   1.2 空间负责度为N/A
     * 2. 我的解题思路
     *   2.1 降序排列所有记录
     *   2.2 用limit关键字取出第二高薪水
     *   2.3 主sql语句在内层则为了防止null情况的发生
     * 3. 提交记录
     *   3.1 力扣中耗时109ms,消耗N/A内存
     *   3.2 leetcode中耗时152ms,消耗N/A内存
     * 4. Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is N/A
     *     1.2 Space Complexity is N/A
     * 2.how I solve
     *     2.1 order by all record desc
     *     2.2 get the second salary by limit
     *     2.3 main sql in inner floor which is prevent null
     * 3.About submit record
     *     3.1 109ms and N/A memory in LeetCode China
     *     3.2 152ms and N/A memory in LeetCode
     * 4.Q&A
     */
    public void solution2(){
        //select (select distinct Salary from Employee order by Salary desc limit 1,1) SecondHighestSalary;
    }

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为N/A
     *   1.2 空间负责度为N/A
     * 2.我的解题思路
     *   2.1 内层取出最高的薪水
     *   2.2 外层取出比2.1的薪水小的最大薪水
     * 3.提交记录
     *   3.1 力扣中耗时ms,消耗MB内存
     *   3.2 leetcode中耗时ms,消耗MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is N/A
     *     1.2 Space Complexity is N/A
     * 2.how I solve
     *     2.1 get the top salary in inner floor
     *     2.2 get the top salary which is smaller than 2.1 salary in outer floor
     * 3.About submit record
     *     3.1 110ms and N/A memory in LeetCode China
     *     3.2 138ms and N/A memory in LeetCode
     * 4.Q&A
     */
    public void solution1(){
        //select max(Salary) as SecondHighestSalary from Employee where Salary<(select max(Salary) from Employee);
    }
}
