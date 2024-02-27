//Time - O(n)
//Space - O(h)

class Node{
    int key;
    Node left;
    Node right;
    Node(int k){
        key = k;
    }
}

public class L8CalculateHeight {
    public static int CalHeight(Node root){
        if(root == null) return 0;
        return Math.max(CalHeight(root.left),CalHeight(root.right))+1;
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        System.out.println();
        System.out.println(CalHeight(root));
        System.out.println();
        System.out.println();
    }
}
