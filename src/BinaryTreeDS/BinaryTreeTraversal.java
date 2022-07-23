package BinaryTreeDS;

public class BinaryTreeTraversal {
    Node root;

    BinaryTreeTraversal(){
        root = null;
    }

    void printPostOrder(Node node){
        if(node == null){
            return;
        }
        printPostOrder(node.left);
        printPostOrder(node.right);
    System.out.print(node.key + "");
    }

    void printPreOrder(Node node){
        if(node == null){
            return;
        }
    System.out.print(node.key+"");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }

    void printInOrder(Node node){
        if(node == null){
            return;
        }
        printInOrder(node.left);
    System.out.print(node.key+"");
    printInOrder(node.right);
    }

    void printPostOrder(){
        printPostOrder(root);
    }

    void printPreOrder(){
        printPreOrder(root);
    }

    void printInOrder(){
        printInOrder(root);
    }

  public static void main(String[] args) {
      BinaryTreeTraversal treeTraversal = new BinaryTreeTraversal();
      treeTraversal.root = new Node(1);
      treeTraversal.root.left = new Node(2);
      treeTraversal.root.right = new Node(3);
      treeTraversal.root.left.left= new Node(4);
      treeTraversal.root.right.right = new Node(5);
      treeTraversal.root.left.right = new Node(6);
      treeTraversal.root.right.left = new Node(7);
    System.out.println("Binary Traversal");
    System.out.println("Traversal of InOrder ");
    treeTraversal.printInOrder();
    System.out.println("\nTraversal of PreOrder ");
    treeTraversal.printPreOrder();
    System.out.println("\nTraversal of PostOrder ");
    treeTraversal.printPostOrder();
  }



}

/****
 * Binary Traversal
 * Traversal of InOrder
 * 4261735
 * Traversal of PreOrder
 * 1246375
 * Traversal of PostOrder
 * 4627531
 * Process finished with exit code 0
 *
 */
