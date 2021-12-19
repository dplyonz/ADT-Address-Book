package edu.ualbany.Project_4;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.LinkedList;

public class Helper {

	public static void start() throws FileNotFoundException{
		//testing for part A of project
		BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();
		createA(tree);
		displayA(tree);
		//testing for part B of project
		AddressBook list = new AddressBook();
		createB(list);
		displayB(list);
		
	}
	
	private static void createA(BinarySearchTree<Integer> tree){
		ArrayList<Integer> list = new ArrayList<Integer>();
		int arr[] = {60,20,70,10,40,30,50};
		for(int i =0; i<7; i++){
			list.add(arr[i]);
		}
		for(int i =0; i<7;i++){
			tree.insert(list.get(i));
		}
	}
	
	private static void createB(AddressBook list) throws FileNotFoundException{
 
		//creating contact objects and inserting them into address book
		ArrayList<Contact> Contacts = new ArrayList<Contact>();
		Scanner scanner = new Scanner(new File("Contacts.txt"));
		Address address1 = new Address("6649 N Blue Gum St","New Orleans","LA","70116");
		Address address2 = new Address("4 B Blue Ridge Blvd","Brighton","MI","48116");
		Address address3 = new Address("8 W Cerritos Ave # 54","Bridgeport", "NJ", "80114");
		Address address4 = new Address("639 Main St","Anchorage","AK","99501");
		Address address5 = new Address("34 Center St","Hamilton","OH","45011");
		Address address6 = new Address("3 Mcauley Dr","Ashland","OH","44805");
		Address address7 = new Address("90991 Thorburn Ave","New York","NY","10011");
		Address address8 = new Address("2742 Distribution Way","New York","NY","10025");
		Address address9 = new Address("1747 Calle Amanecer #2","Anchorage","AK","99501");


		Contact contact1 = new Contact("James","Butt",address1,"504-621-8927");
		Contact contact2 = new Contact("Josephine","Darakjy",address2,"810-292-9388");
		Contact contact3 = new Contact("Art","Venere",address3,"856-636-8749");
		Contact contact4 = new Contact("Lenna","Paprocki",address4,"907-385-4412");
		Contact contact5 = new Contact("Donette","Foller",address5,"513-570-1893");
		Contact contact6 = new Contact("Simona","Morasca",address6,"419-503-2484");
		Contact contact7 = new Contact("Willow","Kusko",address7,"212-582-4976");
		Contact contact8 = new Contact("Alishia","Sergi",address8,"212-860-1579");
		Contact contact9 = new Contact("Wilda","Giguere",address9,"907-870-5536");

		Contacts.add(contact1);
		Contacts.add(contact2);
		Contacts.add(contact3);
		Contacts.add(contact4);
		Contacts.add(contact5);
		Contacts.add(contact6);
		Contacts.add(contact7);
		Contacts.add(contact8);
		Contacts.add(contact9);
		
		for(int i = 0; i<Contacts.size();i++){
			list.insertCon(Contacts.get(i));
		}
		scanner.close();
	}

	private static void displayB(AddressBook list){
		//traverse Book in Preorder,Inorder,Postorder
		TreeIterator<Contact> iterator = new TreeIterator<Contact>(list.tree);
		iterator.setPreorder();
		System.out.println("-----Preorder----");
		while(iterator.hasNext()){
			System.out.println(iterator.next().getFirstName());
		}
		iterator.setInorder();
		System.out.println("-----Inorder----");
		while(iterator.hasNext()){
			System.out.println(iterator.next().getFirstName());
		}
		iterator.setPostorder();
		System.out.println("-----Postorder----");
		while(iterator.hasNext()){
			System.out.println(iterator.next().getFirstName());
		}
		
		//testing search function
		System.out.println("Retrieve a reference to Contact: James");
		Contact c = new Contact();
		c.setName("James","Butt");
		c = list.search(c);
		System.out.println("---->"+c.getFirstName()+" "+c.getLastName());
		
		//traverse book and assemble all contacts with the same zip code into a linked list
		String zip = "99501";
		LinkedList<Contact> newlist = list.sameZip(zip);
		for(int i =0; i< newlist.size();i++){
			//print the zipcodes of the contacts in the list.
			System.out.println(newlist.get(i).getAddress().getZipcode());
		}
		
		//traverse book and assemble all contacts with the same city "New York" in this case into a linked list
		String city = "New York";
		LinkedList<Contact> newlist2 = list.sameCity(city);
		for(int i =0; i< newlist2.size();i++){
			//print the cities of the contacts in the list.
			System.out.println(newlist2.get(i).getAddress().getCity());
		}
		
		//traverse book and assemble all contacts with the same area code into a linked list
		String areaCode = "212";
		LinkedList<Contact> newlist3 = list.sameAC(areaCode);
		for(int i =0; i< newlist3.size();i++){
			//print the phone numbers of the contacts in the list.
			System.out.println(newlist3.get(i).getPhonenumber());
		}
				
		//testing isEmpty function
		System.out.println("isEmpty??"+list.isBookEmpty());
				
		//testing makeEmpty function
		System.out.println("Making tree empty and repeating...");
		list.makeBookEmpty();
		System.out.println("isEmpty??"+list.isBookEmpty());
		
	}
	private static void displayA(BinarySearchTree<Integer> tree){
		TreeIterator<Integer> iterator = new TreeIterator<Integer>(tree);
		iterator.setPreorder();
		System.out.println("-----Preorder----");
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		iterator.setInorder();
		System.out.println("-----Inorder----");
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		iterator.setPostorder();
		System.out.println("-----Postorder----");
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		//testing retrieve function
		System.out.println("Retrieve a reference to number 60");
		int num;
		int key = 60;
		num = tree.retrieve(tree.root, key);
		System.out.println("---->"+num);
		
		//test search
		TreeNode<Integer> node = tree.search(tree.root, key);
		System.out.println("Testing search function... returning data from node that was returned after searching tree for 60---->"+node.getData());
		
		//testing isEmpty function
		System.out.println("isEmpty??"+tree.isEmpty());
		
		//testing makeEmpty function
		System.out.println("Making tree empty and repeating...");
		tree.makeEmpty();
		System.out.println("isEmpty??"+tree.isEmpty());
		
	}
}
