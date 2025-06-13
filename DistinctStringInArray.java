package in.leetcode;
import java.util.*;

public class DistinctStringInArray {


	private static String kthDistinct(String[] arr, int key) {
		// TODO Auto-generated method stub
		Map<String , Integer> map = new LinkedHashMap<String , Integer>();
		for(int i = 0 ; i < arr.length; i++)
		{
			if(map.containsKey(arr[i]))
			{
				map.put(arr[i], map.get(arr[i])+1);
			}
			else
			{
				map.put(arr[i], 1);
			}
		}
		List<String> list = new ArrayList<String>();
		for(Map.Entry<String ,Integer>  entry :map.entrySet())
		{
			if(entry.getValue() == 1)
			{
				list.add(entry.getKey());
			}
		}
		if(list.size() < key)
			return "";
		
		return list.get(key-1);
	}

	
	public static void main(String[] args) {
		String[] arr = {"d", "b","c","b","c","a"};
		int key = 2;
		
		System.out.println(kthDistinct(arr , key));;
	}
}
