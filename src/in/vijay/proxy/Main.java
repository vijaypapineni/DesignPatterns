package in.vijay.proxy;

public class Main {
	
	public static void main(String args[]) {
		BusinessObject obj = BusinessObjectProxy.create();
		obj.sayHi();		
	}

}
