class SearchTree {

    Node root; //the root node of the binary search tree 
    
    /*
    *pre: 
    *post: initalizes an empty tree
    */
    //Creates an empty binary search tree with no nodes
    public SearchTree(){
        root = null;
    }
    
    /*
    *pre: input must be a valid integer
    *post: inserts a new node with the given input value
    */
    //Inserts a node into the binary search tree
    void insertion(int input) {
        root = insertingNode(root, input);
    }
    
    /*
    *pre: root references A subtree, input is a valid integer
    *post: inserts a new node with input value given
    */
    //Recursively inserts a new node into the correct position in binary search tree
    Node insertingNode(Node root, int input) {
        if (root == null) {
            root = new Node(input);
            return root;
        }

        if(input < root.input) {
            root.left = insertingNode(root.left, input);
        }
        else if(input > root.input) {  
            root.right= insertingNode(root.right, input);
        }
        return root;
    }
    
    /*
    *pre: input is a valid integer
    *post: removes the node with given input value from tree
    */
    //Deletes a node from the binary search tree 
    void delete(int input) {
        root = deletingNode(root, input);
    }
    
    /*
    *pre: root references A subtree, input is a valid integer
    *post: returns the new root of the subtree after deletion
    */
    //Recurisvely deletes a node in the binary search tree for different childs
    Node deletingNode(Node root, int input) {
        if (root == null){
            return root;
        }
        if (input < root.input){
            root.left = deletingNode(root.left, input);
        }
        else if (input > root.input) {
            root.right = deletingNode(root.right, input);
        }
        else {
            if (root.left == null){
                return root.right;
            }
            else if (root.right == null){
                return root.left;
            }
            root.input = minimumVal(root.right);
            root.right = deletingNode(root.right, root.input);
        }
        return root;
    }
    
    /*
    *pre: root is not null
    *post: returns the minimum value found in the subtree
    */
    //Finds the smallest value in the subtree and returns it
    int minimumVal(Node root) {
        int minValue = root.input;
        while (root.left != null) {
            minValue = root.left.input;
            root = root.left;
        }
        return minValue;
    }
    
    /*
    *pre: 
    *post: prints the tree inorder traversal
    */
    //Calls the recursive inorder traversal and prints the tree in the sorter order
    void inorder() {
        inorderTrav(root);
        System.out.println("\n");
    }
    
    /*
    *pre: root references a subtree
    *post: prints all values inorder traversal 
    */
    //Recursively visits nodes inorder (left, root, right) and prints them
    void inorderTrav(Node root) {
        if (root != null) {
            inorderTrav(root.left);
            System.out.print(root.input + " ");
            inorderTrav(root.right);
        }
    }
    
    /*
    *pre: 
    *post: prints the tree in preorder traversal 
    */
    //Calls the recursive preorder traversal to print the tree in that given order
    void callPreorder() {
        preorder(root);
        System.out.println("\n");
       
    }
    
    /*
    *pre: root references a subtree
    *post: prints all the values in preorder traversal 
    */
    //Recursively visits the nodes in preorder (root, left, right) traversal and prints them
    void preorder(Node root) {
        if (root != null) {
            System.out.print(root.input + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    /*
    *pre: 
    *post: prints the tree in post order traveral 
    */
    //Calls the recursive postorder traversal method to print the tree in order
    void callPostorder() {
        postorder(root);
        System.out.println("\n");
    }
    
    /*
    *pre: root references a subtree
    *post: prints all values in postorder traversal 
    */
    // Recursively visits node in postorder (left, right, root) and prints them
    void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.input + " ");
        }
    }

}