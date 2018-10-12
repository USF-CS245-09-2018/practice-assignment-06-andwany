
public class ArrayStack implements Stack {
	int top = -1;
	Object data[] = new Object[10];

	public void push(Object item) {
		if (top >= data.length-1) {
			growArray();
		}
		data[++top] = item;
	}

	@Override
	public Object pop() {
		return data[top--];
	}

	@Override
	public Object peek() {
		return data[top];
	}

	@Override
	public boolean empty() {
		if (top < 0) {
			return true;
		}
		return false;
	}

	void growArray() {
		Object[] arr = new Object[data.length * 2];
		for (int i = 0; i < data.length; i++) {
			arr[i] = data[i];
		}
		data = arr;
	}
}
