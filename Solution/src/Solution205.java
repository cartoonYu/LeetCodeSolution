import java.util.HashMap;
import java.util.Map;

/**
 * Problem
 *     205.Isomorphic Strings
 *     https://leetcode.com/problems/isomorphic-strings/
 *     https://leetcode-cn.com/problems/isomorphic-strings/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution205 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(n)
     * 2.我的解题思路
     *     2.1 定义两个数组分别记录当前元素的上一位置
     *     2.2 倒序遍历字符串，如果当前元素的上一位置对应，更新当前元素的位置，如果不对应，直接返回false
     * 3.提交记录
     *     3.1 力扣中耗时3ms,消耗36.9MB内存
     *     3.2 leetcode中耗时1ms,消耗35.9MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 set two array to record last position of two array
     *     2.2 circulate from head to head,there have two condition
     *         2.2.1 current character,last position is not same,return false
     *         2.2.2 update current character position
     * 3.About submit record
     *     3.1 3ms and 36.9MB memory in LeetCode China
     *     3.2 1ms and 35.9MB memory in LeetCode
     * 4.Q&A
     *
     * @param s
     * @param t
     * @return
     */
    public boolean isIsomorphicByMarkLastPosition(String s, String t) {
        if(s.length()==0&&t.length()==0){
            return true;
        }
        int[] temp1=new int[128],temp2=new int[128];
        char c1,c2;
        for(int i=s.length()-1;i>=0;i--){
            c1=s.charAt(i);
            c2=t.charAt(i);
            if(temp1[c1]!=temp2[c2]){
                return false;
            }
            temp1[c1]=i;
            temp2[c2]=i;
        }
        return true;
    }

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(n)
     * 2.我的解题思路
     *     2.1 定义hash记录当前位置的元素对应关系
     *     2.2 遍历字符串
     *         2.2.1 当前元素已经在hash中，检查value以及另一字符的对应关系
     *         2.2.2 当前元素不在hash，检查另一元素是否在value中
     * 3.提交记录
     *     3.1 力扣中耗时25ms,消耗38.9MB内存
     *     3.2 leetcode中耗时9ms,消耗36.1MB内存
     * 4. Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n^2)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 set a hash to record character position relationship
     *     2.2 circulate from head to tail
     *         2.2.1 when current character is already in hash,check value with another character
     *         2.2.2 when current character is not in hash,check whether another is already in hash
     * 3.About submit record
     *     3.1 25ms and 38.9MB memory in LeetCode China
     *     3.2 9ms and 36.1MB memory in LeetCode
     * 4.Q&A
     *
     * @param s
     * @param t
     * @return
     */
    public boolean isIsomorphicByHash(String s, String t) {
        if(s.length()==0&&t.length()==0){
            return true;
        }
        Map<Character,Character> map=new HashMap<>();
        char c1,c2;
        for(int i=0,length=s.length();i<length;i++){
            c1=s.charAt(i);
            c2=t.charAt(i);
            if(map.containsKey(c1)){
                if(!map.get(c1).equals(c2)){
                    return false;
                }
            }
            else{
                if(map.containsValue(c2)){
                    return false;
                }
                map.put(c1,c2);
            }
        }
        return true;
    }
}
