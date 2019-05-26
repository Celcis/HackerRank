package hackerrank;

public class Singly {

	Node head;
	
	public int addNodeToFront(Singly list, int data) {
		
		
		
		Node node = new Node(data);
		if(head == null) {
			head= node;
		}else {
			
			Node tmp=head;
			head =node;
			
			Node current = tmp;
			while(current.next !=null) {
				current = current.next;
			}
			
			current.next= tmp;
		
		}
		
		
		return head.data;
		
	}
}
