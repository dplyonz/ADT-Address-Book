package edu.ualbany.Project_4;

/**
 * Define subclass of java.lang.RuntimeException
 * @author Derren Lyons
 * @version 1.0
 */
public class TreeException extends java.lang.RuntimeException {

	/**
	 * Defines an exception to be thrown if there is an attempt to get a root from an empty tree.
	 * @param message A message that defines why the exception is being thrown.
	 */
	public TreeException(String message){
		super(message);
	}
}
