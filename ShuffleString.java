package in.leetcode;

public class ShuffleString {
	
	private static String restoreString(String s, int[] indices) {
		// TODO Auto-generated method stub\
		if(s == null || s.length() == 0)
			return "";
		
		if(s.length() != indices.length)
			return "";
		
		
		char[] ch = new char[s.length()];
		for(int i = 0 ; i < indices.length ;  i++)
		{
//			int pos = indices[i];
//			ch[pos] = s.charAt(i);
			ch[indices[i]] = s.charAt(i);
		}
		
		String result = "";
		for(int i = 0 ; i < ch.length ;  i++)
		{
			result  += ch[i];
		}
		
		
		return result ;
		
		
	}
	
	public static void main(String[] args) {
		
		String s = "codeleet";
		int[] indices = {4,5,6,7,0,2,1,3};
		
		System.out.println(restoreString(s, indices));
	}
}
