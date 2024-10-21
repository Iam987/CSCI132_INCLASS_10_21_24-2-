
public class QueueArray {
	private int size;
	private Order[] data;
	private int capacity;
	private int front;

	public QueueArray(int s) {
		data = new Order[s];
		size = 0;
		capacity = s;
		front = 0;
	}
	
	public boolean isEmpty() {
		if(size == 0) {
			return true;
		}
		return false;
	}
	
	public void printQueue() {
		int start = front;
		int n = 0;
		
		while (n != size) {
			System.out.println((n+1) + ":" + data[start]);
			start++;
			n++;
		}
	}

	public void enqueue(Order o) {
		if (size == capacity) {
			System.out.println("Queue is full");
			return;
		}
		int insert_spot = front + size;
		data[insert_spot] = o;
		size ++;
		
	}

	public Order dequeue() {
		if (size == 0) {
			System.out.println("There is nothing to remove");
			return null;
		}
		Order temp = data [0];
		for(int i = 0; i < size-1; i++) {
			data[i] = data [i+1];
		}
		data[size - 1] = null;
		return temp;
	}
	
	public Order peek() {
		return data[front];
	}
}
