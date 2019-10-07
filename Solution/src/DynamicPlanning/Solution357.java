package DynamicPlanning;

/**
 * Problem
 *      357. Count Numbers with Unique Digits
 *      https://leetcode.com/problems/count-numbers-with-unique-digits/
 *      https://leetcode-cn.com/problems/count-numbers-with-unique-digits/
 * Grade of difficulty
 *      Medium
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution357 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 当n比较小,尝试去计算
     *         2.1.1 n=1,result=10
     *         2.1.2 n=2,result=81
     *         2.1.3 n=3,result=739
     *     2.2 通过2.1的尝试，我得出一个规律
     *         2.2.1 当n=1,temp=9,result=10
     *         2.2.2 temp=temp*(10-i+1),result+=temp
     *     2.3 使用一个2到n的循环计算最终值
     * 3.提交记录
     *     3.1 力扣中耗时0ms,消耗33.1MB内存
     *     3.2 leetcode中耗时0ms,消耗31.8MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 tempt to calculate when n is low what result is
     *          2.1.1 n=1,result=10
     *          2.1.2 n=2.result=81
     *          2.1.3 n=3,result=739
     *     2.2 so I search for solution's rules
     *          2.2.1 when n=1,temp=9,result=10
     *          2.2.2 temp=temp*(10-i+1),result+=temp
     *     2.3 use a 2 to n circulation to calculate temp and result
     * 3.About submit record
     *     3.1 0ms and 33.1MB memory in LeetCode China
     *     3.2 0ms and 31.8MB memory in LeetCode
     * 4.Q&A
     *
     * @param n
     * @return
     */
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0){
            return 1;
        }
        if(n==1){
            return 10;
        }
        int temp=9;
        int sum=10;
        for(int i=2;i<=n;i++){
            temp=temp*(10-i+1);
            sum+=temp;
        }
        return sum;
    }
}
