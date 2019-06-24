import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Problem
 *      500.Keyboard Row
 *      https://leetcode.com/problems/keyboard-row/
 * Grade of difficulty
 *      Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution500 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n^2)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 define a hash map to cache alphabet
     *     2.2 circulate word array,compare each alphabet to hash map
     *     2.3 return the result array
     * 3.About submit record
     *     3.1 2ms and 36.7MB memory in LeetCode China
     *     3.2 1ms and 35.9MB memory in LeetCode
     * 4.Q&A
     */
    private Map<Character,Integer> map;

    public String[] findWords(String[] words) {
        if(words==null||words.length==0){
            return words;
        }
        initData();
        List<String> list=new LinkedList<>();
        for(String s:words){
            String str=s.toLowerCase();
            int temp=map.get(str.charAt(0));
            boolean flag=true;
            for(int i=1,length=str.length();i<length;i++){
                if(map.get(str.charAt(i))!=temp){
                    flag=false;
                    break;
                }
            }
            if(flag){
                list.add(s);
            }
        }
        String[] result=new String[list.size()];
        for(int i=0,size=list.size();i<size;i++){
            result[i]=list.get(i);
        }
        return result;
    }

    private void initData(){
        map=new HashMap<>();
        map.put('q',1);
        map.put('w',1);
        map.put('e',1);
        map.put('r',1);
        map.put('t',1);
        map.put('y',1);
        map.put('u',1);
        map.put('i',1);
        map.put('o',1);
        map.put('p',1);
        map.put('a',2);
        map.put('s',2);
        map.put('d',2);
        map.put('f',2);
        map.put('g',2);
        map.put('h',2);
        map.put('j',2);
        map.put('k',2);
        map.put('l',2);
        map.put('z',3);
        map.put('x',3);
        map.put('c',3);
        map.put('v',3);
        map.put('b',3);
        map.put('n',3);
        map.put('m',3);
    }
}
