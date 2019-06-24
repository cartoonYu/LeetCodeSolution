/**
 * Problem
 *      476. Number Complement
 *      https://leetcode.com/problems/number-complement/
 * Grade of difficulty
 *      Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution476 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 cal digit with num
     *     2.2 use logic and operation with num and digit
     * 3.About submit record
     *     3.1 1ms and 32.7MB memory in LeetCode China
     *     3.2 0ms and 32.4MB memory in LeetCode
     * 4.Q&A
     * @param num
     * @return
     */
    public int findComplement(int num) {
        int temp=num,count=0;
        while(temp>0){
            temp=temp>>1;
            count=(count<<1)+1;
        }
        return num^count;
    }

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 turn num to a binary string
     *     2.2 circulate the binary string to negate every character
     *     2.3 turn the negative string to a num
     * 3.About submit record
     *     3.1 3ms and 32.8MB memory in LeetCode China
     *     3.2 1ms and 32.2MB memory in LeetCode
     * 4.Q&A
     * @param num
     * @return
     */
    public int findComplementWithString(int num) {
        String s=Integer.toBinaryString(num);
        StringBuilder temp=new StringBuilder();
        for(int i=0,length=s.length();i<length;i++){
            char c=s.charAt(i);
            if(c=='0'){
                temp.append('1');
            }
            else{
                temp.append('0');
            }
        }
        return Integer.valueOf(temp.toString(),2);
    }


}
