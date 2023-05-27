
public class DynamicQTest {
	public static void main(String[] args) {
		DyQueue D1=new DyQueue();
		
		D1.enque(171);
		D1.enque(7);
		D1.enque(495);
		D1.enque(5);
		D1.enque(85);
		 
		System.out.println("Disply the Queue:-" );
		D1.display();
		
		System.out.println("\n Element Deleted from Queue:-"+D1.deque().getData());
		//D1.deque();
		
		System.out.println("Top Most element in Queue:-" +D1.peak().getData());
		
		System.out.println("Queue after deletion of element:-");
		D1.display();
	}
}
