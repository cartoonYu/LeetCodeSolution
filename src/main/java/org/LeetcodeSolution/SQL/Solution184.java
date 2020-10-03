package org.LeetcodeSolution.SQL;

/**
 * Problem
 *     184.Department Highest Salary
 *     https://leetcode.com/problems/department-highest-salary/
 *     https://leetcode-cn.com/problems/department-highest-salary/
 * Grade of difficulty
 *     Medium
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution184 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为N/A
     *   1.2 空间负责度为N/A
     * 2.我的解题思路
     *   2.1 选择薪水最高的记录
     *   2.2 inner join两个表
     * 3.提交记录
     *   3.1 力扣中耗时513ms
     *   3.2 leetcode中耗时1394ms
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is N/A
     *     1.2 Space Complexity is N/A
     * 2.how I solve
     *     2.1 select max salary first
     *     2.2 inner join two table
     * 3.About submit record
     *     3.1 513ms in LeetCode China
     *     3.2 1394ms in LeetCode
     * 4.Q&A
     */
    public void solution(){
        //select d.Name Department,e.Name Employee,e.Salary from Department d inner join Employee e on d.Id=e.DepartmentId and e.Salary>=(select max(Salary) from Employee where DepartmentId=d.Id);
    }
}
