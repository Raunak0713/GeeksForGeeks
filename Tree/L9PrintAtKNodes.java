class Node{
    int key;
    Node left;
    Node right;
    Node(int k){
        key = k;
    }
}

public class L9PrintAtKNodes {
    public static void PrintAtK(Node root, int k){
        if(root == null) return;
        if(k==0) System.out.print(root.key + " ");
        else{
            PrintAtK(root.left, k-1);
            PrintAtK(root.right, k-1);
        }
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        System.out.println();
        PrintAtK(root,1);
        System.out.println();
        System.out.println();
    }
}
