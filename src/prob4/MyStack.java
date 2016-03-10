package prob4;

public class MyStack implements Stack {
	
	private int capacity;
	private int count;
	private String[] stack;
	
	public MyStack(int capacity){
		this.capacity = capacity;
		count = 0;
		stack = new String[capacity];
	}

	@Override
	public void push(String str) throws RuntimeException {
		// TODO Auto-generated method stub
		if(count<capacity){
			stack[count] = str;
			count++;
		}
	}

	@Override
	public String pop() throws RuntimeException {
		// TODO Auto-generated method stub
		if(count>0){
			count--;
			return stack[count];
		}
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(count == 0)
			return true;
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return capacity;
	}

}
