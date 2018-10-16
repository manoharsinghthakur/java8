package lamdaExpression;

import java.util.Optional;

/*public class OptionalClass {

	public static void main(String[] args) {
		try{
		String[] str=new String[10];
		String lowerCase=str[5].toLowerCase();
		//System.out.println(str[5]);
		}
		catch(NullPointerException e){
			System.out.println("null pointer");
		}
	}
}*/ 

public class OptionalClass {

	public static void main(String[] args) {
		String[] str=new String[10];
		str[5]="amar";
		Optional<String> mystr=Optional.ofNullable(str[5]);
		System.out.println(mystr);
		if(mystr.isPresent()){
			String lowercase=str[5].toLowerCase();
			System.out.println("value is="+lowercase);
		}
		
		else{
			System.out.println("value is not present");
		}
		
	}
}
