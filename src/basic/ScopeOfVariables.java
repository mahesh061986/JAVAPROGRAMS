package basic;

public class ScopeOfVariables {
	
	/*Global variables would have default values for example
		int has default value as 0 String has default value as null
			We can access global variables through out the class
	*/
	
	int a;
	String name;
	
	
	void localvariable() {
		String value = "";
		System.out.println(value);
		// we can access name here
	}
	
	void globalvariable() {
		System.out.println(name);
		// we cannot access value here since value is local variable
	}
	
	
	public static void main(String[] args) {
		ScopeOfVariables scope = new ScopeOfVariables();
		scope.globalvariable();
	}
}
