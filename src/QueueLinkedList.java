
public class QueueLinkedList {
	private int size;
	private Order[] data;

	
	public boolean isEmpty() {
		if(size == 0) {
			return true;
		}
		return false;
	}
	
	public void printQueue() {
		for(Order o: data) {
			System.out.println(o);
		}
	}

	public void enqueue(Order o) {
		// TODO Auto-generated method stub
		
	}

	public Order dequeue() {
		// TODO Auto-generated method stub
		return null;
	}
}
