/**
 * Problem
 *     204.Count Primes
 *     https://leetcode.com/problems/count-primes/
 *     https://leetcode-cn.com/problems/count-primes/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution204 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n^2)
     *     1.2 空间负责度为O(n)
     * 2.我的解题思路
     *     2.1 这个算法基于埃拉托斯特尼筛法
     *     2.2 定义一个boolean数组记录是否为素数
     *     2.3 循环遍历数组，判断marker，将marker的所有倍数的值设为true
     * 3.提交记录
     *     3.1 力扣中耗时29ms,消耗36.8MB内存
     *     3.2 leetcode中耗时13ms,消耗34.3MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n^2)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 this solution is base on eratosthenes
     *     2.2 define a array cache whether it is prime
     *     2.3 circulate array,check current mark,mark its multiple as true
     * 3.About submit record
     *     3.1 29ms and 36.8MB memory in LeetCode China
     *     3.2 13ms and 34.3MB memory in LeetCode
     * 4.Q&A
     *
     * @param n
     * @return
     */
    public int countPrimes(int n) {
        int res=0;
        boolean[] marker=new boolean[n+1];
        for(int i=2;i<n;i++){
            if(!marker[i]){
                res++;
                for(int j=2;j*i<n;j++){
                    marker[i*j]=true;
                }
            }
        }
        return res;
    }
}
