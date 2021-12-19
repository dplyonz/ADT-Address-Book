package edu.ualbany.Project_4;
import java.util.LinkedList;
/**
 * Generic tree iterator implementing Iterator interface
 * @author Derren Lyons
 * @version 1.0
 */
public class TreeIterator<E extends Comparable<E>> implements java.util.Iterator<E>{
	
	/**
	 * The tree that will be used to be iterated over.
	 */
	private BaseBinaryTree<E> tree;
	
	/**
	 * The linked list used to maintain the current traversal of the nodes in the tree.
	 */
	protected LinkedList<TreeNode<E>> list;
	
	/**
	 * Constructor for iterator over a Binary Tree.
	 * @param tree The tree to be iterated over.
	 */
	public TreeIterator(BaseBinaryTree<E> tree){
		this.tree = tree;
		this.list = new LinkedList<TreeNode<E>>();
	}

	/**
	 * Checks if the iteration has any more elements in the list.
	 * @return True if there are more elements in the list.
	 */
	public boolean hasNext(){
		return !this.list.isEmpty();
	}
	
	/**
	 * Gets the next element in the list.
	 * @returns next element in the list.
	 * @throws NoSuchElementException if there are no more elements in the list.
	 */
	public E next() throws java.util.NoSuchElementException{
		return this.list.remove().getData();
	}
	
	/**
	 * Sets the method of traversal to be preorder.
	 */
	public void setPreorder(){
		this.list.clear();
		this.Preorder(this.tree.root);
	}
	
	/**
	 * Traverses the tree in preorder.
	 * @param node The root of the binary tree to be traversed.
	 */
	private void Preorder(TreeNode<E> node){
		if(node != null){
			this.list.add(node);
			Preorder(node.getLeft());
			Preorder(node.getRight());
		}
	}
	
	/**
	 * Sets the method of traversal to be inorder.
	 */
	public void setInorder(){
		this.list.clear();
		this.Inorder(this.tree.root);
	}
	
	/**
	 * Traverses the tree in inorder.
	 * @param node The root of the binary tree to be traversed.
	 */
	private void Inorder(TreeNode<E> node){
		if(node != null){
			Inorder(node.getLeft());
			this.list.add(node);
			Inorder(node.getRight());
		}
	}
	
	/**
	 * Sets the method of traversal to be postorder.
	 */
	public void setPostorder(){
		this.list.clear();
		this.Postorder(this.tree.root);
	}
	
	/**
	 * Traverses the tree in postorder.
	 * @param node The root of the binary tree to be traversed.
	 */
	private void Postorder(TreeNode<E> node){
		if(node != null){
			Postorder(node.getLeft());
			Postorder(node.getRight());
			this.list.add(node);
		}
	}
	
	
	
}
