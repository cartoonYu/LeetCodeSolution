/**
 * Problem
 *      507.Perfect Number
 *      https://leetcode.com/problems/perfect-number/
 *      https://leetcode-cn.com/problems/perfect-number/
 * Grade of difficulty
 *      Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution507 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 根据题意，当n<2时返回false
     *     2.2 使用三指针
     *         2.2.1 res,记录计算结果
     *         2.2.2 i,遍历指针
     *         2.2.3 border,循环终止条件,它的值为Math.sqrt(num)
     *     2.3 循环判断以及将res置为合条件的值
     * 3.提交记录
     *     3.1 力扣中耗时4ms,消耗32.6MB内存
     *     3.2 leetcode中耗时1ms,消耗33MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 according to topic,we find it's false when n<2
     *     2.2 use three integer
     *              2.2.1 res,cache plus result
     *              2.2.2 i,circulate variable
     *              2.2.3 border,condition of circulation,its value is Math.sqrt(num)
     *     2.3 circulate to judge and put eligible result to res
     * 3.About submit record
     *     3.1 4ms and 32.6MB memory in LeetCode China
     *     3.2 1ms and 33MB memory in LeetCode
     * 4.Q&A
     * @param num
     * @return
     */
    public boolean checkPerfectNumber(int num) {
        if(num<2){
            return false;
        }
        int res=1,i=2;
        double border=Math.sqrt(num);
        while(i<border){
            if(num%i==0){
                res+=i+num/i;
            }
            i++;
        }
        if(i*i==num){
            res+=i;
        }
        return res==num;
    }
}
