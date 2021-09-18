package java_practice;

public class ReverseStringUsingCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String stringinput="independent";
		
		//convert String to character Array by using to char array
		
		char[] resultarray = stringinput.toCharArray();
		
		for(int i=resultarray.length-1; i>=0; i--) 
		{
			System.out.print(resultarray[i]);
		}

	}

}
