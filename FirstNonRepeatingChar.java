package String;

import java.util.*;
import java.util.Scanner;

public class FirstNonRepeatingChar {


	private static Character firstNonRepeatingChar(String str) {
		// TODO Auto-generated method stub
		Map<Character, Integer> map = new HashMap<>();
		for(int i = 0 ; i < str.length() ; i++)
		{
			char ch = str.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		for(Character c : str.toCharArray())
		{
			if(map.get(c) == 1)
				return c;
		}
		return null;
	
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.next();
		//firstNonRepeatingChar(str);
		System.out.print(firstNonRepeatingChar(str));
	}

}
