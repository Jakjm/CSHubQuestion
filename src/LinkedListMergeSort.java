
public class LinkedListMergeSort {

	public LinkedListMergeSort() {

	}
	public static class Node{
		private int item;
		public Node next;
		public Node(int item) {
			this.item = item;
			this.next = null;
		}
		public int getItem() {
			return item;
		}
	}
	
	/**
	 * Sorts the linked list
	 * @param head - the head of the linked list.
	 * 
	 * Input:
	 * 5 -> 2 -> 3
	 * Expected output: The items should be in ascending order.
	 * 2 -> 3 -> 5 
	 */
	public static void sort(Node head) {
		//read the items into an array
		//sort the array                                         <-- don't do this
		//put the items in order back in the linked list 
	}
	
	public static void main(String [] args) {
		int [] exampleArr = new int [] {10, 5, 7, 8, 9, -1};
		Node head = createList(exampleArr);
		
		printList(head);
		
		sort(head);
		
		printList(head);
		//-1 5 7 8 9 10
	}
	
	public static void printList(Node n) {
		while(n != null) {
			System.out.print(n.item + " ");
			n = n.next;
		}
		System.out.println();
	}
	
	//Creates a linked list from an array of integers.
	public static Node createList(int [] array) {
		if(array.length == 0)return null;
		
		Node list = new Node(array[0]);
		Node current = list;
		for(int i = 1;i < array.length;++i) {
			//Make a new node with the current element
			current.next = new Node(array[i]);
			current = current.next;
		}
		return list;
	}
}
