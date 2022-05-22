public class QueueMain {

	public static void main(String[] args) {
		
		QueueMethods<Integer>  queue = new QueueMethods<>();
		System.out.println("Queue empty "+queue.isempty());
		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);
		queue.enQueue(4);
		queue.enQueue(5);
		System.out.println("Queue Length::"+queue.size());
		queue.displayQueue();
		System.out.println();
		System.out.println("An Item deQueued ::"+queue.deQueue());
		System.out.println("Queue Length::"+queue.size());
		System.out.println("------------------------");
		queue.displayQueue();
	}
}