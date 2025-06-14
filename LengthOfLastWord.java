package in.leetcode;

import java.util.Scanner;

public class LengthOfLastWord {
	
	public int lastWordLength(String s)
	{
		String [] words = s.split(" ");
		String lastWord = words[words.length - 1];
		int length = lastWord.length();
		System.out.println("The last word is: "+ lastWord);
		System.out.println("-----------------------------");
		return length;
		
	}

	public static void main(String [ ] args)
	{
		LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string : ");
		String str = sc.nextLine();
		
		
		System.out.println("======================");
		System.out.println("The length of last word is: " + lengthOfLastWord.lastWordLength(str));
		sc.close();
	}
}
