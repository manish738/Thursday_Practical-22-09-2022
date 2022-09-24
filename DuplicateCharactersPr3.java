import java.util.HashMap;  
import java.util.Map;  
import java.util.Set; 

public class DuplicateCharactersPr3 
{

	 public void findIt(String str) 
	 {  
	        Map<Character, Integer> baseMap = new HashMap<Character, Integer>();  
	        char[] charArray = str.toCharArray();  
	        
	        for (Character ch : charArray) 
	        {  
	            if (baseMap.containsKey(ch))
	            {  
	                baseMap.put(ch, baseMap.get(ch) + 1);  
	            } 
	            else 
	            {  
	                baseMap.put(ch, 1);  
	            }  
	        }  
	        
	        Set<Character> keys = baseMap.keySet();  
	        
	        for (Character ch : keys) 
	        {  
	        
	        	if (baseMap.get(ch) > 1) 
	        	{  
	                System.out.println(ch + "  this character is " + baseMap.get(ch) + " times used.");  
	            }  
	        }  
	}  
	   
	    public static void main(String a[]) 
	    {  
	    	DuplicateCharactersPr3 dcf = new DuplicateCharactersPr3();  
	        dcf.findIt("do not cross");  
	    }  
 }  
