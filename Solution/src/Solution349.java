import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Problem
 *      349. Intersection of Two Arrays
 * Grade of difficulty
 *      Easy
 * Related topics
 *      350. Intersection of Two Arrays II
 * @author cartoon
 * @version 1.0
 */
public class Solution349 {

    /**
     * 1.About Complexity
     *      1.1 Time Complexity is O(n)
     *      1.2 Space Complexity is O(n)
     * 2.how I solve
     *      2.1 Compare two array,use the longer array as a compared set
     *      2.2 Use the shorter array as a compare array
     *      2.3 Traverse the compare array,use every element to contrast with the compared set,if it didn't,put the element to a new Set
     *      2.4 Use iteration traversal to put every element to array
     * 3.About submit record
     *      3.1 8ms and 38MB memory in LeetCode China
     *      3.2 2ms and 35.4MB memory in LeetCode
     * 4.Q&A
     *      4.1 Q:Why do you compare two array'length at first?
     *          A:Cause I want to cut down the time of traverse the compare array as far as possible
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set=new HashSet<>();
        int[] tempNum=nums1.length>nums2.length?nums1:nums2;
        int[] tempNum2=nums1.length<nums2.length?nums1:nums2;
        for(int temp:tempNum){
            set.add(temp);
        }
        Set<Integer> tempSet=new HashSet<>();
        for(int temp:tempNum2){
            if(set.contains(temp)){
                tempSet.add(temp);
            }
        }
        int[] result=new int[tempSet.size()];
        int flag=0;
        Iterator<Integer> it=tempSet.iterator();
        while(it.hasNext()){
            result[flag++]=it.next();
        }
        return result;
    }
}
