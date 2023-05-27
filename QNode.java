
public class QNode {

	int data;
	QNode Next;
	
	public QNode(int data) {
		
		this.data = data;
		Next = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public QNode getNext() {
		return Next;
	}

	public void setNext(QNode next) {
		Next = next;
	}
	
	
}
