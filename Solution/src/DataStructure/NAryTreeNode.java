package DataStructure;

import java.util.List;

/**
 * This data structure is use to n-ary tree"s node
 *
 * @author cartoon
 * @version 1.0
 */
public class NAryTreeNode {

    public int val;

    public List<NAryTreeNode> children;

    public NAryTreeNode() {}

    public NAryTreeNode(int _val,List<NAryTreeNode> _children) {
        val = _val;
        children = _children;
    }
}
