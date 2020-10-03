package org.LeetcodeSolution.SQL;

/**
 * Problem
 *     196.Delete Duplicate Emails
 *     https://leetcode.com/problems/delete-duplicate-emails/
 *     https://leetcode-cn.com/problems/delete-duplicate-emails/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution196 {

    /**
     * 1.关于复杂度
     *     N/A
     * 2.我的解题思路
     *     2.1 依据email分类整合为组
     *     2.2 找出各组中最小id的行
     *     2.3 删除组内除2.2行的所有行
     * 3.提交记录
     *     3.1 力扣中耗时924ms
     *     3.2 leetcode中耗时624ms
     * Q&A
     * 1.About Complexity
     *     N/A
     * 2.how I solve
     *     2.1 make group by same email
     *     2.2 find the minimum id of table
     *     2.3 delete all row except the row with minimum id
     * 3.About submit record
     *     3.1 924ms in LeetCode China
     *     3.2 624ms in LeetCode
     * 4.Q&A
     */
    public void solution1(){
        //delete from Person where Id not in (select Id from (select min(Id) as Id from Person group by Email)P);
    }

    /**
     * 1.关于复杂度
     *     N/A
     * 2.我的解题思路
     *     2.1 对比删除较大id的行
     * 3.提交记录
     *     3.1 力扣中耗时1835ms
     *     3.2 leetcode中耗时854ms
     * 4.Q&A
     *
     * 1.About Complexity
     *     N/A
     * 2.how I solve
     *     2.1 compare and delete the bigger id
     * 3.About submit record
     *     3.1 1835ms in LeetCode China
     *     3.2 854ms in LeetCode
     * 4.Q&A
     */
    public void solution2(){
        //delete p from Person p,Person p1 where p.Id>p1.Id and p.Email=p1.Email;
    }
}
