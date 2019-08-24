import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Problem
 *     451.Sort Characters By Frequency
 *     https://leetcode.com/problems/sort-characters-by-frequency/submissions/
 *     https://leetcode-cn.com/problems/sort-characters-by-frequency/submissions/
 * Grade of difficulty
 *     Medium
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution451 {

    /**
     * 因为这两个解法原理一样，只是数据结构不一样，所以我将他们的解释合并
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(n^2)
     * 2.我的解题思路
     *     2.1 用哈希表记录字符以及它出现的次数
     *     2.2 用桶/treeMap对哈希表的元素进行排序
     *     2.3 从大到小遍历2.2的数据结构，组合结果String
     * 3.提交记录
     *     3.1 桶排序
     *         3.1.1 力扣中耗时56ms,消耗48.3MB内存
     *         3.1.2 leetcode中耗时21ms,消耗37.9MB内存
     *     3.2 treeMap
     *         3.2.1 力扣中耗时67ms,消耗46.9MB内存
     *         3.2.2 leetcode中耗时24ms,消耗39.2MB内存
     * 4.Q&A
     *
     * cause this two solution have similar theory,so I merge explanation
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n^2)
     * 2.how I solve
     *     2.1 use a map to record character and corresponding time
     *     2.2 use buckets/treeMap to sort character by its time
     *     2.3 go though from large to small time,append result
     * 3.About submit record
     *     3.1 bucket sort solution
     *         3.1.1 56ms and 48.3MB memory in LeetCode China
     *         3.1.2 21ms and 37.9MB memory in LeetCode
     *     3.2 treeMap solution
     *         3.2.1 67ms and 46.9MB memory in LeetCode China
     *         3.2.2 24ms and 39.2MB memory in LeetCode
     * 4.Q&A
     *
     * @param s
     * @return
     */
    public String frequencySortByBucketSort(String s) {
        if(s==null||s.length()<2){
            return s;
        }
        Map<Character,Integer> map=new HashMap<>();
        char c;
        int max=0;
        for(int i=0,length=s.length();i<length;i++){
            c=s.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
            max=max>map.get(c)?max:map.get(c);
        }
        StringBuilder[] builders=new StringBuilder[max+1];
        Set<Character> set=map.keySet();
        for(Character temp:set){
            int time=map.get(temp);
            if(builders[time]==null){
                builders[time]=new StringBuilder();
            }
            builders[time].append(temp);
        }
        StringBuilder res=new StringBuilder();
        for(int i=builders.length-1;i>-1;i--){
            if(builders[i]!=null){
                for(int j=0,size=builders[i].length();j<size;j++){
                    char temp=builders[i].charAt(j);
                    for(int k=i;k>0;k--){
                        res.append(temp);
                    }
                }
            }
        }
        return res.toString();
    }

    public String frequencySortByTreeMap(String s) {
        if(s==null||s.length()<2){
            return s;
        }
        Map<Character,Integer> map=new HashMap<>();
        char c;
        int max=0;
        for(int i=0,length=s.length();i<length;i++){
            c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
            max=max>map.get(c)?max:map.get(c);
        }
        TreeMap<Integer,String> sortMap=new TreeMap<>();
        Set<Character> set=map.keySet();
        for(Character temp:set){
            sortMap.put(map.get(temp), sortMap.getOrDefault(map.get(temp),"")+temp);
        }
        StringBuilder res=new StringBuilder();
        while(sortMap.size()!=0){
            Map.Entry<Integer,String> entry=sortMap.pollLastEntry();
            String value=entry.getValue();
            for(int i=0,length=value.length();i<length;i++){
                char temp=value.charAt(i);
                for(int j=entry.getKey();j>0;j--){
                    res.append(temp);
                }
            }
        }
        return res.toString();
    }
}
