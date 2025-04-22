package String;

public class MoveSpecialCharacter {

	    
	    public static String moveSpecialCharacters(String str){
			//Implement your code here and change the return value accordingly
			String letter = "" , specialChar = "";
			
			for(int i = 0 ; i < str.length() ; i++)
			{
			    char ch = str.charAt(i);
			    if(Character.isLetterOrDigit(ch))
			    {
			        letter += ch;
			    }
			    else
			    {
			        specialChar += ch;
			    }
			}
	        return letter+specialChar;
		}
		
		public static void main(String args[]){
		    String str = "He@#$llo!*&";
		    System.out.println(moveSpecialCharacters(str));
		}
		

}
