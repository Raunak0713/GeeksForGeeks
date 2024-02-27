class Node{
    int key;
    Node left;
    Node right;
    Node(int k){
        key = k;
    }
}
class L3Implementation{
    public static void main(String[] args) {
        //Node root = null;  This will initiate a binary tree with root as null;

        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
    }
}