package stack;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		
		Stack<Integer> stk=new Stack<>();
		
		stk.push(5);
		stk.push(10);
		stk.push(15);
		stk.push(20);
		
		System.out.println(stk.peek());
		System.out.println(stk.pop());
		System.out.println(stk.peek());
	}
	

}
