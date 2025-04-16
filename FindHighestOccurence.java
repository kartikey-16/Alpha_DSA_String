package String;

public class FindHighestOccurence {


		public static int findHighestOccurrence(String str){
			//Implement your code here and change the return value accordingly
			
	    	int[] freq =  new int[256];
	    	
	    	for(int  i = 0 ; i  < str.length() ; i++)
	    	{
	    	    freq[str.charAt(i)]++;
	    	}
	    	int max = 0 ; 
	    	for(int count : freq)
	    	{
	    	    if(count > max)
	    	    {
	    	        max =count;
	    	    }
	    	}
	        return  max;
		}
		
		public static void main(String args[]){
		    String str = "Honorificabilitudinitatibus";
		    System.out.println(findHighestOccurrence(str));
		}
	
}
