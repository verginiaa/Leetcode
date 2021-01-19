import javax.xml.soap.Node;
import java.util.ArrayList;
import java.util.List;

public class NaryTreePostorderTraversal {
    static List<Integer>list=new ArrayList<>();
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
    public List<Integer> postorder(Node root) {
        if(root==null)   return list;
        visit(root);
        return list;
    }
    public void visit(Node root)
    {
        for(Node n: root.children)
            visit(n);
        list.add(root.val);
    }
}
