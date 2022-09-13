package algorithms.methods;

import java.util.Stack;

public class BracketControl {
	
	public void controller(String s) {
		Stack<Character> stack=new Stack<>();
		for (int i=0; i< s.length(); i++) {
			if (s.charAt(i)=='('|| s.charAt(i)=='{' || s.charAt(i)=='[' ) {
				stack.push(s.charAt(i));
				System.out.println(stack.peek());
			}
			else if(s.charAt(i)==')'|| s.charAt(i)=='}' || s.charAt(i)==']' && s.charAt(i)==stack.peek() ) {
				stack.pop();
			}
		}
		if (stack.isEmpty())
			System.out.println("Character is input succesfull");
		else 
			System.out.println("Incorrect character input");
		System.out.println( "Operations completed");
		
	}

}
