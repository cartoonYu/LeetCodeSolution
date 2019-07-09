import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Problem
 *     830.Positions of Large Groups
 *     https://leetcode.com/problems/positions-of-large-groups/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution830 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 use a circulation to cal large group
     *     2.2 compare current char to current position+1 char and current position+2 char
     *          2.2.1 if three char are equals,record start position,use a circulate to get end index
     * 3.About submit record
     *     3.1 3ms and 37.8MB memory in LeetCode China
     *     3.2 1ms and 36.4MB memory in LeetCode
     * 4.Q&A
     * @param S
     * @return
     */
    public List<List<Integer>> largeGroupPositions(String S) {
        if(S==null||S.length()==0){
            return Collections.emptyList();
        }
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0,length=S.length();i<length-2;i++){
            if(S.charAt(i)==S.charAt(i+1)&&S.charAt(i+1)==S.charAt(i+2)){
                List<Integer> list=new ArrayList();
                list.add(i);
                while(++i<length-2&&S.charAt(i)==S.charAt(i+2)){
                }
                list.add(++i);
                res.add(list);
            }
        }
        return res;
    }

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 use a circulation,two integer and a char to cal large group
     *     2.2 set first char from string to last char
     *     2.3 circulate 1 to string length-1,there have two condition
     *          2.3.1 current char equals lastChar,set endIndex++
     *          2.3.2 current char doesn't equals lastChar,calculate large group and set temp variable with current char
     *     2.4 compare startIndex to endIndex,calculate large group between last sequence char
     * 3.About submit record
     *     3.1 5ms and 39MB memory in LeetCode China
     *     3.2 1ms and 36.2MB memory in LeetCode
     * 4.Q&A
     * @param S
     * @return
     */
    public List<List<Integer>> largeGroupPositions2(String S) {
        if(S==null||S.length()==0){
            return Collections.emptyList();
        }
        List<List<Integer>> res=new ArrayList<>();
        int startIndex=0,endIndex=0;
        char lastChar=S.charAt(0);
        for(int i=1,length=S.length();i<length;i++){
            char temp=S.charAt(i);
            if(temp==lastChar){
                endIndex++;
            }
            else{
                if((endIndex-startIndex)>1){
                    List<Integer> list=new ArrayList<>();
                    list.add(startIndex);
                    list.add(endIndex);
                    res.add(list);
                }
                lastChar=temp;
                startIndex=i;
                endIndex=i;
            }
        }
        if((endIndex-startIndex)>1){
            List<Integer> list=new ArrayList<>();
            list.add(startIndex);
            list.add(endIndex);
            res.add(list);
        }
        return res;
    }
}
