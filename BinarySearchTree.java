package edu.ualbany.Project_4;

/**
 * Binary search tree class that is a subclass of the Binary Tree class. Has the methods for
 * insertions and deletions, as well as search and retrieval operations.
 * @author Derren Lyons
 * @version 1.0
 */
public class BinarySearchTree<E extends Comparable<E>> extends BaseBinaryTree<E>{
	
	
	/**
	 * Search function for the tree.
	 * @param root The root of the tree to be searched.
	 * @param key The search key to be used for the item in the tree.
	 * @return A reference to the node of the searched item in the tree.
	 */
	public TreeNode<E> search(TreeNode<E> root, E key){
		if(root == null){
			return root;
		}else if(key.compareTo(root.getData())==0){
			return root;
		}else if(root.getData().compareTo(key) < 0){
			return search(root.getRight(), key);
		}else{
		return search(root.getLeft(), key);
		}
	}
	
	/**
	 * Retrieves the element stored in the binary search tree if there is a node in the tree containing said element.
	 * @param root The root of the tree to be parsed.
	 * @param key The element to be retrieved from the tree.
	 * @return A reference to a specified element of a node.
	 * @throws TreeException if there is no such element found in the tree.
	 */
	public E retrieve(TreeNode<E> root, E key) throws TreeException{
		if(root == null){
			throw new TreeException("No item at this location");
		}else if(key.compareTo(root.getData())==0){
			return root.getData();
		}else if(root.getData().compareTo(key) < 0){
			return retrieve(root.getRight(), key);
		}else{
		return retrieve(root.getLeft(), key);
		}
	}
	
	/**
	 * Calls recursive Insert function similar to search function but instead of returning a reference
	 * it inserts a Node containing data at the empty subtree.
	 * @param data The data to be inserted as a new leaf in the tree.
	 */
	public void insert(E data){
		this.root = SearchandIns(this.root,data);
	}
	
	/**
	 * Recursive search function that inserts a new TreeNode after terminating at the proper empty subtree
	 * @param node The node to be inserted at the empty subtree
	 * @param data The data to be held at the leaf
	 * @return The node to be the new root of this leaf
	 */
	private TreeNode<E> SearchandIns(TreeNode<E> node, E data){
		if(node==null){
			node = new TreeNode<E>(data);
			return node;
		}
		if(node.getData().compareTo(data)>0){
			node.left = SearchandIns(node.left,data);
		}
		if(node.getData().compareTo(data)<0){
			node.right = SearchandIns(node.right,data);
		}return node;
	}
	
	/**
	 * Deletes an element from the tree
	 * @param root The root of the tree the element is located in
	 * @param key The element to be deleted.
	 */
	public void delete(E key){
		this.root = SearchandDelete(this.root, key);
	}
	
	private TreeNode<E> SearchandDelete(TreeNode<E> node, E key){
		if(node == null){
			return node;
		}
		if(node.getData().compareTo(key)>0){
			node.left = SearchandIns(node.left,key);
		}
		if(node.getData().compareTo(key)<0){
			node.right = SearchandIns(node.right,key);
		}return node;
	}
	
}
