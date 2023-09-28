// Urawee Thani 65011617

package code;

public class TreeNode {
    int data;
    TreeNode left, right, parent;

    public TreeNode(int d) {
        data = d;
    }

    @Override
    public String toString() {
        /* your code 6*/

        // There are 4 cases no child,

        // left-child-only,
        if (left != null && right == null) 
            return left.data + "<-" + data + "->null";

        // right-child-only,
        else if (left == null && right != null) 
            return "null<-" + data + "->" + right.data;

        // and both children
        else if (left != null && right != null) 
            return left.data + "<-" + data + "->" + right.data;

        // no child
        return "null<-" + data + "->null";
    }
}
