package org.LeetcodeSolution.Hash;

import java.util.PriorityQueue;

/**
 * Problem
 *     <a href="https://leetcode.com/problems/smallest-number-in-infinite-set/description/">leetcode.com</a>
 *     <a href="https://leetcode.cn/problems/smallest-number-in-infinite-set/description/">leetcode.cn</a>
 * <br/>Grade of difficulty<br/>
 *     Medium
 * @author cartoon
 * @version 1.0
 */
public class Solution2336 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(log n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 define a priority queue with asc order, put every number to it
     *     2.2 define array to record push number whether in queue
     *     2.3 pop number, poll queue and mark array element is false
     *     2.4 push number, add queue and mark array element is true
     * 3.Q&A
     */

    boolean[] flags = new boolean[1001];

    PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> a - b);

    public Solution2336() {
        for(int index = 1; index < 1001; index++){
            queue.add(index);
            flags[index] = true;
        }
    }

    public int popSmallest() {
        int result = queue.poll();
        flags[result] = false;
        return result;
    }

    public void addBack(int num) {
        if(!flags[num]){
            queue.add(num);
            flags[num] = true;
        }
    }
}
