/**
 * Problem
 *      504. Base 7
 *      https://leetcode.com/problems/base-7/
 * Grade of difficulty
 *      Easy
 * Related topics
 *
 * @author cartoon
 * @version 1.0
 */
public class Solution504 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(log n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 calculate the power of num
     *     2.2 use power to circulate to subtract the num and form result
     * 3.About submit record
     *     3.1 3ms and 34.2MB memory in LeetCode China
     *     3.2 1ms and 33.2MB memory in LeetCode
     * 4.Q&A
     *
     * @param num
     * @return
     */
    public String convertToBase7(int num) {
        if(num==0){
            return "0";
        }
        StringBuilder builder=new StringBuilder();
        if(num<0){
            builder.append("-");
            num=-num;
        }
        int power=0;
        while(Math.pow(7,power)<=num){
            power++;
        }
        for(int i=power-1;i>=0;i--){
            int flag=(int)Math.pow(7,i);
            int temp=0;
            while(num>=flag){
                num-=flag;
                temp++;
            }
            builder.append(temp);
        }
        return builder.toString();
    }
}
