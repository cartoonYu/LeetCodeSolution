package org.LeetcodeSolution.SQL;

/**
 * Problem
 *      197.Rising Temperature
 *      https://leetcode.com/problems/rising-temperature/
 *      https://leetcode-cn.com/problems/rising-temperature/
 * Grade of difficulty
 *      Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution197 {

    /**
     * 1.我的解题思路
     *     1.1 用DATEDIFF这个函数对比recordDate
     *     1.2 对比两个日期的temperate返回符合条件的id
     * 2.提交记录
     *     2.1 力扣中耗时529ms
     *     2.2 leetcode中耗时355ms
     * 3.Q&A
     *
     * 1.how I solve
     *     1.1 use function DATEDIFF to compare recordDate
     *     1.2 compare temperate between two date and return id
     * 2.About submit record
     *     2.1 529ms in LeetCode China
     *     2.2 355ms in LeetCode
     * 3.Q&A
     */
    public void solution(){
        /**
         * select b.Id from Weather a,Weather b where b.Temperature>a.Temperature and DATEDIFF(b.RecordDate,a.RecordDate)=1;
         */
    }
}
