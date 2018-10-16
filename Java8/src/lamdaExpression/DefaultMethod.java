package lamdaExpression;
@FunctionalInterface
interface A {
	public void show();
	
	static void showme(){
		System.out.println("static method()");
	}
	default String messageShow(String message){
		System.out.println("message is "+message);
		return message;
	} 
}
public class DefaultMethod implements A  {
	

	static void showme(){
		System.out.println("sss static method()");
	}
	public static void main(String[] args) {

       A a1=()-> {
    	   System.out.println("lambda expression");
    	   //A.showme();
       };
       a1.messageShow("hello");
       A.showme();
       showme();
       a1.show();
       
       DefaultMethod d=new DefaultMethod();
       d.messageShow("");
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

}
