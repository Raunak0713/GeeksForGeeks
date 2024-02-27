//Time Complexity - O(n)
//Space Complexity - O(h) [h is height of the tree]

class Node{
    int key;
    Node left;
    Node right;
    Node(int k){
        key = k;
    }
}
class L5InOrderImplementation{
    public static void InOrder(Node root){
        if(root != null){
            InOrder(root.left);
            System.out.print(root.key + " ");
            InOrder(root.right);
        }
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        System.out.println();
        InOrder(root);
        System.out.println();
        System.out.println();
    }
}