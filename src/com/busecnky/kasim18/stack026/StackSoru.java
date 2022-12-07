package com.busecnky.kasim18.stack026;

import java.util.Stack;

public class StackSoru {

	public static void main(String[] args) {
		
		// Düzgün Parantezler Problemi 
		/* 
		 * Given a string s containing just the characters '(', ')', '{', '}', '[' and
		 * ']', determine if the input string is valid.
		 * 
		 * An input string is valid if:
		 * 
		 * Open brackets must be closed by the same type of brackets. Open brackets must
		 * be closed in the correct order. Constraints s consists of parentheses only
		 * '()[]{}'.
		 * 
		 * Example 1: Input: s = "()" Output: true
		 * 
		 * Example 2: Input: s = "()[]{}" Output: true
		 * 
		 * Example 3: Input: s = "(]" Output: false
		 * 
		 * Example 4: Input: s = "([)]" Output: false
		 * 
		 * Example 5: Input: s = "{[]}" Output: true
		 * 
		 * Note: In this question, we need to deal with only 6 symbols — (, ), {, }, [,
		 * ]. We will be given a string containing only these symbols.
		 */				
		System.out.println(isValid("([)]"));		// ( [ { : sol parantez           ) ] } : Sağ parantez 
		System.out.println(isValid("[(((((((()))"));
		System.out.println(isValid("()[]{}"));
		System.out.println(isValid("(]"));
		System.out.println(isValid("{[]}"));
	}
	
	public static boolean isValid(String s)
	{
	    Stack<Character> solParantezStack = new Stack<Character>();
		
	    // Loop for the string s
	    for (int i=0; i<s.length();i++)
	    {
	    	char c = s.charAt(i);
	    	
	    	// Eğer sol parantez ile karşılaşılırsa:
	    	if (c == '(' || c == '[' || c== '{' ) 
	    	{
	    		solParantezStack.push(c);
	    	}
	    	// Eğer sağ parantezler ile karşılaşılırsa:
	    	else if (c == ')' && !solParantezStack.isEmpty() && solParantezStack.peek() == '(') 
	    	{
	    		solParantezStack.pop();
	    	}
	    	else if (c == ']' && !solParantezStack.isEmpty() && solParantezStack.peek() == '[') 
	    	{
	    		solParantezStack.pop();
	    	}
	    	else if (c == '}' && !solParantezStack.isEmpty() && solParantezStack.peek() == '{') 
	    	{
	    		solParantezStack.pop();
	    	}
	    	// ([{)]} dışında bir şey geldiyse ve valid durumlar dışında bir durumla karşılaşılırsa:
	    	else 
	    	{
	    		return false;
	    	}	    		    	
	    }   
	    return solParantezStack.isEmpty();   // [(((((((())) sola parantez açık kaldıysa bu durumda da false return edili yani valid değildir. 
		
	}

}
