/**
 * Problem
 *      860.Lemonade Change
 *      https://leetcode.com/problems/lemonade-change/
 * Grade of difficulty
 *      Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution860 {

    /**
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
