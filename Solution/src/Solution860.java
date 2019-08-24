/**
 * Problem
 *      860.Lemonade Change
 *      https://leetcode.com/problems/lemonade-change/
 *      https://leetcode-cn.com/problems/lemonade-change/
 * Grade of difficulty
 *      Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution860 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 循环遍历数组，有如下返回false的情况
     *         2.1.1 num为10，但是没有5块可以找还
     *         2.1.2 num为20，但是没有5块或10块可以找还
     *     2.2 如果没有2.1列举的情况，返回true
     * 3.提交记录
     *     3.1 力扣中耗时3ms,消耗46.8MB内存
     *     3.2 leetcode中耗时1ms,消耗40.1MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 foreach array to Determine if the following occurs
     *         2.1.1 num is 10,but have no 5 to change
     *         2.1.2 num is 20,but have no 5 and 10 or no 5 to change
     *     2.2 if have no above case,return true
     * 3.About submit record
     *     3.1 3ms and 46.8MB memory in LeetCode China
     *     3.2 1ms and 40.1MB memory in LeetCode
     * 4.Q&A
     * @param bills
     * @return
     */
    public boolean lemonadeChange(int[] bills) {
        if(bills.length==0){
            return true;
        }
        int five=0,ten=0;
        for(int temp:bills){
            switch(temp){
                case 5:{
                    five++;
                    break;
                }
                case 10:{
                    if(five==0){
                        return false;
                    }
                    five--;
                    ten++;
                    break;
                }
                case 20:{
                    if(ten>0&&five>0){
                        ten--;
                        five--;
                    }
                    else{
                        if(five>2){
                            five-=3;
                        }
                        else{
                            return false;
                        }
                    }
                    break;
                }
            }
        }
        return true;
    }
}
