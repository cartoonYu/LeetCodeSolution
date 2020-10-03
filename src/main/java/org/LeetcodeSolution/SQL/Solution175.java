package org.LeetcodeSolution.SQL;

/**
 * Problem
 *     175.Combine Two Tables
 *     https://leetcode.com/problems/combine-two-tables/
 *     https://leetcode-cn.com/problems/combine-two-tables/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution175 {

    /**
     * 1. 关于复杂度
     *     None
     * 2. 我的解题思路
     *     2.1 根据题意，必须返回所有人的信息，所以用Person表左连接address表
     * 3. 提交记录
     *     3.1 力扣中耗时353ms
     *     3.2 leetcode中耗时204ms
     * 4. Q&A
     *
     * 1.About Complexity
     *     None
     * 2.how I solve
     *     2.1 according to topic,result must have all person information,so use person table left join address table
     * 3.About submit record
     *     3.1 353ms in LeetCode China
     *     3.2 204ms in LeetCode
     * 4.Q&A
     */
    public void solution(){
        //select p.FirstName,p.LastName,a.City,a.State from Person as p left join Address as a on p.PersonId=a.PersonId;
    }
}
