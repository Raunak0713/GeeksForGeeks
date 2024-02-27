//Time Complexity - O(n)
//Space Complexity - O(h)

class Node{
    int key;
    Node left;
    Node right;
    Node(int k){
        key = k;
    }
}
public class L7PostOrderImplementation {
    public static void PostOrder(Node root){
        if(root != null){
            PostOrder(root.left);
            PostOrder(root.right);
            System.out.print(root.key + " ");
        }
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        System.out.println();
        PostOrder(root);
        System.out.println();
        System.out.println();
    }
}
