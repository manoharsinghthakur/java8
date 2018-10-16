package lamdaExpression;

interface A1 {
	default void show(){
		System.out.println("A1 interface");
	}
}

interface B1 {
	default void show(){
		System.out.println("B1 interface");
	} 
}

public class AmbiguityDefault implements A1,B1 {

	public static void main(String[] args) {
		AmbiguityDefault obj=new AmbiguityDefault();
		obj.show();
	}

	@Override
	public void show() {
		System.out.println("overridden");
		A1.super.show();
		B1.super.show();
	}

}
