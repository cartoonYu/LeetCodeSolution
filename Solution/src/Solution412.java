import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Problem
 *     412.Fizz Buzz
 *     https://leetcode.com/problems/fizz-buzz/
 *     https://leetcode-cn.com/problems/fizz-buzz/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution412 {

    /**
     * 1. 关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(1)
     * 2. 我的解题思路
     *     2.1 循环1到n，按照题目意思加上字符串
     * 3. 提交记录
     *     3.1 力扣中耗时3ms,消耗42.8MB内存
     *     3.2 leetcode中耗时1ms,消耗38.9MB内存
     * 4. Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 circulate 1 to n,add string with topic mean
     * 3.About submit record
     *     3.1 3ms and 42.8MB memory in LeetCode China
     *     3.2 1ms and 38.9MB memory in LeetCode
     * 4.Q&A
     *
     * @param n
     * @return
     */
    public List<String> fizzBuzz(int n) {
        if(n==0){
            return Collections.emptyList();
        }
        List<String> res=new LinkedList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0&&i%5==0){
                res.add("FizzBuzz");
            }
            else if(i%3==0){
                res.add("Fizz");
            }
            else if(i%5==0){
                res.add("Buzz");
            }
            else{
                res.add(Integer.toString(i));
            }
        }
        return res;
    }
}
