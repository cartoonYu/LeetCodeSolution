import java.util.Deque;
import java.util.LinkedList;

/**
 * Problem
 *      232.Implement Queue using Stacks
 * Grade of difficulty
 *      Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution232 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(1)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 define two stack to complete this topic
     *     2.2 push operation is process in input stack and pop or top is process in output stack
     * 3.About submit record
     *     3.1 90ms and 34.4MB memory in LeetCode China
     *     3.2 42ms and 34MB memory in LeetCode
     * 4.Q&A
     *     4.1 Q:Have some point of improve?
     *         A:Honestly,I am not satisfied with this solution,but it is my best solution currently.
     *           I think one point is balance input element and output element time.I will change it at a certain time
     */

    private Deque<Integer> input;

    private Deque<Integer> output;

    /** Initialize your data structure here. */
    public Solution232() {
        input=new LinkedList<>();
        output=new LinkedList<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        input.addFirst(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(output.size()==0){
            while(input.size()!=0){
                output.addFirst(input.removeFirst());
            }
        }
        return output.size()!=0?output.removeFirst():-1;
    }

    /** Get the front element. */
    public int peek() {
        if(output.size()==0){
            while(input.size()!=0){
                output.addFirst(input.removeFirst());
            }
        }
        return output.size()!=0?output.peekFirst():-1;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return output.size()==0&&input.size()==0;
    }
}
