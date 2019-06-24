/**
 * Problem
 *      58.Length of Last Word
 *      https://leetcode.com/problems/length-of-last-word/
 * Grade of difficulty
 *      Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution58 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 remove all last space util meet letter and record index
     *     2.2 circulate from tail to head util meet space and record res
     * 3.About submit record
     *     3.1 1ms and 35.1MB memory in LeetCode China
     *     3.2 0ms and 35.9MB memory in LeetCode
     * 4.Q&A
     * @param s
     * @return
     */
    public int lengthOfLastWord(String s) {
        if(s.length()==0){
            return 0;
        }
        int length=s.length(),res=0;
        while(length>0&&s.charAt(length-1)==' '){
            length--;
        }
        if(length<0){
            return 0;
        }
        for(int i=length-1;i>=0;i--){
            if(s.charAt(i)==' '){
                break;
            }
            else{
                res++;
            }
        }
        return res;
    }

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 circulate from tail to head util meet space and record res
     *     2.2 judge res>0,if not,continue circulate,because a special condition:the whole sentence is space
     * 3.About submit record
     *     3.1 5ms and 35.1MB memory in LeetCode China
     *     3.2 2ms and 37.4MB memory in LeetCode
     * 4.Q&A
     *      4.1 Q:why the main structure is similar,time complexity is big apart?
     *          A:My opinion is in the for circulate,the different is judgement time
     * @param s
     * @return
     */
    public int oldLengthOfLastWord(String s) {
        if(s.length()==0){
            return 0;
        }
        int result=0;
        for(int length=s.length(),i=length-1;i>=0;i--){
            if(s.charAt(i)==' '){
                if(result>0){
                    break;
                }
                else{
                    continue;
                }
            }
            else{
                result++;
            }
        }
        return result;
    }
}
