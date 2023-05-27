
public class Node {

	Node pre;
	int data;
	Node Next;
	
	public Node( int data) {
		
		this.pre = null;
		this.data = data;
		Next = null;
	}

	public Node getPre() {
		return pre;
	}

	public void setPre(Node pre) {
		this.pre = pre;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return Next;
	}

	public void setNext(Node next) {
		Next = next;
	}
	
}
