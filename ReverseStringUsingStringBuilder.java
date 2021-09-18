package java_practice;

public class ReverseStringUsingStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="independent";
		
		//creating string builder object
		
		StringBuilder stringbuildervariable= new StringBuilder();
		
		stringbuildervariable.append(input);
		
		stringbuildervariable.reverse();
		
		System.out.println("reverse String :"+stringbuildervariable);
	}

}
