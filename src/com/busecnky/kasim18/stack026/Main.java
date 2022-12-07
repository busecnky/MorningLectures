package com.busecnky.kasim18.stack026;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
	
		Stack<String> stack = new Stack<String>();  // içinde synchronized metodlar bulunur, Vector gibi threadlerle kullanılabilir.

		stack.add("Kedi");
		stack.add("Köpek");
		stack.add("Aslan");
		stack.add("Kuş");
		
		for(String s : stack) {
			System.out.println(s);
		}
		
		
		// LIFO mantığını anlayalım:
		// 
		// stack'e son giren elemanı getir metodu : peek()
		System.out.println();
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		
		// stack'e son giren elemanı çıkar metodu: pop()
		System.out.println("\n----------\n");
		String str = stack.pop();
		System.out.println(str);
		
		System.out.println(stack.pop());
		
		// Stack boşmu kontrpolü : isEmpty()
		System.out.println("Stack boşmu : " + stack.isEmpty());
		stack.pop();
		stack.pop();
		System.out.println("Stack boşmu : " + stack.isEmpty());			
		
	}

}
