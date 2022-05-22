public class QueueMethods<T> {

	private Node<T> front;
	private Node<T> rear;
	private int length;
	
	private static class Node<T> {
		private final T data;
		private Node<T> next;

		public Node(T data) {
			this.data = data;
		}
	}
	//1.Queue is empty return true
	public boolean isempty() {
		if (front == null) {
			return true;
		}
			return false;
		}

	//2.Adding element in Queue
	public void enQueue(T item) {
		if (front == null) {
			rear = new Node<T>(item);
			front = rear;
		} else {
			rear.next = new Node<T>(item);
			rear = rear.next;
		}
		length++;
	}
	
	//3.Deteting the First element in Queue
	public T deQueue() {
		if (front != null) {
			T item = front.data;
			front = front.next;
			length--;
			return item;
		}
		return null;
	}
	
	//4.return the Queue Size 
	public int size() {
		return length;
	}
	
	//5.Disply Queue
	public void displayQueue() {
		Node<T> currentNode = front;
		while (currentNode != null) {
			System.out.print(currentNode.data+" ");
			currentNode = currentNode.next;
		}
	}

}