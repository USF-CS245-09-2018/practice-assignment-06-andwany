
public class ArrayQueue implements Queue {
	int front = 0;
	int rear = 0;
	Object data[] = new Object[10];

	void growArray() {
		Object[] arr = new Object[data.length * 2];
		for (int i = 0; i < data.length; i++) {
			arr[i] = data[i];
		}
		data = arr;
	}

	@Override
	public Object dequeue() {
		return data[front++];
	}

	@Override
	public void enqueue(Object item) {
		if (rear >= data.length) {
			growArray();
		}
		data[rear++] = item;
	}

	@Override
	public boolean empty() {
		return front == rear;
	}

}
