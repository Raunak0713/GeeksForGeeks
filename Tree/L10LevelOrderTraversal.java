import java.util.LinkedList;
import java.util.Queue;

class Node{
    int key;
    Node left;
    Node right;
    Node(int k){
        key = k;
    }
}

public class L10LevelOrderTraversal {
    public static void LevelOrder(Node root, int k){
        if(root == null) return ;
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while(q.isEmpty() == false){
            Node curr = q.poll();
            if(curr.left != null){
                q.add(curr.left);
            }
            if(curr.right != null){
                q.add(curr.right);
            }
        }
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        System.out.println();
        LevelOrder(root,1);
        System.out.println();
        System.out.println();
    }
}
