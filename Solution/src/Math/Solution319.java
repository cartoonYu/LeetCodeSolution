package Math;

/**
 * Problem
 *     319.Bulb Switcher
 *     https://leetcode.com/problems/bulb-switcher/
 *     https://leetcode-cn.com/problems/bulb-switcher/
 * Grade of difficulty
 *     Medium
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution319 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(sqrt(n))
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 in a word,there have a rule
     *     2.2 reckon from 1 to 16,it will appearance a rule:Math.sqrt(n)
     * 3.About submit record
     *     3.1 0ms and 32.9MB memory in LeetCode China
     *     3.2 0ms and 33MB memory in LeetCode
     * 4.Q&A
     * @param n
     * @return
     */
    public int findRuleWithBulbSwitch(int n) {
        return (int)Math.sqrt(n);
    }

    /**
     * 标注一下：这个中文解法只是模拟操作灯的亮灭，并没有通过所有测试用例，但是这个解法是 pass 的解法的基础
     * 1. 关于复杂度
     *   1.1 时间复杂度为O(n^2)
     *   1.2 空间负责度为O(1)
     * 2. 我的解题思路
     *   2.1 循环1到n盏灯，根据计算结果独立改变每一盏灯的状态
     *       2.1.1 循环1到当前灯的索引，计算灯索引以及当前循环的变量的取余值，如果结果为0，临时变量自增
     *       2.1.2 如果临时变量能取余2，这盏灯最后会是开启的状态
     * 3. 提交记录
     *   3.1 力扣中N/A
     *   3.2 leetcode中N/A
     * 4. Q&A
     *
     * notice:this solution haven't pass all test case,but it's a train of thought
     * 1.About Complexity
     *     1.1 Time Complexity is O(n^2)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 circulate 1 to n
     *         2.1.1 circulate 1 to current index,calculate outer index%inner index,if result is 0,add cache integer
     *         2.1.2 if cache integer mod 2 remind 0,light is on
     * 3.About submit record
     *     3.1 N/A in LeetCode China
     *     3.2 N/A in LeetCode
     * 4.Q&A
     * @param n
     * @return
     */
    public int conventionalBulbSwitch(int n) {
        if(n==0){
            return 0;
        }
        int res=0,temp;
        for(int i=1;i<=n;i++){
            temp=0;
            for(int j=1;j<i;j++){
                if(i%j==0){
                    temp++;
                }
            }
            if(temp%2==0){
                res++;
            }
        }
        return res;
    }
}
