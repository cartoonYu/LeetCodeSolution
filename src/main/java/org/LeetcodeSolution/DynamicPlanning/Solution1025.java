package org.LeetcodeSolution.DynamicPlanning;

/**
 * Problem
 *     1025.Divisor Game
 *     https://leetcode.com/problems/divisor-game/
 *     https://leetcode-cn.com/problems/divisor-game/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution1025 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(1)
     *   1.2 空间负责度为 O(1)
     * 2.我的解题思路
     *   2.1 当 N 为偶数，总是有一个数能与 N 整除，所以我们只需要判断 N 是否为偶数即可
     * 3.提交记录
     *   3.1 力扣中耗时 0ms,消耗 36.2MB 内存
     *   3.2 leetcode 中耗时 0ms,消耗 36.2MB 内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(1)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 when N is even number, there always have one element which N remind is 0, so we only need to judge N is even number
     * 3.About submit record
     *     3.1 0ms and 36.2MB memory in LeetCode China
     *     3.2 0ms and 36.2MB memory in LeetCode
     * 4.Q&A
     * @param N
     * @return
     */
    public boolean divisorGame2(int N) {
        return N % 2== 0;
    }

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(n)
     *   1.2 空间负责度为 O(n)
     * 2.我的解题思路
     *   2.1 定义一个数组存储计算结果
     *   2.2 强定义初始值
     *       2.2.1 当 N = 1，没有符合条件的数字，结果为 false
     *       2.2.2 当 N = 2，1 是符合条件的数字，结果为false
     *   2.3 双重循环计算结果。主循环为 3 到 N，次循环为 1 到当前数字，若主循环元素取余次循环元素为 0，且上一（索引为次循环元素 - 主循环元素）元素，结果为true
     * 3.提交记录
     *   3.1 力扣中耗时 5ms,消耗 36.7MB 内存
     *   3.2 leetcode 中耗时 4ms,消耗 36.4MB 内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 define a array to store calculate result
     *     2.2 set initial value
     *         2.2.1 when N = 1, there have no eligible number, result is false
     *         2.2.2 when N = 2, 1 is the eligible number, result is true
     *     2.3 double circulation, circulate 3 to N, minor circulation is circulate 1 to current number,
     *         when major number % minor number is 0 and last(major number - minor number) element, result is true
     * 3.About submit record
     *     3.1 5ms and 36.7MB memory in LeetCode China
     *     3.2 4ms and 36.4MB memory in LeetCode
     * 4.Q&A
     *
     * @param N
     * @return
     */
    public boolean divisorGame1(int N) {
        if(N == 1){
            return false;
        }
        boolean[] res = new boolean[N + 1];
        res[1] = false;
        res[2] = true;
        for(int i = 3; i <= N; i++){
            res[i] = false;
            for(int j = 1; j < i; j++){
                if(i % j == 0 && !res[i - j]){
                    res[i] = true;
                    break;
                }
            }
        }
        return res[N];
    }
}
