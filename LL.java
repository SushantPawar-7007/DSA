
public class LL {
	private Node head;
	public LL() 
	{
		this.head=null;
	}
	public Node getHead()
	{
		return head;
	}
	public void setHead(Node head)
	{
		this.head=head;
	}
	public boolean addatFirst(int a)
	{
		Node newnode=new Node(a);
		
	    if(head==null)
		 {
			head=newnode;	
			return true;
		 }	
		else
		{
			newnode.setNext(head);
			head=newnode;
			return true;
		}
	    

//		if(head!=null)
//			newnode.setNext(head);
//		head=newnode;
//		return true;
//		
	}
	
	public void addLast(int b)
	{
		
		Node nn=new Node(b);
		Node temp;
		temp=head;
		while(temp.getNext()!=null)
		{
			temp=temp.getNext();
		}
		  temp.setNext(nn);
		  
		}
	
	public void deleteFirst()
	{
		Node temp;
		temp=head;
        if(temp!=null)
			
		{ 
			if(temp.getNext()==null)
			{
				head=null;
			}
			else
			{
				head=temp.getNext();
			}
		}
		
	}
	
	public void display()
	{
		Node temp=head;
		System.out.println("List of elements");
		 while(temp!=null)
		 {
			 System.out.print("\t"+ +temp.getData());
			 temp=temp.getNext();
		 }
		
	}
	
}
