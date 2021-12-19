package edu.ualbany.Project_4;
import java.util.LinkedList;

public class AddressBook {
	
	/**
	 * Data structure used for this address book.
	 */
	protected BinarySearchTree<Contact> tree;
	
	/**
	 * Constructs an empty address book.
	 */
	public AddressBook(){
		this.tree = new BinarySearchTree<Contact>();
	}
	
	/**
	 * Inserts a contact into the address book.
	 * @param contact The contact to be inserted into the address book.
	 */
	public void insertCon(Contact contact){
		this.tree.insert(contact);
	}
	
	/**
	 * Searches for a contact in the address book returns a reference to the contact in the book.
	 * @param contact The contact to be searched for.
	 * @return A reference to the contact.
	 * @throws TreeException if the contact is not in the AddressBook.
	 */
	public Contact search(Contact contact) throws TreeException{
		Contact newCon = new Contact();
		newCon = this.tree.retrieve(this.tree.root, contact);
		return newCon;
	}
	
	/**
	 * Checks if this address book is empty.
	 * @return The boolean value true if empty and false if not.
	 */
	public boolean isBookEmpty(){
		return this.tree.isEmpty();
	}
	
	/**
	 * Makes this address book empty.
	 */
	public void makeBookEmpty(){
		this.tree.makeEmpty();
	}
	
	/**
	 * Finds the contacts with the same zipcode as the parameter and assembles them in a linked list.
	 * @param zipcode The zipcode to look for in the book.
	 * @return The linked list containing all the contacts with the same zipcode.
	 */
	public LinkedList<Contact> sameZip(String zipcode){
		LinkedList<Contact> list = new LinkedList<Contact>();
		TreeIterator<Contact> iterator = new TreeIterator<Contact>(this.tree);
		iterator.setInorder();
		while(iterator.hasNext()){
			if(iterator.list.element().getData().getAddress().getZipcode().compareTo(zipcode)==0){
				list.add(iterator.list.element().getData());
			}
			iterator.next();
		}
		return list;
	}
	
	/**
	 * Finds the contacts with the same city as the specified parameter and assembles them into a linked list.
	 * @param city The city to look for in the book.
	 * @return The linked list containing all the contacts with the same City.
	 */
	public LinkedList<Contact> sameCity(String city){
		LinkedList<Contact> list = new LinkedList<Contact>();
		TreeIterator<Contact> iterator = new TreeIterator<Contact>(this.tree);
		iterator.setInorder();
		while(iterator.hasNext()){
			if(iterator.list.element().getData().getAddress().getCity().compareTo(city)==0){
				list.add(iterator.list.element().getData());
			}
			iterator.next();
		}
		return list;
	}
	
	/**
	 * Finds the contacts with the same area code as the specified parameter and assembles them into a linked list.
	 * @param city The area code to look for in the book.
	 * @return The linked list containing all the contacts with the same area code.
	 */
	public LinkedList<Contact> sameAC(String AC){
		LinkedList<Contact> list = new LinkedList<Contact>();
		TreeIterator<Contact> iterator = new TreeIterator<Contact>(this.tree);
		iterator.setInorder();
		while(iterator.hasNext()){
			if(iterator.list.element().getData().getPhonenumber().substring(0,3).compareTo(AC)==0){
				list.add(iterator.list.element().getData());
			}
			iterator.next();
		}
		return list;
	}
	
	
	
	
}
