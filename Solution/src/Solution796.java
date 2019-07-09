/**
 * Problem
 *     796.Rotate String
 *     https://leetcode.com/problems/rotate-string/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution796 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(1)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 use a stringBuilder to append string A twice
     *     2.2 use function indexOf to judge whether B is in builder(append twice string will be contains all rotation possibility)
     * 3.About submit record
     *     3.1 1ms and 35.2MB memory in LeetCode China
     *     3.2 0ms and 34MB memory in LeetCode
     * 4.Q&A
     *     4.1 Q:Is there have any difference between this solution and solution 2？
     *         A:The difference is in append string,use stringBuilder to append is faster than append it directly,
     *              if you don't like to use another variable,you can use function concat in string to append string.
     * @param A
     * @param B
     * @return
     */
    public boolean rotateString3(String A, String B) {
        if((A==null&&B==null)||(A.length()==0&&B.length()==0)){
            return true;
        }
        if(A.length()!=B.length()){
            return false;
        }
        if(A.length()==1){
            return A.equals(B);
        }
        StringBuilder builder=new StringBuilder(A);
        builder.append(A);
        return builder.indexOf(B)!=-1;
    }

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(1)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 append A with itself
     *     2.2 use function contains to judge whether B is in builder(append twice string will be contains all rotation possibility)
     * 3.About submit record
     *     3.1 1ms and 34.8MB memory in LeetCode China
     *     3.2 0ms and 33.9MB memory in LeetCode
     * 4.Q&A
     * @param A
     * @param B
     * @return
     */
    public boolean rotateString2(String A, String B) {
        if((A==null&&B==null)||(A.length()==0&&B.length()==0)){
            return true;
        }
        if(A.length()!=B.length()){
            return false;
        }
        if(A.length()==1){
            return A.equals(B);
        }
        A=A+A;
        return A.contains(B);
    }

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O()
     *     1.2 Space Complexity is O()
     * 2.how I solve
     *
     * 3.About submit record
     *     3.1 2ms and 35.9MB memory in LeetCode China
     *     3.2 1ms and 35.4MB memory in LeetCode
     * 4.Q&A
     * @param A
     * @param B
     * @return
     */
    public boolean rotateString1(String A, String B) {
        if((A==null&&B==null)||(A.length()==0&&B.length()==0)){
            return true;
        }
        if(A.length()!=B.length()){
            return false;
        }
        if(A.length()==1){
            return A.equals(B);
        }
        StringBuilder builder=new StringBuilder();
        for(int i=0,length=A.length();i<length;i++){
            builder.append(A.substring(1)).append(A.charAt(0));
            A=builder.toString();
            if(A.equals(B)){
                return true;
            }
            builder.delete(0,builder.length());
        }
        return false;
    }
}
