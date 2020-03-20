package testCases;

public class RemoveFirst2A {

	public String remove(String string) {
		String result=string;
		int n=string.length();
		if(string.charAt(0)=='A'&&string.charAt(1)!='A')
		{
			
			result= ""+string.substring(1,n);
		}
		else if(string.charAt(0)=='A'&&string.charAt(1)=='A') 
		{
			result=""+string.substring(2,n) ;
		}
		if(string.charAt(0)!='A'&&string.charAt(1)=='A')
		{
			
			result= string.charAt(0)+string.substring(2,n);
		}
		
		return result;
	}

}

