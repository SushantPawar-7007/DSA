
public class Test {

	
	public static void main(String[] args) {
		LL  l1=new LL();
		l1.addatFirst(12);
		l1.addatFirst(10);
		l1.addatFirst(9);
		l1.addatFirst(11);
	
		l1.addLast(112);
		l1.addLast(111);
		l1.addLast(113);
		l1.addLast(114);
		
		l1.deleteFirst();
		l1.deleteFirst();
		l1.deleteFirst();
		l1.display();
	}

}
