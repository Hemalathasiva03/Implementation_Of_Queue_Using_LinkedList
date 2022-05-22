public class QueueMain {

	public static void main(String[] args) {
		
		QueueMethods<Integer>  obj = new QueueMethods<>();
		System.out.println("Queue empty "+obj.isempty());
		obj.enQueue(1);
		obj.enQueue(2);
		obj.enQueue(3);
		obj.enQueue(4);
		obj.enQueue(5);
		System.out.println("Queue Length::"+obj.size());
		obj.displayQueue();
		System.out.println();
		System.out.println("An Item deQueued ::"+obj.deQueue());
		System.out.println("Queue Length::"+obj.size());
		System.out.println("------------------------");
		obj.displayQueue();
	}
}
