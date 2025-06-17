package in.leetcode;

public class MakeAlternatingBinaryString {


	private static int minOperation(String s) {
		// TODO Auto-generated method stub
		int startWith1 = 0, startWith0 =0 ;
		for(int  i = 0 ; i < s.length() ; i ++)
		{
			if( i % 2 == 0)
			{
				if(s.charAt(i)  == '0')
				{
					startWith1++;
				}
				else
				{
					startWith0++;
				}
			}
			else
			{
				if(s.charAt(i)  == '1')
				{
					startWith0++;
				}
				else
				{
					startWith1++;
				}
			}
		}
		
		return Math.min(startWith1, startWith0);
		
	}
	
	public static void main(String[] args) {
		String s = "0100";
		System.out.println(minOperation(s)	);;
	}

}
