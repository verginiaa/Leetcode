import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaximumDepthOfNaryTree {
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
    };
    public int maxDepth(Node root) {
        Queue<Node>queue=new LinkedList<>();
        if(root==null)
            return 0;
        int tot=0;
        queue.add(root);
        while (!queue.isEmpty()){
            tot++;
            int size=queue.size();
            for(int i=0;i<size;i++){
                root=queue.remove();
                for(int j=0;j<root.children.size();j++)
                    queue.add(root.children.get(j));
            }

        }
        return tot;
    }
}
