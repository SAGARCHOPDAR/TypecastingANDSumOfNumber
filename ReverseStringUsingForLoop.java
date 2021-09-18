package java_practice;

public class ReverseStringUsingForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String stringinput="sagar chopdar";
		
		int stringlength=stringinput.length();
		
		for(stringlength=stringinput.length(); stringlength>0; --stringlength) 
		{
			System.out.print(stringinput.charAt(stringlength-1));
		}
		

	}

}
