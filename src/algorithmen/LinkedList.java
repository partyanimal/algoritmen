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
	}
	
}
