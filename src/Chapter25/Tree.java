package Chapter25;

public interface Tree<E> {
    /** Inorder traversal from the root*/
    void inorder();

    /** Postorder traversal from the root */
    void postorder();

    /** Preorder traversal from the root */
    void preorder();

    /** Return true if the tree is empty */
    boolean isEmpty();
}
