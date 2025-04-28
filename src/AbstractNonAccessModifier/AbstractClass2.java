package AbstractNonAccessModifier;

public class AbstractClass2  extends AbstractClass1{

	public static void main(String[] args) {
		AbstractClass2 obj = new AbstractClass2();
		obj.mTwo();
		obj.mOne();
		
	}
	public void  mOne() {
		System.out.println("Implemented mOne method");
	}
	

}
