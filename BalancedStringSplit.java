package String;

public class BalancedStringSplit {
	
	
	private static int balancedStringSplit(String s) {
		
		int count = 0 ;
		int left = 0; 
		int right = 0;
		
		for(int i = 0 ; i < s.length() ; i++)
		{
			if(s.charAt(i) == 'R')
				right++;
			else
				left++;
			
			if(left == right)
				count++;
		}
		
		return count;
	}
	
	
	public static void main(String[] args) {
		String s = "RLRRLLRLRL";
		System.out.println(balancedStringSplit(s));
	}

	

}
