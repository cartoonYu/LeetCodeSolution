package SQL;

/**
 * Problem
 *      182. Duplicate Emails
 *      https://leetcode.com/problems/duplicate-emails/
 * Grade of difficulty
 *      Easy
 * Related topics
 *
 * @author cartoon
 * @version 1.0
 */
public class Solution182 {

    /**
     *
     * 381ms and N/A memory in LeetCode China
     * 413ms and MB N/A in LeetCode
     */
    public void solution1(){
        //select distinct a.Email from Person as a,Person as b where a.Email=b.Email and a.Id!=b.Id;
    }

    /**
     *
     * 535ms and N/A memory in LeetCode China
     * 212ms and N/A memory in LeetCode
     */
    public void solution2(){
        //select Email from Person group by Email having count(Email)>1;
    }
}
