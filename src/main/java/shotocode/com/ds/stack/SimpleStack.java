/**
 * 
 * ************************************************************
 *  Copyright (c) 2019 Shotocode.com All rights reserved.
 *	
 *  This work is licensed under the terms of the MIT license.  
 *	For a copy, see <https://opensource.org/licenses/MIT>.
 * ************************************************************
 *	
 *  @date Jul 22, 2019
 *  @author Katsum
 */

package shotocode.com.ds.stack;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Stream;

/**
 * The Class SimpleStack.
 */
public class SimpleStack {
	
	private static Stack<Integer> stack = new Stack<Integer>();

	public static void push() {
		for(int i = 0; i < 10; i++)
			stack.push(i);
	}
	
	public static void pop() {
		System.out.println("Stack pop is :"+stack.pop());
	}
	
	public static void peek() {
		System.out.println("Stack peek is: "+stack.peek());
	}
	
	public static void isEmpty() {
		System.out.println("Is stack empty ? "+((stack.isEmpty())?"Yes":"No"));
	}
	
	public static void display() {
		System.out.println("============ Using loop =========");
		for(Integer item: stack)
			System.out.println(item);
		
		System.out.println("============ Arrays.toString =========");
		System.out.println(Arrays.toString(stack.toArray()));
		
		System.out.println("============ Java 8: using lambda =========");
		stack.stream().forEach(i -> System.out.println(i));
		
		System.out.println("============ Java 8: using method reference =========");
		stack.stream().forEach(System.out::println);
		
		System.out.println("============ Java 8: using Strea.of+toArray+forEach =========");
		Stream.of(stack.toArray()).forEach(System.out::println);
		
		System.out.println("============ Java 8: using inherent forEach =========");
		stack.forEach(System.out::println);
		
		System.out.println("============ Java 8: using iterator =========");
		stack.iterator().forEachRemaining(System.out::println);
	}
	
	public static void main(String args[]) {
		push();
		isEmpty();
		peek();
		pop();
		peek();
		display();
		
		
	}

}
