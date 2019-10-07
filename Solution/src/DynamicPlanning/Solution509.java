package DynamicPlanning;

/**
 * Problem
 *      509.Fibonacci Number
 *      https://leetcode.com/problems/fibonacci-number/
 *      https://leetcode-cn.com/problems/fibonacci-number/
 * Grade of difficulty
 *      Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution509 {

    private int[] nums;

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(n)
     * 2.我的解题思路
     *     2.1 这个解法基于备忘录动态规划实现
     *     2.2 因为0 ≤ N ≤ 30,所以我定义了一个长度为30的数组
     *     2.3 定义一个终止条件nums[N]!=0或者N==0||N==1
     *     2.4 根据公式nums[N]=fib(N-1)+fib(N-2)利用递归计算nums[i]的值
     * 3.提交记录
     *     3.1 力扣中耗时0ms,消耗32.5MB内存
     *     3.2 leetcode中耗时0ms,消耗31.7MB内存
     * 4.Q&A
     *
     * 作者：cartoon
     * 链接：https://leetcode-cn.com/problems/two-sum/solution/bei-wang-lu-shi-dong-tai-gui-hua-qiu-jie-by-cartoo/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 this solution is base on memo dynamic planning
     *     2.2 cause 0 ≤ N ≤ 30,so I define a array whose length is 31
     *     2.3 define a end condition nums[N]!=0 or N==0||N==1 to stop recursion
     *     2.4 cal nums[i] with a recursion nums[N]=fib(N-1)+fib(N-2);
     *         (cause every value of array are recorded,so it can greatly shorten cal's time)
     *     2.5 return nums[N]
     * 3.About submit record
     *     3.1 0ms and 32.5MB memory in LeetCode China
     *     3.2 0ms and 31.7MB memory in LeetCode
     * 4.Q&A
     * @param N
     * @return
     */
    public int fib(int N) {
        if(nums[N]!=0){
            return nums[N];
        }
        if(N==0||N==1){
            return N;
        }
        nums[N]=fib(N-1)+fib(N-2);
        return nums[N];
    }

    public Solution509(){
        nums=new int[31];
    }

}
