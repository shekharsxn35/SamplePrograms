
public class MinStackExample {

	public static void main(String[] args) {

		MinStack stack = new MinStack();
		stack.push(12);
		stack.push(10);
		stack.push(23);
		stack.push(19);

		System.out.println(stack.top());

		stack.pop();

		System.out.println(stack.top());

		System.out.println(stack.min());

	}
}

class Elem {
	int value;
	int min;
	Elem next;

	Elem(int value, int min) {
		this.value = value;
		this.min = min;
	}
}

class MinStack {

	Elem top;

	public MinStack() {
	}

	public void push(int x) {
		if (top == null) {
			top = new Elem(x, x);
		} else {
			Elem e = new Elem(x, Math.min(x, top.min));
			e.next = top;
			top = e;
		}
	}

	public void pop() {
		if (top == null) {
			return;
		}
		Elem e = top.next;
		e.next = null;
		top = e;
	}

	public int top() {
		if (top == null) {
			return -1;
		} else {
			return top.value;
		}
	}

	public int min() {
		if (top == null) {
			return -1;
		} else {
			return top.min;
		}
	}

}
