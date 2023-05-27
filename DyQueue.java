
public class DyQueue {

	QNode front,rear;

	public DyQueue() {
		
		this.front = null;
		this.rear = null;
	}
	
	

	public QNode getFront() {
		return front;
	}

	public void setFront(QNode front) {
		this.front = front;
	}

	public QNode getRear() {
		return rear;
	}

	public void setRear(QNode rear) {
		this.rear = rear;
	}
	
	
	
	public boolean isEmpty()
	{
		if(rear==null)
		return true;
		return false;
		
//		return rear==null;
	}
	
	public void enque(int value)
	{
		QNode Newnode=new QNode(value);
		if(Newnode==null)
			return ;
		if(front==null)
		{
			rear=front=Newnode;
		}
		rear.setNext(Newnode);
		rear = Newnode;
		
	}
	public QNode deque()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty");
			return null;
		}
		QNode temp=front;
		front=front.getNext();
		temp.setNext(null);
		return temp;
	}
	public QNode peak()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty");
			return null;
		}
		
		
		return front;
	}
	
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty");
			return;
		}
		for(QNode i=front;i!=null;i=i.getNext())
		{
			System.out.print("\t"+i.getData());
		}
		
	}
	
}
