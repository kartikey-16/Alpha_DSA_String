package in.leetcode;

import java.util.Stack;

public class RemoveAllAdjacentDuplicate {
	
	private static String removeDuplicates(String s) {
		
		Stack<Character> st = new Stack();
		
		for(int i = 0 ; i < s.length() ; i ++)
		{
			char ch = s.charAt(i);
			if(st.isEmpty())
				st.push(ch);
			else if(st.peek() == ch)
				st.pop();
			else
				st.push(ch);
		}
		StringBuilder sb = new StringBuilder();
		while(!st.isEmpty())
		{
			sb.append(st.pop());
		}
		
		return sb.reverse().toString();
	}
	

	public static void main(String[] args) {
		
		String s = "abbaca";
		System.out.println(removeDuplicates(s));
	}

}
