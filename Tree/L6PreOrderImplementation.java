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

public class L6PreOrderImplementation {
    public static void PreOrder(Node root){
        if(root != null){
            System.out.print(root.key + " ");
            PreOrder(root.left);
            PreOrder(root.right);
        }
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        System.out.println();
        PreOrder(root);
        System.out.println();
        System.out.println();
    }
}
