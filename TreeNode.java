package edu.ualbany.Project_4;

/**
 * Generic Node class with constructors,getters,and setters to be used in conjunction with Binary Tree
 * @author Derren Lyons
 * @version 1.0
 */
public class TreeNode<E extends Comparable<E>> {

	/**
	 * Declares the data to be stored into the node.
	 */
	private E data;
	
	/**
     * Declares left child node to be used in the tree.
	 */
	protected TreeNode<E> left;
	
	/**
	 * Declares right child node to be used in the tree.
	 */
	protected TreeNode<E> right;
	
	/**
	 * Constructs a newly created Node that holds no data with two null pointers.
	 */
	public TreeNode(){
		this(null,null,null);
	}
	
	/**
	 * Constructs a Node that holds some data with two null pointers.
	 * @param data The data to be passed into the Node.
	 */
	public TreeNode(E data){
		this(data,null,null);
	}
	/**
	 * Constructs a newly created Node with some data passed in and two child Nodes to be linked in the tree.
	 * @param data The data to be passed into the Node.
	 * @param previous The left Node to be linked to this Node.
	 * @param next The right Node to be linked to this Node.
	 */
	public TreeNode(E data, TreeNode<E> left, TreeNode<E> right){
		this.data = data;
		this.left = left;
		this.right = right;
	}
	
	/**
	 * Gets the data stored at this node.
	 * @return The item at this node.
	 */
	public E getData(){
		return this.data;
	}
	
	/**
	 * Sets the item stored at this node in the tree.
	 * @param item The data to be stored at this node.
	 */
	public void setData(E data){
		this.data = data;
	}
	
	/**
	 * Gets the left node linked in the tree.
	 * @return Reference to the left node following the current node.
	 */
	public TreeNode<E> getLeft(){
		return this.left;
	}
	
	/**
	 * Gets the right node linked in the tree.
	 * @return Reference to the right node following the current node.
	 */
	public TreeNode<E> getRight(){
		return this.right;
	}
	
	/**
	 * Sets the left node to be linked in the tree.
	 * @param node The left node to be linked in the tree.
	 */
	public void setLeft(TreeNode<E> node){
		this.left = node;
	}
	
	/**
	 * Sets the left node to be linked in the tree.
	 * @param node The left node to be linked in the tree.
	 */
	public void setRight(TreeNode<E> node){
		this.right = node;
	}
	
	

}

