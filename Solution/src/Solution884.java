import java.util.*;

/**
 * Problem
 *     884.Uncommon Words from Two Sentences
 *     https://leetcode.com/problems/uncommon-words-from-two-sentences/
 *     https://leetcode-cn.com/problems/uncommon-words-from-two-sentences/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution884 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(n)
     * 2.我的解题思路
     *     2.1 利用split函数将两个传入字符串转换成String数组
     *     2.2 定义一个HashMap记录单词出现次数
     *     2.3 循环遍历2.1的两个数组，记录单词出现次数
     *     2.4 遍历HashMap，将出现一次的单词放入结果中
     * 3.提交记录
     *     3.1 力扣中耗时6ms,消耗35.5MB内存
     *     3.2 leetcode中耗时2ms,消耗36.3MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 change input string to array with function split
     *     2.2 define a hashMap to record calculate result
     *     2.3 circulate 2.1 two array,record word appearance time
     *     2.4 circulate hashMap,add word which appearance time is 1 to result
     * 3.About submit record
     *     3.1 6ms and 35.5MB memory in LeetCode China
     *     3.2 2ms and 36.3MB memory in LeetCode
     * 4.Q&A
     *
     * @param A
     * @param B
     * @return
     */
    public String[] uncommonFromSentences(String A, String B) {
        if(A.length()==0&&B.length()==0){
            return new String[0];
        }
        Map<String,Integer> map=new HashMap<>();
        List<String> list=new ArrayList<>();
        String[] strs1=A.split(" "),strs2=B.split(" ");
        for(String temp:strs1){
            map.put(temp,map.getOrDefault(temp,0)+1);
        }
        for(String temp:strs2){
            map.put(temp,map.getOrDefault(temp,0)+1);
        }
        Set<String> set=map.keySet();
        for(String temp:set){
            if(map.get(temp)==1){
                list.add(temp);
            }
        }
        return list.toArray(new String[list.size()]);
    }
}
