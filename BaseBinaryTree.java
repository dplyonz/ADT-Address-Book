package edu.ualbany.Project_4;

/**
 * Basic BinaryTree class with constructors and operations on the root.
 * @author Derren Lyons
 * @version 1.0
 */
public class BaseBinaryTree<E extends Comparable<E>> {
	
	/**
	 * The root node of this tree
	 */
	protected TreeNode<E> root;
	
	/**
	 * Default constructor of a basic binary tree
	 */
	public BaseBinaryTree(){
		this.root = null;
	}
	
	/**
	 * Constructor of a basic binary tree with a known root Node
	 * @param node The tree node to be used as the root
	 */
	public BaseBinaryTree(TreeNode<E> node){
		this.root = node;
	}
	
	/**
	 * Gets the root of the binary tree
	 * @return A reference to the root node.
	 * @throws TreeException if the tree being referenced has no nodes.
	 */
	public E getRoot() throws TreeException{
		if(this.root == null){
			throw new TreeException("This tree is empty");
		}else{
		return this.root.getData();
		}
	}
	
	/**
	 * Changes the root of the tree to a new root.
	 * @param node The node to act as the new root of the tree.
	 */
	public void setRoot(TreeNode<E> node){
 		this.root = node;
	}
	
	/**
	 * Checks if the binary tree has any elements.
	 * @return A boolean true if empty and false if not empty.
	 */
	public boolean isEmpty(){
		return this.root == null;
	}
	
	/**
	 * Makes a binary tree empty by setting its root node to a null pointer
	 */
	public void makeEmpty() {
		this.root = null;
	}
	
	
}
