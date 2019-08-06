import DataStructure.BinaryTreeNode;

/**
 * Problem
 *     437.Path Sum III
 *     https://leetcode.com/problems/path-sum-iii/
 *     https://leetcode-cn.com/problems/path-sum-iii/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution437 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n!)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 因为结果含有片段和，所以我们不能用传统的遍历
     *     2.2 因为结果含有片段和，所以我们可以用双重前序遍历（实在不知道怎么说）
     * 3.提交记录
     *     3.1 力扣中耗时18ms,消耗39.2MB内存
     *     3.2 leetcode中耗时10ms,消耗41.3MB内存
     * 4.Q&A
     * 1.About Complexity
     *     1.1 Time Complexity is O(n!)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 cause result has fragment sum,so we don't use traditional traverse
     *     2.2 cause result has fragment sum,we can use double preOrder traverse
     * 3.About submit record
     *     3.1 18ms and 39.2MB memory in LeetCode China
     *     3.2 10ms and 41.3MB memory in LeetCode
     * 4.Q&A
     * @param root
     * @param sum
     * @return
     */
    public int pathSum(BinaryTreeNode root, int sum) {
        if(root==null){
            return 0;
        }
        preOrder(root,sum);
        pathSum(root.left,sum);
        pathSum(root.right,sum);
        return cnt;
    }

    private int cnt;

    private void preOrder(BinaryTreeNode root,int sum){
        if(root==null){
            return;
        }
        sum-=root.val;
        if(sum==0){
            cnt++;
        }
        preOrder(root.left,sum);
        preOrder(root.right,sum);
    }
}
