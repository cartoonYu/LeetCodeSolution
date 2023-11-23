package org.LeetcodeSolution.String;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem
 *     <a href="https://leetcode.com/problems/html-entity-parser/description/">leetcode.com</a>
 *     <a href="https://leetcode.cn/problems/html-entity-parser/description/">leetcode.cn</a>
 * <br/>Grade of difficulty<br/>
 *     Medium
 * @author cartoon
 * @version 1.0
 */
public class Solution1410 {

    private static Map<String, String> map = new HashMap<>();

    static{
        map.put("&quot;", "\"");
        map.put("&apos;", "\'");
        map.put("&amp;", "&");
        map.put("&gt;", ">");
        map.put("&lt;", "<");
        map.put("&frasl;", "/");
    }

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 traverse string, have two three situation
     *          2.1.1 left character is & and right character is ;, sub string is in define map, append sub string to result
     *          2.1.2 left character is & and right character is ;, sub string is not in define map, append left character to result
     *          2.1.3 left character is not &, append left character to result
     * 3.Q&A
     * @param text source string
     * @return result
     */
    public String entityParser(String text) {
        StringBuilder result = new StringBuilder();
        int left = 0, right, length = text.length();
        while(left < length){
            if(text.charAt(left) == '&'){
                right = left + 1;
                while(right < length && right - left < 6 && text.charAt(right) != ';'){
                    right++;
                }
                String sub = text.substring(left, Math.min(right + 1, length));
                if(map.containsKey(sub)){
                    result.append(map.get(sub));
                    left = right + 1;
                    continue;
                }
            }
            result.append(text.charAt(left++));
        }
        return result.toString();
    }
}
