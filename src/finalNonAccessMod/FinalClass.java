package finalNonAccessMod;

//Class as final

  public class FinalClass {
	
	
	//Can be used before class, method and data
	//can't do modification 
	 
	 //var as final 
	final String name = "ramesh";
	
	
	public void ChangeName(String newName)
	{
//		this.name= newName;    name is final can't reinitialize
	
	}
	
	
	// method as final
	
	 final public void name() {
		System.out.println("ramesh");
	}
	public static void main(String[] args) {
		
		FinalClass obj = new FinalClass();
		System.out.println(obj.name);
	
	}

}
