package String;

import java.util.Scanner;

public class LongestSubString {


	private static int isLongestSubString(String str) {
		// TODO Auto-generated method stub
		int count = 1;
		char ch = str.charAt(0);
		//System.out.println(ch);
		for(int i = 1 ; i< str.length() ; i++)
		{
			//System.out.println(str.charAt(i));
			
			// if first character is equal to the current character then it return the number of counts....
			if(ch == str.charAt(i)) {
				return count;
			}
			count++;
		}
		
		return 1;
	}
	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.next();
		int count = isLongestSubString(str);
		System.out.println("the longest substring count without repeatind a character: "+count);
	}

}
