import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Problem
 *     17.Letter Combinations of a Phone Number
 *     https://leetcode.com/problems/letter-combinations-of-a-phone-number/
 * Grade of difficulty
 *     Medium
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution17 {

    private List<String> list;

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O()
     * 2.how I solve
     *     2.1 this solution is base on backTrack
     *     2.2 calculate current character value and what character it has
     *     2.3 circulate what character it has and backTracking source string
     * 3.About submit record
     *     3.1 1ms and 36.2MB memory in LeetCode China
     *     3.2 0ms and 36MB memory in LeetCode
     * 4.Q&A
     * @param digits
     * @return
     */
    public List<String> letterCombinations(String digits) {
        if(digits==null||digits.length()==0){
            return Collections.emptyList();
        }
        list=new ArrayList<>();
        backTracking(digits,0,new StringBuilder());
        return list;
    }

    private void backTracking(String digits,int index,StringBuilder builder){
        if(index==digits.length()){
            list.add(builder.toString());
            return;
        }
        int temp=Character.digit(digits.charAt(index),10);
        int border=temp==7||temp==9?4:3;
        char[] c=new char[border];
        int startElement=0;
        if(temp==8){
            startElement=116;
        }
        else{
            if(temp==9){
                startElement=119;
            }
            else{
                startElement=(temp-2)*3+97;
            }
        }
        for(int i=0;i<border;i++){
            c[i]=(char)startElement;
            startElement++;
        }
        for(int i=0;i<border;i++){
            builder.append(c[i]);
            backTracking(digits,index+1,builder);
            builder.deleteCharAt(builder.length()-1);
        }
    }
}
