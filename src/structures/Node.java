package structures;

public class Node {
		
	//Infromaci�n
	private int value;
	
	//Enlaces
	private Node next;
	
	public Node(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	
}