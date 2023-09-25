package Chapter25;

import com.sun.source.tree.TreeVisitor;

public abstract class AbstractTree<E>
 implements Tree<E> {
    /** Return true if the element is in the tree */
public abstract boolean search(E e);

    /** Insert element e into the binary search tree.
35 * Return true if the element is inserted successfully. */
public abstract boolean insert(E e);

    @Override /** Inorder traversal from the root*/
 public void inorder() {
        }

        @Override /** Postorder traversal from the root */
 public void postorder() {
 }

        @Override /** Preorder traversal from the root */
public void preorder() {
        }

        @Override /** Return true if the tree is empty */
public boolean isEmpty() {
        return getSize() == 0;
}

    public abstract Kind getKind();

    public abstract <R, D> R accept(TreeVisitor<R, D> visitor, D data);

    /** Get the number of nodes in the tree */
public abstract int getSize();

    /** Delete an element from the binary search tree.
153 * Return true if the element is deleted successfully.
154 * Return false if the element is not in the tree. */
public abstract boolean delete(E e);

    /** Obtain an iterator. Use inorder. */
public abstract java.util.Iterator<E> iterator();
}