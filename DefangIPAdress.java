package in.leetcode;

public class DefangIPAdress {


	private static String defanfIPAdress(String address) {
		// TODO Auto-generated method stub
		
		char[] chars = address.toCharArray();
		StringBuilder sb  = new StringBuilder();
		
		for(char ch : chars)
		{
			if(ch == '.')
				sb.append("[.]");
			else
				sb.append(ch);
		}
		
		return sb.toString();
	}

	public static void main(String[] args) {
		String address = "1.1.1.1";
		System.out.println(defanfIPAdress(address));;
	}
}
