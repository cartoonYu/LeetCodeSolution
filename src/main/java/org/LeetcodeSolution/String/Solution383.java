package org.LeetcodeSolution.String;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem
 *      383.Ransom Note
 *      https://leetcode.com/problems/ransom-note/
 * Grade of difficulty
 *      Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution383 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 define an array of length 26 to cache magazine's character and its corresponding appearance time
     *     2.2 circulate magazine to put appearance time to array
     *     2.3 circulate ransomNote
     *              2.3.1 calculate index of array
     *              2.3.2 check array's value whether it equals 0
     *              2.3.3 subtract corresponding appearance time
     * 3.About submit record
     *     3.1 6ms and 45.2MB memory in LeetCode China
     *     3.2 2ms and 38.2MB memory in LeetCode
     * 4.Q&A
     *     4.1 Q:Why array3 solution's time Complexity is smaller than array1'solution?
     *         A:I think the difference is reflected in the second circulation,array3's only calculate index one time,but array1's calculate two time
     * @param ransomNote
     * @param magazine
     * @return
     */
    public boolean canConstructByArray3(String ransomNote, String magazine) {
        if(ransomNote==null){
            return true;
        }
        if(magazine==null){
            return false;
        }
        int[] nums=new int[26];
        for(char temp:magazine.toCharArray()){
            nums[temp-'a']++;
        }
        for(char temp:ransomNote.toCharArray()){
            int index=temp-'a';
            if(nums[index]==0){
                return false;
            }
            else{
                nums[index]--;
            }
        }
        return true;
    }

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 define an array of length 26 to cache magazine's character and its corresponding appearance time
     *     2.2 circulate magazine to put appearance time to array
     *     2.3 circulate ransomNote to subtract corresponding appearance time
     *     2.4 check the define array whether its value equals 0
     * 3.About submit record
     *     3.1 6ms and 45.4MB memory in LeetCode China
     *     3.2 2ms and 37.9MB memory in LeetCode
     * 4.Q&A
     * @param ransomNote
     * @param magazine
     * @return
     */
    public boolean canConstructByArray2(String ransomNote, String magazine) {
        if(ransomNote==null){
            return true;
        }
        if(magazine==null){
            return false;
        }
        int[] nums=new int[26];
        for(char temp:magazine.toCharArray()){
            nums[temp-'a']++;
        }
        for(char temp:ransomNote.toCharArray()){
            nums[temp-'a']--;
        }
        for(int temp:nums){
            if(temp<0){
                return false;
            }
        }
        return true;
    }

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 define an array of length 26 to cache magazine's character and its corresponding appearance time
     *     2.2 circulate magazine to put appearance time to array
     *     2.3 circulate ransomNote to subtract corresponding appearance time and at the same time check array's value whether it equals 0
     * 3.About submit record
     *     3.1 8ms and 44.6MB memory in LeetCode China
     *     3.2 2ms and 37.7MB memory in LeetCode
     * 4.Q&A
     * @param ransomNote
     * @param magazine
     * @return
     */
    public boolean canConstructByArray1(String ransomNote, String magazine) {
        if(ransomNote==null){
            return true;
        }
        if(magazine==null){
            return false;
        }
        int[] nums=new int[26];
        for(char temp:magazine.toCharArray()){
            nums[temp-'a']++;
        }
        for(char temp:ransomNote.toCharArray()){
            if(nums[temp-'a']==0){
                return false;
            }
            else{
                nums[temp-'a']--;
            }
        }
        return true;
    }

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 define a hashMap to cache magazine's character and its corresponding appearance time
     *     2.2 circulate magazine string to record its character and its corresponding appearance time
     *     2.3 circulate ransomNote to subtract map's value and at the same time check map's value whether it equals 0
     * 3.About submit record
     *     3.1 85ms and 49.3MB memory in LeetCode China
     *     3.2 26ms and 38.3MB memory in LeetCode
     * 4.Q&A
     * @param ransomNote
     * @param magazine
     * @return
     */
    public boolean canConstructByHashMap(String ransomNote, String magazine) {
        if(ransomNote==null){
            return true;
        }
        if(magazine==null){
            return false;
        }
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0,length=magazine.length();i<length;i++){
            char temp=magazine.charAt(i);
            if(map.containsKey(temp)){
                map.put(temp,map.get(temp)+1);
            }
            else{
                map.put(temp,1);
            }
        }
        for(int i=0,length=ransomNote.length();i<length;i++){
            char temp=ransomNote.charAt(i);
            if(map.containsKey(temp)){
                if(map.get(temp)==0){
                    return false;
                }
                map.put(temp,map.get(temp)-1);
            }
            else{
                return false;
            }
        }
        return true;
    }
}
