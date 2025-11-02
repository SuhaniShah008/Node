class Node{
    int input; //the value stored in the node
    Node left, right; //references the left and right node in the binary search tree
    
    /*
    * pre: key is a valid integer 
    * post: creates a new node with the given key and initializes left and right children to null 
    */
    //Represents a single node in the binary search tree.
    public Node(int key) {
        input = key;
        left = null;
        right = null;
    }

    /* 
    *pre: 
    *post: returns a string representation of the node 
    */
    //Converts the nodes integer value to a string for easy printing.
    @Override
    public String toString(){
        return Integer.toString(this.input);
    }   
    
    /* 
    *pre: data is a valid Node object
    *post: returns a negative, zero, or positive value based on comparison 
    */
    // Compares this nodes value to another nodes value.
    public int compareTo(Node data){
        return Integer.compare(this.input, data.input);
    }
    
    /* 
    *pre: obj is any object 
    *post: returns true if obj is a Node and has the same input value, otherwise false 
    */
    // Checks if two nodes are equal based on their input values.
    @Override
    public boolean equals(Object obj){
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
    Node that = (Node) obj;
    return this.input == that.input;

    }
}