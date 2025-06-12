package in.leetcode;

public class ConsecutiveCharacter {
	


	private static int maxPower(String s) {
		// TODO Auto-generated method stub
		int currStreak = 0  , maxStreak = 0;
		
		if(s.length() == 0 || s == null)
			return 0;
		
		for(int i = 1 ; i < s.length() ; i++)
		{
			if(s.charAt(i) == s.charAt(i-1))
			{
				currStreak++;
			}
			else {
				currStreak = 1;
			}
			maxStreak = Math.max(maxStreak, currStreak);
		}
		
		return maxStreak;
		
	}

	public static void main(String[] args) {
		String s = "leetcode";
		System.out.println(maxPower(s));;
	}
}
