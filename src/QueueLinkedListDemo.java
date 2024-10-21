
public class QueueLinkedListDemo {

	public static void main(String[] args) {
		Order o1 = new Order("Reece","Cookie","Coffee");
		Order o2 = new Order("Ian","Beep","Something");
		Order o3 = new Order("aiosdf","fd","Sg");
		Order o4 = new Order("In","Bp","Song");

		QueueLinkedList Queue = new QueueLinkedList();
		
		Queue.enqueue(o1);
		Queue.enqueue(o2);
		Queue.enqueue(o3);
		Queue.enqueue(o4);
		
		Queue.printQueue();
		
		System.out.println("-------------------------------");
		Order removed = Queue.dequeue();
		System.out.println(removed);
		
		System.out.println("-------------------------------");
		Queue.enqueue(new Order("new","news","ndw"));
		Queue.printQueue();
	}

}
