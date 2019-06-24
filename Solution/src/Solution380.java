import java.util.HashSet;
import java.util.Set;

/**
 * Problem
 *      380. Insert Delete GetRandom O(1)
 *      https://leetcode.com/problems/insert-delete-getrandom-o1/
 * Grade of difficulty
 *      Medium
 * Related topics
 *      None
 * @author cartoon
 * @version 1.0
 */
public class Solution380 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(1)
     *     1.2 Space Complexity is depend on number of set elements
     * 2.how I solve
     *     2.1 cause problem restrict average time complexity is O(1),so I choice HashSet to be my data structure
     *     2.2 The operations of insert,remove are base on HashSet's member function
     *     2.3 The operation of random is base on hashSet's size,I use a random number to choice which number to be returned
     * 3.About submit record
     *     3.1 545ms and 85MB memory in LeetCode China
     *     3.2 177ms and 58.2MB memory in LeetCode
     * 4.Q&A
     */

    private Set<Integer> set;

    /** Initialize your data structure here. */
    public Solution380() {
        set=new HashSet<>();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(set.contains(val)){
            return false;
        }
        else{
            set.add(val);
            return true;
        }
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(set.contains(val)){
            set.remove(val);
            return true;
        }
        else{
            return false;
        }
    }

    /** Get a random element from the set. */
    public int getRandom() {
        if(set.size()==0){
            return 0;
        }
        Integer[] data=set.toArray(new Integer[set.size()]);
        int index=(int)(Math.random()*set.size());
        return data[index];
    }
}
