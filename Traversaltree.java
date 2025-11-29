class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = right = null;

    }

}

class BinaryTree {
    Node root;

    BinaryTree() {
        this.root = null;

    }

    public void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);

    }
    public void preOrder(Node node) {
        if (node == null) {
            return;
        }
       System.out.print(node.data + " ");
        preOrder(node.left);

        preOrder(node.right);
}
    public void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }
}

class Traversaltree {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        System.out.println("Binary Tree created with root value: " + tree.root.data);
        System.out.println("Left child of root: " + tree.root.left.data);
        System.out.println("Right child of root: " + tree.root.right.data);

    }

}