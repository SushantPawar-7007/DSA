
public class DoublyircularLL {

	
	Node head;
	Node tail;
	
	
	public DoublyircularLL() {
		
		this.head = null;
		this.tail =null;
	}


	public Node getHead() {
		return head;
	}


	public void setHead(Node head) {
		this.head = head;
	}


	public Node getTail() {
		return tail;
	}


	public void setTail(Node tail) {
		this.tail = tail;
	}
	
	
	public boolean InsertatBeg(int value)
	{
		Node Newnode=new Node(value);
		if(Newnode==null)
			return false;
		if(head==null){
			head=tail=Newnode;
		head.setNext(Newnode);
		head.setPre(Newnode);
		}
		else{
		Newnode.setPre(tail);
		Newnode.setNext(head);
		head.setPre(Newnode);
		head=Newnode;
		tail.setNext(head);
		
		}
		
		
		return true;
		
		
	}
	
	public void Display()
	{
		if(head==null){
			System.out.println("list is empty");
			return;
		}
		Node temp=head;
		while(temp.getNext()!=head)
		{
			System.out.print( "  "+temp.getData());
			temp=temp.getNext();	
		}
		System.out.print("  "+temp.getData());
	}
	
	public boolean  DeleteatBeg()
	{
		if(head==null)
		{
			System.out.println("list is empty");
			return false;
		}
		Node t=head.getNext();
		t.setPre(tail);
		tail.setNext(t);
		head.setNext(null);;
		head.setPre(null);
		head=t;
		return true;
	}
	public boolean InsertatLast(int value)
	{
		Node Newnode=new Node(value);
		if(Newnode==null)
			return false;
		if(head==null)
			head=tail=Newnode;
		tail.setNext(Newnode);
		Newnode.setPre(tail);
		Newnode.setNext(head);
		tail=Newnode;
		head.setPre(tail);
		return true;
	}
	public boolean  DeleteatLast()
	{
		if(head==null)
		{
			System.out.println("list is empty");
			return false;
		}
		Node temp=tail;
		tail=tail.getPre();
		tail.setNext(head);
		temp.setNext(null);
		temp.setPre(null);
		head.setPre(tail);
		return true;
	}
	
	
	public boolean InsertatPos(int value,int pos)
	{
		
		
		if(pos<=0)
		{
			System.out.println("invalid");
			return false;
		}
		if(pos==1)
		{
			InsertatBeg(value);
		}
		Node Newnode =new Node(value);
		if(Newnode==null)
		{
			return false;
		}
		int i=1;
		Node temp=head;
		while(i<pos-1)
		{
			i++;
			temp=temp.getNext();
			if(temp==null)
			{
				System.out.println("Invalid pos");
			}
		}
		if(temp.getNext()==head)
		{
			temp.setNext(Newnode);
			Newnode.setPre(temp);
			Newnode.setNext(head);
			tail=Newnode;
			head.setPre(tail);
		}
		Node t=temp.getNext();
		temp.getNext().setNext(Newnode);
		Newnode.setPre(temp.getNext());
		Newnode.setNext(t.getNext());
		t.getNext().setPre(Newnode);
		return true;
		
		
	}
	public boolean DeleteatPos(int pos)
	{
		if(pos<=0)
		{
			System.out.println("invalid");
			return false;
		}
		if(pos==1)
		{
			DeleteatBeg();
		}
	
		Node temp =head;
		int i=1;
		while(i<pos-1)
		{
			temp=temp.getNext();
			if(temp.getNext()==head)
			{
				System.out.println("\nInvalid Position");
				return false;
			}
		}
		Node t=temp.getNext();
		temp.setNext(t.getNext());
		t.getNext().setPre(temp);
		if(t.getNext()==head)
		{
			tail=temp;
		}
		t.setNext(null);
		t.setPre(null);
		return true;
		
	}
}
