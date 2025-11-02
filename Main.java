class Main {
    public static void main(String[] args) {
        
        SearchTree tree = new SearchTree();
        tree.insertion(1);
        tree.insertion(3);
        System.out.println("Preorder Traversal: ");
        tree.callPreorder();
        System.out.println("Postorder Traversal: ");
        tree.callPostorder();
        System.out.println("Inorder Traversal: ");
        tree.inorder();
    }
}