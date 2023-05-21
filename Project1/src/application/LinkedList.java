package application;


public class LinkedList <T extends Comparable <T>> {

	protected Node <T> head;

	public Node<T> getHead() {
		return head;
	}

	public void setHead(Node<T> head) {
		this.head = head;
	}

	public void traverse () {
		traverse (head);
	}

	private void traverse (Node <T> node) {

		if (node == head) 
			System.out.print("Head --> ");
		if (node == null) {
			System.out.println("null");
		}
		else {
			System.out.print(node+" --> ");
			traverse(node.getNext());
		}

	}

	public String toStr () {
		String out = "";
		Node <T> curr = head;
		while (curr != null) {
			out+=curr.getData();
			out+="\n";
			curr=curr.getNext();
		}
		return out;
	}

	public void insert (T data) {
		Node <T> newNode = new Node <> (data);
		Node <T> prev = null,curr = head;

		for ( ; curr != null && curr.getData().compareTo(data)<0 ; prev = curr, curr = curr.getNext()) {
		}

		if (head == null)
			head = newNode;
		else if (prev == null) {
			newNode.setNext(head);
			head = newNode;
		}
		else if (curr == null) {
			prev.setNext(newNode);
		}
		else {
			newNode.setNext(curr);
			prev.setNext(newNode);
		}

	}

	public void delete (T data) {


		if (head == null)
			System.out.println("Error: Empty List.");
		Node <T> prev = null,curr = head;

		for ( ; curr != null && curr.getData().compareTo(data)<0 ; prev = curr, curr = curr.getNext()) {
		}

		if (curr == null ) 
			System.out.println("Error: not found.");
		if (curr.getData().equals(data)) {
			if (curr == head)
				head = head.getNext(); 
			else 
				prev.setNext(curr.getNext());
				
		}
		else 
			System.out.println("Not found.");

	}

	public Node <T> search (Flights data) {
		if (head == null)
			System.out.println("Error: Empty List.");
		Node <T> prev = null,curr = head;
		for ( ; curr != null && curr.getData().compareTo((T) data)<0 ; prev = curr, curr = curr.getNext()) {
		}
		if (curr == null) 
			return null;
		if (curr.getData().equals(data))
			return curr;
		return null;
	}

	public String Search (T data) {
		String out = "";

		if (head == null)
			System.out.println("Error: Empty List.");
		Node <T> prev = null,curr = head;
		for ( ; curr != null && curr.getData().compareTo(data)<0 ; prev = curr, curr = curr.getNext()) {
		}
		if (curr == null) 
			return null;
		if (curr.getData().equals(data)) {
			Node <Flights> curr1 = (Node<Flights>) head; 
			while (curr1 != null) {
				out+=curr1.getData();
				out+="\n";
				curr1=curr1.getNext();
			}
			System.out.println(out);
			return out;

		}
		return null;
	}

	public boolean capcity (Node <Flights> curr) {
		Node <Passengers> curr0 = curr.getData().getPassengerList().getHead();
		int length = 0;
		for ( ; curr0 != null ; curr0 = curr0.getNext()) {
			length+=1;
		}
		if (length == curr.getData().getCapacity())
			return false;
		else
			return true;
	}


}


