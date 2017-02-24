package algorithmen;
/**
 * 
 * @author jonas
 *
 *Singly linked list
 *
 * @param <T> type of the parameter
 */

public class LinkedList<T> 
{
	private Node head;
	private int size;
	
	public LinkedList()
	
	{
		head = null;
		size = 0;
	}
	/**
	 * constructor for the linked list with one element
	 * 
	 * @param elemenet
	 */
	public LinkedList(T elemenet)
	{
		head = new Node(elemenet);
		size = 1;
	}
	
	private LinkedList(Node node){
		head = node;
		size = count();
	}
	
	
	private int count(){
		if(head ==null) return 0;
		int total = 1;
		while(head.next() != null){
			total++;
		}
		return total;
	}
	/*
	 * 
	 * return the linked list without the head element
	 */
	public LinkedList<T>tail()
	{return new LinkedList<T>(head.next());
		
	}
	
	
	/**
	 * appends the element to the linked list
	 * @param element
	 */
	public void preappend(T element)
	{
		Node newNode = new Node(element, head);
		head = newNode;
		size ++;
	}
	/**
	 * 
	 *
	 * @return the head of the list
	 */
	
	public T first()
	{
		if(head == null)return null;
		return head.get();
		
	}
	/*
	 * 
	 * return size list
	 */
	public int size()
	{
		return size;
	}
	
	public boolean isEmpty()
	{
		return size == 0;
		
	}
	
	/*
	 * return the last element of the list
	 */
	public T last(){
		Node cursor = head;
		while(cursor.next !=null){
			cursor = cursor.next();
		}
		return cursor.get();
	}
	
	
	private class Node
	{
		private T element;
		private Node next;
		
		public Node(T element)
		{
			this(element,null);
		}
		
		public Node(T element, Node next)
		{
			this.element = element;
			this.next = next;
			
		}
		
		public T get()
		{
			return element;
		}
		
		public Node next()
		{
			return next;
		}
	}
	
	
}
