package in.leetcode;
import java.util.*;

public class AcronymString {


	private static boolean isAcronym(List<String> list, String s) {
		// TODO Auto-generated method stub
		StringBuilder acronym = new StringBuilder();
		
		for(String s1 : list)
		{
			acronym.append(s1.charAt(0));
		}
		if(s.equals(acronym.toString()))
			return true ; 
		
		return false;
	}

	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("alice");
		list.add("bob");
		list.add("charlie");
		
		String s = "abc";
		
		System.out.println(isAcronym(list ,s));;
	}
}
